package com.imdb.csvparser.model;

import com.imdb.csvparser.constant.CustomMethod;
import com.imdb.csvparser.constant.Help;
import org.springframework.beans.factory.annotation.Value;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class CustomDesirealizer {

    class HelpException extends RuntimeException{
        public HelpException(){
            super("No Help annotation present for filed");
        }
    }



    public <T> T annotationDemo(Class<T> objectClass) throws InstantiationException, IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException {
        T instance = objectClass.newInstance();


        Field demoField = objectClass.getDeclaredField("demoField");

        if( !demoField.isAnnotationPresent(Help.class))
        {
            throw new HelpException();
        }


        Help annotation = demoField.getAnnotation(Help.class);
        String annotaionValue = annotation.mishra();

        demoField.set(instance, annotaionValue);

        Method addMethod = objectClass.getDeclaredMethod("add", int.class, int.class);

        CustomMethod methodAnnotation = addMethod.getAnnotation(CustomMethod.class);

        int a = methodAnnotation.a();
        int b = methodAnnotation.b();

        addMethod.invoke(instance, a, b);

        return instance;

    }

    public void mapValuesToObj(Properties properties, Class<? extends Object> cllass) throws InvocationTargetException, IllegalAccessException {
        Field[] declaredFields = cllass.getDeclaredFields();

//        ObjectMapper
        for (Field field : declaredFields) {
            if(!field.isAnnotationPresent(Value.class)) continue;
            field.setAccessible(true);
            Annotation[] declaredAnnotations = field.getDeclaredAnnotations();
            Annotation declaredAnnotation = declaredAnnotations[0];

//            _______________________



            Class<? extends Annotation> type = declaredAnnotation.annotationType(); ///value.class




            Method[] declaredMethods = type.getDeclaredMethods();
            for (Method method:
                 declaredMethods) {
                Object invoke = method.invoke(declaredAnnotation, (Object[]) null);
//                @Value("frame")
                String name;
//                new Device().;


//                                                    value                frame
                System.out.println("Value: " + method.getName() + " : "+ invoke);
            }
//            AnnotatedType annotatedType = field.getAnnotatedType();//.getType().getTypeName();
        }
    }
}
