package com.harman.analytics.deviceAws;

import com.harman.log.f;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.text.C2220b;
import l3.d;
import l3.e;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    @d
    public static final a f37836b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    @d
    public static final String f37837c = "PlayAnalyticsParser";

    /* renamed from: a, reason: collision with root package name */
    @d
    private final String f37838a = "000a020102020003030400050006010700080009030a0410063002000103020003070400050006010700080009030a041006300200";

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private a() {
        }
    }

    private final void c(String str, PlayAnalytics playAnalytics) {
        f.a(f37837c, "enter extractPackage log = " + str);
        while (str.length() > 0 && str.length() >= 50) {
            f.a(f37837c, "enter extractPackage log = " + ((Object) str));
            HashMap<Integer, String> f4 = playAnalytics.f();
            String substring = str.substring(0, 50);
            F.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            f4.put(Integer.valueOf(f4.size()), substring);
            str = str.substring(50);
            F.o(str, "this as java.lang.String).substring(startIndex)");
        }
    }

    private final int e(String str) {
        if (str.length() < 2) {
            return 0;
        }
        String substring = str.substring(0, 2);
        F.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return g(substring);
    }

    private final int g(String str) {
        int a4;
        try {
            a4 = C2220b.a(16);
            return Integer.parseInt(str, a4);
        } catch (NumberFormatException e4) {
            e4.printStackTrace();
            return 0;
        }
    }

    public final boolean a(@e HashMap<Integer, String> hashMap, @e Integer num) {
        if (hashMap == null) {
            return false;
        }
        int size = hashMap.size();
        if (num == null || size != num.intValue()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0051. Please report as an issue. */
    @d
    public final PlayAnalytics b(@d String deviceLog, @d PlayAnalytics data) {
        F.p(deviceLog, "deviceLog");
        F.p(data, "data");
        f.a(f37837c, "enter extractFeatures log = " + deviceLog);
        if (deviceLog.length() >= 2) {
            HashMap hashMap = new HashMap();
            while (deviceLog.length() > 0) {
                String substring = deviceLog.substring(0, 2);
                F.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                int g4 = g(substring);
                deviceLog = deviceLog.substring(2);
                F.o(deviceLog, "this as java.lang.String).substring(startIndex)");
                if (g4 != 16) {
                    if (g4 != 48) {
                        switch (g4) {
                            case 1:
                                hashMap.put(data.d().get(0), Integer.valueOf(e(deviceLog)));
                                break;
                            case 2:
                                hashMap.put(data.d().get(1), Integer.valueOf(e(deviceLog)));
                                break;
                            case 3:
                                hashMap.put(data.d().get(2), Integer.valueOf(e(deviceLog)));
                                break;
                            case 4:
                                hashMap.put(data.d().get(3), Integer.valueOf(e(deviceLog)));
                                break;
                            case 5:
                                hashMap.put(data.d().get(4), Integer.valueOf(e(deviceLog)));
                                break;
                            case 6:
                                hashMap.put(data.d().get(5), Integer.valueOf(e(deviceLog)));
                                break;
                            case 7:
                                hashMap.put(data.d().get(6), Integer.valueOf(e(deviceLog)));
                                break;
                            case 8:
                                hashMap.put(data.d().get(7), Integer.valueOf(e(deviceLog)));
                                break;
                            case 9:
                                hashMap.put(data.d().get(8), Integer.valueOf(e(deviceLog)));
                                break;
                            case 10:
                                hashMap.put(data.d().get(9), Integer.valueOf(e(deviceLog)));
                                break;
                        }
                    } else {
                        hashMap.put(data.d().get(11), Integer.valueOf(e(deviceLog)));
                    }
                } else {
                    hashMap.put(data.d().get(10), Integer.valueOf(e(deviceLog)));
                }
                if (deviceLog.length() >= 2) {
                    deviceLog = deviceLog.substring(2);
                    F.o(deviceLog, "this as java.lang.String).substring(startIndex)");
                }
            }
            f.a(f37837c, "exit extractFeatures feature = " + hashMap);
            data.c().add(hashMap);
        }
        return data;
    }

    @d
    public final PlayAnalytics d(@d HashMap<Integer, String> packagesMap, @e PlayAnalytics playAnalytics) {
        F.p(packagesMap, "packagesMap");
        if (playAnalytics == null) {
            playAnalytics = new PlayAnalytics();
        }
        Iterator<Map.Entry<Integer, String>> it = packagesMap.entrySet().iterator();
        while (it.hasNext()) {
            b(it.next().getValue(), playAnalytics);
        }
        return playAnalytics;
    }

    @d
    public final PlayAnalytics f(@d String log, @e PlayAnalytics playAnalytics) {
        F.p(log, "log");
        f.a(f37837c, "enter parseData log = " + log);
        if (playAnalytics == null) {
            playAnalytics = new PlayAnalytics();
        }
        playAnalytics.f();
        if (log.length() > 2) {
            String substring = log.substring(0, 2);
            F.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            playAnalytics.i(g(substring));
            if (log.length() > 10) {
                String substring2 = log.substring(2, 4);
                F.o(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                playAnalytics.l(g(substring2));
                String substring3 = log.substring(6);
                F.o(substring3, "this as java.lang.String).substring(startIndex)");
                c(substring3, playAnalytics);
            }
        }
        return playAnalytics;
    }
}
