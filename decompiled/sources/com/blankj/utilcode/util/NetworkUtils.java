package com.blankj.utilcode.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.text.format.Formatter;
import com.blankj.utilcode.util.E0;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.InterfaceAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public final class NetworkUtils {

    /* renamed from: a, reason: collision with root package name */
    private static final long f24843a = 3000;

    /* renamed from: b, reason: collision with root package name */
    private static final Set<E0.b<l>> f24844b = new CopyOnWriteArraySet();

    /* renamed from: c, reason: collision with root package name */
    private static Timer f24845c;

    /* renamed from: d, reason: collision with root package name */
    private static l f24846d;

    /* loaded from: classes.dex */
    public enum NetworkType {
        NETWORK_ETHERNET,
        NETWORK_WIFI,
        NETWORK_5G,
        NETWORK_4G,
        NETWORK_3G,
        NETWORK_2G,
        NETWORK_UNKNOWN,
        NETWORK_NO
    }

    /* loaded from: classes.dex */
    class a extends E0.f<Boolean> {
        a(E0.b bVar) {
            super(bVar);
        }

        @Override // com.blankj.utilcode.util.y0.g
        @androidx.annotation.Y("android.permission.INTERNET")
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public Boolean f() {
            return Boolean.valueOf(NetworkUtils.A());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends E0.f<Boolean> {

        /* renamed from: T, reason: collision with root package name */
        final /* synthetic */ String f24847T;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(E0.b bVar, String str) {
            super(bVar);
            this.f24847T = str;
        }

        @Override // com.blankj.utilcode.util.y0.g
        @androidx.annotation.Y("android.permission.INTERNET")
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public Boolean f() {
            return Boolean.valueOf(NetworkUtils.H(this.f24847T));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c extends E0.f<Boolean> {

        /* renamed from: T, reason: collision with root package name */
        final /* synthetic */ String f24848T;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(E0.b bVar, String str) {
            super(bVar);
            this.f24848T = str;
        }

        @Override // com.blankj.utilcode.util.y0.g
        @androidx.annotation.Y("android.permission.INTERNET")
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public Boolean f() {
            return Boolean.valueOf(NetworkUtils.D(this.f24848T));
        }
    }

    /* loaded from: classes.dex */
    class d extends E0.f<Boolean> {
        d(E0.b bVar) {
            super(bVar);
        }

        @Override // com.blankj.utilcode.util.y0.g
        @androidx.annotation.Y(allOf = {"android.permission.ACCESS_WIFI_STATE", "android.permission.INTERNET"})
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public Boolean f() {
            return Boolean.valueOf(NetworkUtils.S());
        }
    }

    /* loaded from: classes.dex */
    class e extends E0.f<String> {

        /* renamed from: T, reason: collision with root package name */
        final /* synthetic */ boolean f24849T;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(E0.b bVar, boolean z3) {
            super(bVar);
            this.f24849T = z3;
        }

        @Override // com.blankj.utilcode.util.y0.g
        @androidx.annotation.Y("android.permission.INTERNET")
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public String f() {
            return NetworkUtils.n(this.f24849T);
        }
    }

    /* loaded from: classes.dex */
    class f extends E0.f<String> {

        /* renamed from: T, reason: collision with root package name */
        final /* synthetic */ String f24850T;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(E0.b bVar, String str) {
            super(bVar);
            this.f24850T = str;
        }

        @Override // com.blankj.utilcode.util.y0.g
        @androidx.annotation.Y("android.permission.INTERNET")
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public String f() {
            return NetworkUtils.k(this.f24850T);
        }
    }

    /* loaded from: classes.dex */
    class g implements Runnable {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ E0.b f24851E;

        g(E0.b bVar) {
            this.f24851E = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (NetworkUtils.f24844b.isEmpty()) {
                NetworkUtils.f24844b.add(this.f24851E);
                NetworkUtils.Z();
            } else {
                this.f24851E.accept(NetworkUtils.f24846d);
                NetworkUtils.f24844b.add(this.f24851E);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class h extends TimerTask {

        /* loaded from: classes.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                Iterator it = NetworkUtils.f24844b.iterator();
                while (it.hasNext()) {
                    ((E0.b) it.next()).accept(NetworkUtils.f24846d);
                }
            }
        }

        h() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        @androidx.annotation.Y(allOf = {"android.permission.ACCESS_WIFI_STATE", "android.permission.CHANGE_WIFI_STATE", "android.permission.ACCESS_COARSE_LOCATION"})
        public void run() {
            NetworkUtils.a0();
            l x3 = NetworkUtils.x();
            if (!NetworkUtils.Q(NetworkUtils.f24846d.f24862a, x3.f24862a)) {
                l unused = NetworkUtils.f24846d = x3;
                H0.V0(new a());
            }
        }
    }

    /* loaded from: classes.dex */
    class i implements Runnable {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ E0.b f24853E;

        i(E0.b bVar) {
            this.f24853E = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            NetworkUtils.f24844b.remove(this.f24853E);
            if (NetworkUtils.f24844b.isEmpty()) {
                NetworkUtils.b0();
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class j extends BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        private NetworkType f24854a;

        /* renamed from: b, reason: collision with root package name */
        private Set<k> f24855b = new HashSet();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class a implements Runnable {

            /* renamed from: E, reason: collision with root package name */
            final /* synthetic */ k f24856E;

            a(k kVar) {
                this.f24856E = kVar;
            }

            @Override // java.lang.Runnable
            @androidx.annotation.Y("android.permission.ACCESS_NETWORK_STATE")
            public void run() {
                int size = j.this.f24855b.size();
                j.this.f24855b.add(this.f24856E);
                if (size == 0 && j.this.f24855b.size() == 1) {
                    j.this.f24854a = NetworkUtils.t();
                    E0.a().registerReceiver(j.a(), new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class b implements Runnable {

            /* renamed from: E, reason: collision with root package name */
            final /* synthetic */ k f24858E;

            b(k kVar) {
                this.f24858E = kVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                int size = j.this.f24855b.size();
                j.this.f24855b.remove(this.f24858E);
                if (size == 1 && j.this.f24855b.size() == 0) {
                    E0.a().unregisterReceiver(j.a());
                }
            }
        }

        /* loaded from: classes.dex */
        class c implements Runnable {
            c() {
            }

            @Override // java.lang.Runnable
            @androidx.annotation.Y("android.permission.ACCESS_NETWORK_STATE")
            public void run() {
                NetworkType t3 = NetworkUtils.t();
                if (j.this.f24854a != t3) {
                    j.this.f24854a = t3;
                    if (t3 == NetworkType.NETWORK_NO) {
                        Iterator it = j.this.f24855b.iterator();
                        while (it.hasNext()) {
                            ((k) it.next()).b();
                        }
                    } else {
                        Iterator it2 = j.this.f24855b.iterator();
                        while (it2.hasNext()) {
                            ((k) it2.next()).a(t3);
                        }
                    }
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes.dex */
        public static class d {

            /* renamed from: a, reason: collision with root package name */
            private static final j f24861a = new j();

            private d() {
            }
        }

        static /* synthetic */ j a() {
            return e();
        }

        private static j e() {
            return d.f24861a;
        }

        boolean f(k kVar) {
            if (kVar == null) {
                return false;
            }
            return this.f24855b.contains(kVar);
        }

        @androidx.annotation.Y("android.permission.ACCESS_NETWORK_STATE")
        void g(k kVar) {
            if (kVar == null) {
                return;
            }
            H0.V0(new a(kVar));
        }

        void h(k kVar) {
            if (kVar == null) {
                return;
            }
            H0.V0(new b(kVar));
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                H0.W0(new c(), 1000L);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface k {
        void a(NetworkType networkType);

        void b();
    }

    /* loaded from: classes.dex */
    public static final class l {

        /* renamed from: a, reason: collision with root package name */
        private List<ScanResult> f24862a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        private List<ScanResult> f24863b = new ArrayList();

        private static List<ScanResult> b(List<ScanResult> list) {
            ScanResult scanResult;
            if (list != null && !list.isEmpty()) {
                LinkedHashMap linkedHashMap = new LinkedHashMap(list.size());
                for (ScanResult scanResult2 : list) {
                    if (!TextUtils.isEmpty(scanResult2.SSID) && ((scanResult = (ScanResult) linkedHashMap.get(scanResult2.SSID)) == null || scanResult.level < scanResult2.level)) {
                        linkedHashMap.put(scanResult2.SSID, scanResult2);
                    }
                }
                return new ArrayList(linkedHashMap.values());
            }
            return new ArrayList();
        }

        public List<ScanResult> c() {
            return this.f24862a;
        }

        public List<ScanResult> d() {
            return this.f24863b;
        }

        public void e(List<ScanResult> list) {
            this.f24862a = list;
            this.f24863b = b(list);
        }
    }

    private NetworkUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    @androidx.annotation.Y("android.permission.INTERNET")
    public static boolean A() {
        if (!C() && !H(null)) {
            return false;
        }
        return true;
    }

    @androidx.annotation.Y("android.permission.INTERNET")
    public static E0.f<Boolean> B(@androidx.annotation.N E0.b<Boolean> bVar) {
        return H0.v(new a(bVar));
    }

    @androidx.annotation.Y("android.permission.INTERNET")
    public static boolean C() {
        return D("");
    }

    @androidx.annotation.Y("android.permission.INTERNET")
    public static boolean D(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "www.baidu.com";
        }
        try {
            if (InetAddress.getByName(str) == null) {
                return false;
            }
            return true;
        } catch (UnknownHostException e4) {
            e4.printStackTrace();
            return false;
        }
    }

    @androidx.annotation.Y("android.permission.INTERNET")
    public static E0.f E(String str, @androidx.annotation.N E0.b<Boolean> bVar) {
        return H0.v(new c(bVar, str));
    }

    @androidx.annotation.Y("android.permission.INTERNET")
    public static void F(E0.b<Boolean> bVar) {
        E("", bVar);
    }

    @androidx.annotation.Y("android.permission.INTERNET")
    public static boolean G() {
        return H("");
    }

    @androidx.annotation.Y("android.permission.INTERNET")
    public static boolean H(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "223.5.5.5";
        }
        if (t0.c(String.format("ping -c 1 %s", str), false).f25181a != 0) {
            return false;
        }
        return true;
    }

    @androidx.annotation.Y("android.permission.INTERNET")
    public static E0.f<Boolean> I(String str, @androidx.annotation.N E0.b<Boolean> bVar) {
        return H0.v(new b(bVar, str));
    }

    @androidx.annotation.Y("android.permission.INTERNET")
    public static void J(E0.b<Boolean> bVar) {
        I("", bVar);
    }

    public static boolean K() {
        if (System.getProperty("http.proxyHost") != null && System.getProperty("http.proxyPort") != null) {
            return true;
        }
        return false;
    }

    @androidx.annotation.Y("android.permission.ACCESS_NETWORK_STATE")
    public static boolean L() {
        NetworkInfo i4 = i();
        if (i4 != null && i4.isConnected()) {
            return true;
        }
        return false;
    }

    @androidx.annotation.Y("android.permission.ACCESS_NETWORK_STATE")
    private static boolean M() {
        NetworkInfo networkInfo;
        NetworkInfo.State state;
        ConnectivityManager connectivityManager = (ConnectivityManager) E0.a().getSystemService("connectivity");
        if (connectivityManager == null || (networkInfo = connectivityManager.getNetworkInfo(9)) == null || (state = networkInfo.getState()) == null) {
            return false;
        }
        if (state != NetworkInfo.State.CONNECTED && state != NetworkInfo.State.CONNECTING) {
            return false;
        }
        return true;
    }

    @androidx.annotation.Y("android.permission.ACCESS_NETWORK_STATE")
    public static boolean N() {
        NetworkInfo i4 = i();
        if (i4 != null && i4.isAvailable() && i4.getType() == 0) {
            return true;
        }
        return false;
    }

    public static boolean O(k kVar) {
        return j.a().f(kVar);
    }

    private static boolean P(ScanResult scanResult, ScanResult scanResult2) {
        if (scanResult != null && scanResult2 != null && H0.A(scanResult.BSSID, scanResult2.BSSID) && H0.A(scanResult.SSID, scanResult2.SSID) && H0.A(scanResult.capabilities, scanResult2.capabilities) && scanResult.level == scanResult2.level) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean Q(List<ScanResult> list, List<ScanResult> list2) {
        if (list == null && list2 == null) {
            return true;
        }
        if (list == null || list2 == null || list.size() != list2.size()) {
            return false;
        }
        for (int i4 = 0; i4 < list.size(); i4++) {
            if (!P(list.get(i4), list2.get(i4))) {
                return false;
            }
        }
        return true;
    }

    public static boolean R() {
        ConnectivityManager connectivityManager = (ConnectivityManager) E0.a().getSystemService("connectivity");
        if (Build.VERSION.SDK_INT >= 28) {
            return connectivityManager.getNetworkInfo(17).isConnectedOrConnecting();
        }
        return connectivityManager.getNetworkInfo(4).isConnectedOrConnecting();
    }

    @androidx.annotation.Y(allOf = {"android.permission.ACCESS_WIFI_STATE", "android.permission.INTERNET"})
    public static boolean S() {
        if (w() && A()) {
            return true;
        }
        return false;
    }

    @androidx.annotation.Y(allOf = {"android.permission.ACCESS_WIFI_STATE", "android.permission.INTERNET"})
    public static E0.f<Boolean> T(@androidx.annotation.N E0.b<Boolean> bVar) {
        return H0.v(new d(bVar));
    }

    @androidx.annotation.Y("android.permission.ACCESS_NETWORK_STATE")
    public static boolean U() {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) E0.a().getSystemService("connectivity");
        if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || activeNetworkInfo.getType() != 1) {
            return false;
        }
        return true;
    }

    public static void V() {
        E0.a().startActivity(new Intent("android.settings.WIRELESS_SETTINGS").setFlags(268435456));
    }

    @androidx.annotation.Y("android.permission.ACCESS_NETWORK_STATE")
    public static void W(k kVar) {
        j.a().g(kVar);
    }

    public static void X(E0.b<l> bVar) {
        if (bVar == null) {
            return;
        }
        H0.V0(new i(bVar));
    }

    @androidx.annotation.Y("android.permission.CHANGE_WIFI_STATE")
    public static void Y(boolean z3) {
        WifiManager wifiManager = (WifiManager) E0.a().getSystemService("wifi");
        if (wifiManager == null || z3 == wifiManager.isWifiEnabled()) {
            return;
        }
        wifiManager.setWifiEnabled(z3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void Z() {
        f24846d = new l();
        Timer timer = new Timer();
        f24845c = timer;
        timer.schedule(new h(), 0L, f24843a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.annotation.Y(allOf = {"android.permission.ACCESS_WIFI_STATE", "android.permission.CHANGE_WIFI_STATE"})
    public static void a0() {
        if (!w()) {
            return;
        }
        ((WifiManager) E0.a().getSystemService("wifi")).startScan();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b0() {
        Timer timer = f24845c;
        if (timer != null) {
            timer.cancel();
            f24845c = null;
        }
    }

    public static void c0(k kVar) {
        j.a().h(kVar);
    }

    @androidx.annotation.Y(allOf = {"android.permission.ACCESS_WIFI_STATE", "android.permission.CHANGE_WIFI_STATE", "android.permission.ACCESS_COARSE_LOCATION"})
    public static void h(E0.b<l> bVar) {
        if (bVar == null) {
            return;
        }
        H0.V0(new g(bVar));
    }

    @androidx.annotation.Y("android.permission.ACCESS_NETWORK_STATE")
    private static NetworkInfo i() {
        ConnectivityManager connectivityManager = (ConnectivityManager) E0.a().getSystemService("connectivity");
        if (connectivityManager == null) {
            return null;
        }
        return connectivityManager.getActiveNetworkInfo();
    }

    public static String j() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            new LinkedList();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface nextElement = networkInterfaces.nextElement();
                if (nextElement.isUp() && !nextElement.isLoopback()) {
                    List<InterfaceAddress> interfaceAddresses = nextElement.getInterfaceAddresses();
                    int size = interfaceAddresses.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        InetAddress broadcast = interfaceAddresses.get(i4).getBroadcast();
                        if (broadcast != null) {
                            return broadcast.getHostAddress();
                        }
                    }
                }
            }
            return "";
        } catch (SocketException e4) {
            e4.printStackTrace();
            return "";
        }
    }

    @androidx.annotation.Y("android.permission.INTERNET")
    public static String k(String str) {
        try {
            return InetAddress.getByName(str).getHostAddress();
        } catch (UnknownHostException e4) {
            e4.printStackTrace();
            return "";
        }
    }

    @androidx.annotation.Y("android.permission.INTERNET")
    public static E0.f<String> l(String str, @androidx.annotation.N E0.b<String> bVar) {
        return H0.v(new f(bVar, str));
    }

    @androidx.annotation.Y("android.permission.ACCESS_WIFI_STATE")
    public static String m() {
        WifiManager wifiManager = (WifiManager) E0.a().getSystemService("wifi");
        if (wifiManager == null) {
            return "";
        }
        return Formatter.formatIpAddress(wifiManager.getDhcpInfo().gateway);
    }

    @androidx.annotation.Y("android.permission.INTERNET")
    public static String n(boolean z3) {
        boolean z4;
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            LinkedList linkedList = new LinkedList();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface nextElement = networkInterfaces.nextElement();
                if (nextElement.isUp() && !nextElement.isLoopback()) {
                    Enumeration<InetAddress> inetAddresses = nextElement.getInetAddresses();
                    while (inetAddresses.hasMoreElements()) {
                        linkedList.addFirst(inetAddresses.nextElement());
                    }
                }
            }
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                InetAddress inetAddress = (InetAddress) it.next();
                if (!inetAddress.isLoopbackAddress()) {
                    String hostAddress = inetAddress.getHostAddress();
                    if (hostAddress.indexOf(58) < 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z3) {
                        if (z4) {
                            return hostAddress;
                        }
                    } else if (!z4) {
                        int indexOf = hostAddress.indexOf(37);
                        if (indexOf < 0) {
                            return hostAddress.toUpperCase();
                        }
                        return hostAddress.substring(0, indexOf).toUpperCase();
                    }
                }
            }
            return "";
        } catch (SocketException e4) {
            e4.printStackTrace();
            return "";
        }
    }

    public static E0.f<String> o(boolean z3, @androidx.annotation.N E0.b<String> bVar) {
        return H0.v(new e(bVar, z3));
    }

    @androidx.annotation.Y("android.permission.ACCESS_WIFI_STATE")
    public static String p() {
        WifiManager wifiManager = (WifiManager) E0.a().getSystemService("wifi");
        if (wifiManager == null) {
            return "";
        }
        return Formatter.formatIpAddress(wifiManager.getDhcpInfo().ipAddress);
    }

    public static boolean q() {
        TelephonyManager telephonyManager;
        boolean isDataEnabled;
        try {
            telephonyManager = (TelephonyManager) E0.a().getSystemService("phone");
        } catch (Exception e4) {
            e4.printStackTrace();
        }
        if (telephonyManager == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            isDataEnabled = telephonyManager.isDataEnabled();
            return isDataEnabled;
        }
        Method declaredMethod = telephonyManager.getClass().getDeclaredMethod("getDataEnabled", new Class[0]);
        if (declaredMethod != null) {
            return ((Boolean) declaredMethod.invoke(telephonyManager, new Object[0])).booleanValue();
        }
        return false;
    }

    @androidx.annotation.Y("android.permission.ACCESS_WIFI_STATE")
    public static String r() {
        WifiManager wifiManager = (WifiManager) E0.a().getSystemService("wifi");
        if (wifiManager == null) {
            return "";
        }
        return Formatter.formatIpAddress(wifiManager.getDhcpInfo().netmask);
    }

    public static String s() {
        TelephonyManager telephonyManager = (TelephonyManager) E0.a().getSystemService("phone");
        if (telephonyManager == null) {
            return "";
        }
        return telephonyManager.getNetworkOperatorName();
    }

    @androidx.annotation.Y("android.permission.ACCESS_NETWORK_STATE")
    public static NetworkType t() {
        if (M()) {
            return NetworkType.NETWORK_ETHERNET;
        }
        NetworkInfo i4 = i();
        if (i4 != null && i4.isAvailable()) {
            if (i4.getType() == 1) {
                return NetworkType.NETWORK_WIFI;
            }
            if (i4.getType() == 0) {
                switch (i4.getSubtype()) {
                    case 1:
                    case 2:
                    case 4:
                    case 7:
                    case 11:
                    case 16:
                        return NetworkType.NETWORK_2G;
                    case 3:
                    case 5:
                    case 6:
                    case 8:
                    case 9:
                    case 10:
                    case 12:
                    case 14:
                    case 15:
                    case 17:
                        return NetworkType.NETWORK_3G;
                    case 13:
                    case 18:
                        return NetworkType.NETWORK_4G;
                    case 19:
                    default:
                        String subtypeName = i4.getSubtypeName();
                        if (!subtypeName.equalsIgnoreCase("TD-SCDMA") && !subtypeName.equalsIgnoreCase("WCDMA") && !subtypeName.equalsIgnoreCase("CDMA2000")) {
                            return NetworkType.NETWORK_UNKNOWN;
                        }
                        return NetworkType.NETWORK_3G;
                    case 20:
                        return NetworkType.NETWORK_5G;
                }
            }
            return NetworkType.NETWORK_UNKNOWN;
        }
        return NetworkType.NETWORK_NO;
    }

    @androidx.annotation.Y("android.permission.ACCESS_WIFI_STATE")
    public static String u() {
        WifiInfo connectionInfo;
        WifiManager wifiManager = (WifiManager) E0.a().getApplicationContext().getSystemService("wifi");
        if (wifiManager == null || (connectionInfo = wifiManager.getConnectionInfo()) == null) {
            return "";
        }
        String ssid = connectionInfo.getSSID();
        if (TextUtils.isEmpty(ssid)) {
            return "";
        }
        if (ssid.length() > 2 && ssid.charAt(0) == '\"' && ssid.charAt(ssid.length() - 1) == '\"') {
            return ssid.substring(1, ssid.length() - 1);
        }
        return ssid;
    }

    @androidx.annotation.Y("android.permission.ACCESS_WIFI_STATE")
    public static String v() {
        WifiManager wifiManager = (WifiManager) E0.a().getSystemService("wifi");
        if (wifiManager == null) {
            return "";
        }
        return Formatter.formatIpAddress(wifiManager.getDhcpInfo().serverAddress);
    }

    @androidx.annotation.Y("android.permission.ACCESS_WIFI_STATE")
    public static boolean w() {
        WifiManager wifiManager = (WifiManager) E0.a().getSystemService("wifi");
        if (wifiManager == null) {
            return false;
        }
        return wifiManager.isWifiEnabled();
    }

    @androidx.annotation.Y(allOf = {"android.permission.ACCESS_WIFI_STATE", "android.permission.ACCESS_COARSE_LOCATION"})
    public static l x() {
        l lVar = new l();
        if (!w()) {
            return lVar;
        }
        List<ScanResult> scanResults = ((WifiManager) E0.a().getSystemService("wifi")).getScanResults();
        if (scanResults != null) {
            lVar.e(scanResults);
        }
        return lVar;
    }

    @androidx.annotation.Y("android.permission.ACCESS_NETWORK_STATE")
    public static boolean y() {
        NetworkInfo i4 = i();
        if (i4 != null && i4.isAvailable() && i4.getSubtype() == 13) {
            return true;
        }
        return false;
    }

    @androidx.annotation.Y("android.permission.ACCESS_NETWORK_STATE")
    public static boolean z() {
        NetworkInfo i4 = i();
        if (i4 != null && i4.isAvailable() && i4.getSubtype() == 20) {
            return true;
        }
        return false;
    }
}
