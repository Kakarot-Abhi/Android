package com.imdb.csvparser.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Device {

    public String demoField;
    //    ro.product.name, ro.product.model and ro.product.device
//    @JsonProperty("ro.product.model")
//    private String model;
//
//    @JsonProperty("ro.product.device")
//    private String device;
//
//    @JsonProperty("ro.product.name")
//    private String name;

    @JsonProperty("dalvik.vm.appimageformat")
    private String appimageformat;

    @JsonProperty("dalvik.vm.dex2oat-Xms")
    private String dex2oat_Xms;

    @JsonProperty("dalvik.vm.dex2oat-Xmx")
    private String dex2oat_Xmx;

    @JsonProperty("dalvik.vm.heapsize")
    private String heapsize;

    @JsonProperty("dalvik.vm.image-dex2oat-Xms")
    private String image_dex2oat_Xms;

    @JsonProperty("dalvik.vm.image-dex2oat-Xmx")
    private String image_dex2oat_Xmx;

    @JsonProperty("dalvik.vm.isa.x86.features")
    private String x86_features;

    @JsonProperty("dalvik.vm.isa.x86.variant")
    private String x86_variant;

    @JsonProperty("dalvik.vm.stack-trace-file")
    private String stack_trace_file;

    @JsonProperty("dalvik.vm.usejit")
    private String usejit;

    @JsonProperty("dalvik.vm.usejitprofiles")
    private String usejitprofiles;

    @JsonProperty("debug.atrace.tags.enableflags")
    private String tags;

    @JsonProperty("debug.force_rtl")
    private String force_rtl;

    @JsonProperty("dev.bootcomplete")
    private String bootcomplete;

    @JsonProperty("gsm.current.phone-type")
    private String gsm_phone_type;

    @JsonProperty("gsm.defaultpdpcontext.active")
    private String active;

    @JsonProperty("gsm.network.type")
    private String type;

    @JsonProperty("gsm.nitz.time")
    private String time;

    @JsonProperty("gsm.operator.alpha")
    private String alpha;

    @JsonProperty("gsm.operator.iso-country")
    private String iso_country;

    @JsonProperty("gsm.operator.isroaming")
    private String isroaming;

    @JsonProperty("gsm.operator.numeric")
    private String numeric;

    @JsonProperty("gsm.sim.operator.alpha")
    private String operator;

    @JsonProperty("gsm.sim.operator.iso-country")
    private String operator_iso_country;

    @JsonProperty("gsm.sim.operator.numeric")
    private String operator_numeric;

    @JsonProperty("gsm.sim.state")
    private String state;

    @JsonProperty("gsm.version.ril-impl")
    private String ril_impl;

    @JsonProperty("init.svc.adbd")
    private String adbd;

    @JsonProperty("init.svc.audioserver")
    private String audioserver;

    @JsonProperty("init.svc.bootanim")
    private String bootanim;

    @JsonProperty("init.svc.cameraserver")
    private String cameraserver;

    @JsonProperty("init.svc.clear-bcb")
    private String clear_bcb;

    @JsonProperty("init.svc.debuggerd")
    private String debuggerd;

    @JsonProperty("init.svc.dhcpclient_rtr")
    private String dhcpclient_rtr;

    @JsonProperty("init.svc.dhcpserver")
    private String dhcpserver;

    @JsonProperty("init.svc.drm")
    private String drm;

    @JsonProperty("init.svc.emu_hostapd")
    private String emu_hostapd;

    @JsonProperty("init.svc.fingerprintd")
    private String fingerprintd;

    @JsonProperty("init.svc.gatekeeperd")
    private String gatekeeperd;

    @JsonProperty("init.svc.goldfish-logcat")
    private String goldfish_logcat;

    @JsonProperty("init.svc.healthd")
    private String healthd;

    @JsonProperty("init.svc.installd")
    private String installd;

    @JsonProperty("init.svc.ipv6proxy")
    private String ipv6proxy;

    @JsonProperty("init.svc.keystore")
    private String keystore;

    @JsonProperty("init.svc.lmkd")
    private String lmkd;

    @JsonProperty("init.svc.logd")
    private String logd;

    @JsonProperty("init.svc.logd-reinit")
    private String logd_reinit;

    @JsonProperty("init.svc.media")
    private String media;

    @JsonProperty("init.svc.mediacodec")
    private String mediacodec;

    @JsonProperty("init.svc.mediadrm")
    private String mediadrm;

    @JsonProperty("init.svc.mediaextractor")
    private String mediaextractor;

    @JsonProperty("init.svc.netd")
    private String netd;

    @JsonProperty("init.svc.qemu-props")
    private String qemu_props;

    @JsonProperty("init.svc.ranchu-net")
    private String ranchu_net;

    @JsonProperty("init.svc.ranchu-setup")
    private String ranchu_setup;

    @JsonProperty("init.svc.ril-daemon")
    private String ril_daemon;

    @JsonProperty("init.svc.servicemanager")
    private String servicemanager;

    @JsonProperty("init.svc.surfaceflinger")
    private String surfaceflinger;

    @JsonProperty("init.svc.ueventd")
    private String ueventd;

    @JsonProperty("init.svc.vold")
    private String vold;

    @JsonProperty("init.svc.wpa_supplicant")
    private String wpa_supplicant;

    @JsonProperty("init.svc.zygote")
    private String zygote;

    @JsonProperty("net.bt.name")
    private String net_bt_name;

    @JsonProperty("net.change")
    private String net_change;

    @JsonProperty("net.dns1")
    private String net_dns1;

    @JsonProperty("net.eth0.dns1")
    private String eth0_dns1;

    @JsonProperty("net.eth0.dns2")
    private String eth0_dns2;

    @JsonProperty("net.eth0.dns3")
    private String eth0_dns3;

    @JsonProperty("net.eth0.dns4")
    private String eth0_dns4;

    @JsonProperty("net.eth0.gw")
    private String eth0_gw;

    @JsonProperty("net.hostname")
    private String net_hostname;

    @JsonProperty("net.qtaguid_enabled")
    private String qtaguid_enabled;

    @JsonProperty("net.tcp.default_init_rwnd")
    private String default_init_rwnd;

    @JsonProperty("persist.adb.notify")
    private String notify;

    @JsonProperty("persist.sys.dalvik.vm.lib.2")
    private String dalvik;

    @JsonProperty("persist.sys.gps.lpp")
    private String gps;

    @JsonProperty("persist.sys.profiler_ms")
    private String profiler_ms;

    @JsonProperty("persist.sys.timezone")
    private String timezone;

    @JsonProperty("persist.sys.usb.config")
    private String usb;

    @JsonProperty("persist.sys.webview.vmsize")
    private String webview;

    @JsonProperty("pm.dexopt.ab-ota")
    private String ab_ota;

    @JsonProperty("pm.dexopt.bg-dexopt")
    private String bg_dexopt;

    @JsonProperty("pm.dexopt.boot")
    private String boot;

    @JsonProperty("pm.dexopt.core-app")
    private String core_app;

    @JsonProperty("pm.dexopt.first-boot")
    private String first_boot;

    @JsonProperty("pm.dexopt.forced-dexopt")
    private String forced_dexopt;

    @JsonProperty("pm.dexopt.install")
    private String install;

    @JsonProperty("pm.dexopt.nsys-library")
    private String nsys_library;

    @JsonProperty("pm.dexopt.shared-apk")
    private String shared_apk;

    @JsonProperty("qemu.adb.secure")
    private String secure;

    @JsonProperty("qemu.gles")
    private String gles;

    @JsonProperty("qemu.hw.mainkeys")
    private String mainkeys;

    @JsonProperty("qemu.logcat")
    private String logcat;

    @JsonProperty("qemu.sf.fake_camera")
    private String fake_camera;

    @JsonProperty("qemu.sf.lcd_density")
    private String lcd_density;

    @JsonProperty("qemu.timezone")
    private String qemu_timezone;

    @JsonProperty("rild.libargs")
    private String libargs;

    @JsonProperty("rild.libpath")
    private String libpath;

    @JsonProperty("ro.adb.secure")
    private String adb_secure;

    @JsonProperty("ro.allow.mock.location")
    private String mock;

    @JsonProperty("ro.baseband")
    private String baseband;

    @JsonProperty("ro.board.platform")
    private String platform;

    @JsonProperty("ro.boot.android_dt_dir")
    private String android_dt_dir;

    @JsonProperty("ro.boot.hardware")
    private String hardware;

    @JsonProperty("ro.boot.serialno")
    private String serialno;

    @JsonProperty("ro.bootimage.build.date")
    private String build_date;

    @JsonProperty("ro.bootimage.build.date.utc")
    private String build_date_utc;

    @JsonProperty("ro.bootimage.build.fingerprint")
    private String build_fingerprint;

    @JsonProperty("ro.bootloader")
    private String bootloader;

    @JsonProperty("ro.bootmode")
    private String ro_bootmode;

    @JsonProperty("ro.build.characteristics")
    private String characteristics;

    @JsonProperty("ro.build.date")
    private String ro_build_date;

    @JsonProperty("ro.build.date.utc")
    private String ro_build_date_utc;

    @JsonProperty("ro.build.description")
    private String description;

    @JsonProperty("ro.build.display.id")
    private String display;

    @JsonProperty("ro.build.fingerprint")
    private String fingerprint;

    @JsonProperty("ro.build.flavor")
    private String flavor;

    @JsonProperty("ro.build.host")
    private String host;

    @JsonProperty("ro.build.id")
    private String id;

    @JsonProperty("ro.build.product")
    private String product;

    @JsonProperty("ro.build.tags")
    private String build_tags;

    @JsonProperty("ro.build.type")
    private String build_type;

    @JsonProperty("ro.build.user")
    private String user;

    @JsonProperty("ro.build.version.all_codenames")
    private String version_all_codenames;

    @JsonProperty("ro.build.version.base_os")
    private String version_base_os;

    @JsonProperty("ro.build.version.codename")
    private String version_codename;

    @JsonProperty("ro.build.version.incremental")
    private String version_incremental;

    @JsonProperty("ro.build.version.preview_sdk")
    private String version_preview_sdk;

    @JsonProperty("ro.build.version.release")
    private String version_release;

    @JsonProperty("ro.build.version.sdk")
    private String version_sdk;

    @JsonProperty("ro.build.version.security_patch")
    private String version_security_patch;

    @JsonProperty("ro.com.google.locationfeatures")
    private String google_locationfeatures;

    @JsonProperty("ro.config.alarm_alert")
    private String alarm_alert;

    @JsonProperty("ro.config.notification_sound")
    private String notification_sound;

    @JsonProperty("ro.crypto.fs_crypto_blkdev")
    private String fs_crypto_blkdev;

    @JsonProperty("ro.crypto.state")
    private String ro_crypto_state;

    @JsonProperty("ro.crypto.type")
    private String ro_crypto_type;

    @JsonProperty("ro.dalvik.vm.native.bridge")
    private String ro_dalvik_vm_native_bridge;

    @JsonProperty("ro.debuggable")
    private String ro_debuggable;

    @JsonProperty("ro.hardware")
    private String ro_hardware;

    @JsonProperty("ro.hardware.audio.primary")
    private String audio;

    @JsonProperty("ro.hwui.drop_shadow_cache_size")
    private String drop_shadow_cache_size;

    @JsonProperty("ro.hwui.gradient_cache_size")
    private String gradient_cache_size;

    @JsonProperty("ro.hwui.layer_cache_size")
    private String layer_cache_size;

    @JsonProperty("ro.hwui.path_cache_size")
    private String path_cache_size;

    @JsonProperty("ro.hwui.r_buffer_cache_size")
    private String r_buffer_cache_size;

    @JsonProperty("ro.hwui.text_large_cache_height")
    private String text_large_cache_height;

    @JsonProperty("ro.hwui.text_large_cache_width")
    private String text_large_cache_width;

    @JsonProperty("ro.hwui.text_small_cache_height")
    private String text_small_cache_height;

    @JsonProperty("ro.hwui.text_small_cache_width")
    private String text_small_cache_width;

    @JsonProperty("ro.hwui.texture_cache_flushrate")
    private String texture_cache_flushrate;

    @JsonProperty("ro.hwui.texture_cache_size")
    private String texture_cache_size;

    @JsonProperty("ro.kernel.android.qemud")
    private String android;

    @JsonProperty("ro.kernel.androidboot.hardware")
    private String androidboot;

    @JsonProperty("ro.kernel.androidboot.serialno")
    private String ro_kernel_androidboot_serialno;

    @JsonProperty("ro.kernel.clocksource")
    private String clocksource;

    @JsonProperty("ro.kernel.cma")
    private String cma;

    @JsonProperty("ro.kernel.console")
    private String console;

    @JsonProperty("ro.kernel.loop.max_part")
    private String loop;

    @JsonProperty("ro.kernel.mac80211_hwsim.radios")
    private String mac80211_hwsim;

    @JsonProperty("ro.kernel.memmap")
    private String memmap;

    @JsonProperty("ro.kernel.ndns")
    private String ro_kernel_ndns;

    @JsonProperty("ro.kernel.printk.devkmsg")
    private String ro_kernel_printk_devkmsg;

    @JsonProperty("ro.kernel.qemu")
    private String ro_kernel_qemu;

    @JsonProperty("ro.kernel.qemu.avd_name")
    private String ro_kernel_qemu_avd_name;

    @JsonProperty("ro.kernel.qemu.encrypt")
    private String ro_kernel_qemu_encrypt;

    @JsonProperty("ro.kernel.qemu.gles")
    private String ro_kernel_qemu_gles;

    @JsonProperty("ro.kernel.qemu.gltransport")
    private String ro_kernel_qemu_gltransport;

    @JsonProperty("ro.kernel.qemu.opengles.version")
    private String ro_kernel_qemu_opengles_version;

    @JsonProperty("ro.kernel.qemu.vsync")
    private String ro_kernel_qemu_vsync;

    @JsonProperty("ro.kernel.qemu.wifi")
    private String ro_kernel_qemu_wifi;

    @JsonProperty("ro.kernel.ramoops.mem_address")
    private String ro_kernel_ramoops_mem_address;

    @JsonProperty("ro.kernel.ramoops.mem_size")
    private String ro_kernel_ramoops_mem_size;

    @JsonProperty("ro.product.board")
    private String ro_product_board;

    @JsonProperty("ro.product.brand")
    private String ro_product_brand;

    @JsonProperty("ro.product.cpu.abi")
    private String ro_product_cpu_abi;

    @JsonProperty("ro.product.cpu.abilist")
    private String ro_product_cpu_abilist;

    @JsonProperty("ro.product.cpu.abilist32")
    private String ro_product_cpu_abilist32;

    @JsonProperty("ro.product.cpu.abilist64")
    private String ro_product_cpu_abilist64;

    @JsonProperty("ro.product.device")
    private String ro_product_device;

    @JsonProperty("ro.product.locale")
    private String locale;

    @JsonProperty("ro.product.manufacturer")
    private String manufacturer;

    @JsonProperty("ro.product.model")
    private String ro_product_model;

    @JsonProperty("ro.product.name")
    private String ro_product_name;

    @JsonProperty("ro.qemu.initrc")
    private String initrc;

    @JsonProperty("ro.radio.use-ppp")
    private String ro_radio_use_ppp;

    @JsonProperty("ro.revision")
    private String ro_revision;

    @JsonProperty("ro.runtime.firstboot")
    private String ro_runtime_firstboot;

    @JsonProperty("ro.secure")
    private String ro_secure;

    @JsonProperty("ro.serialno")
    private String ro_serialno;

    @JsonProperty("ro.setupwizard.mode")
    private String ro_setupwizard_mode;

    @JsonProperty("ro.wifi.channels")
    private String ro_wifi_channels;

    @JsonProperty("ro.zygote")
    private String ro_zygote;

    @JsonProperty("security.perf_harden")
    private String security_perf_harden;

    @JsonProperty("selinux.reload_policy")
    private String selinux_reload_policy;

    @JsonProperty("service.bootanim.exit")
    private String exit;

    @JsonProperty("status.battery.level")
    private String level;

    @JsonProperty("status.battery.level_raw")
    private String level_raw;

    @JsonProperty("status.battery.level_scale")
    private String level_scale;

    @JsonProperty("status.battery.state")
    private String status_battery_state;

    @JsonProperty("sys.boot_completed")
    private String sys_boot_completed;

    @JsonProperty("sys.sysctl.extra_free_kbytes")
    private String sys_sysctl_extra_free_kbytes;

    @JsonProperty("sys.sysctl.tcp_def_init_rwnd")
    private String sys_sysctl_tcp_def_init_rwnd;

    @JsonProperty("sys.usb.config")
    private String sys_usb_config;

    @JsonProperty("sys.usb.configfs")
    private String sys_usb_configfs;

    @JsonProperty("sys.usb.state")
    private String sys_usb_state;

    @JsonProperty("vold.decrypt")
    private String vold_decrypt;

    @JsonProperty("vold.has_adoptable")
    private String vold_has_adoptable;

    @JsonProperty("vold.post_fs_data_done")
    private String vold_post_fs_data_done;

    @JsonProperty("wifi.interface")
    private String wifi_interface;

    @JsonProperty("wlan.driver.status")
    private String status;
}
