package r0;

import android.annotation.SuppressLint;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@SuppressLint({"InlinedApi"})
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final String f57380a = "CALENDAR";

    /* renamed from: b, reason: collision with root package name */
    public static final String f57381b = "CAMERA";

    /* renamed from: c, reason: collision with root package name */
    public static final String f57382c = "CONTACTS";

    /* renamed from: d, reason: collision with root package name */
    public static final String f57383d = "LOCATION";

    /* renamed from: e, reason: collision with root package name */
    public static final String f57384e = "MICROPHONE";

    /* renamed from: f, reason: collision with root package name */
    public static final String f57385f = "PHONE";

    /* renamed from: g, reason: collision with root package name */
    public static final String f57386g = "SENSORS";

    /* renamed from: h, reason: collision with root package name */
    public static final String f57387h = "SMS";

    /* renamed from: i, reason: collision with root package name */
    public static final String f57388i = "STORAGE";

    /* renamed from: j, reason: collision with root package name */
    public static final String f57389j = "ACTIVITY_RECOGNITION";

    /* renamed from: k, reason: collision with root package name */
    private static final String[] f57390k = {"android.permission.READ_CALENDAR", "android.permission.WRITE_CALENDAR"};

    /* renamed from: l, reason: collision with root package name */
    private static final String[] f57391l = {"android.permission.CAMERA"};

    /* renamed from: m, reason: collision with root package name */
    private static final String[] f57392m = {"android.permission.READ_CONTACTS", "android.permission.WRITE_CONTACTS", "android.permission.GET_ACCOUNTS"};

    /* renamed from: n, reason: collision with root package name */
    private static final String[] f57393n = {"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_BACKGROUND_LOCATION"};

    /* renamed from: o, reason: collision with root package name */
    private static final String[] f57394o = {"android.permission.RECORD_AUDIO"};

    /* renamed from: p, reason: collision with root package name */
    private static final String[] f57395p = {"android.permission.READ_PHONE_STATE", "android.permission.READ_PHONE_NUMBERS", "android.permission.CALL_PHONE", "android.permission.READ_CALL_LOG", "android.permission.WRITE_CALL_LOG", "com.android.voicemail.permission.ADD_VOICEMAIL", "android.permission.USE_SIP", "android.permission.PROCESS_OUTGOING_CALLS", "android.permission.ANSWER_PHONE_CALLS"};

    /* renamed from: q, reason: collision with root package name */
    private static final String[] f57396q = {"android.permission.READ_PHONE_STATE", "android.permission.READ_PHONE_NUMBERS", "android.permission.CALL_PHONE", "android.permission.READ_CALL_LOG", "android.permission.WRITE_CALL_LOG", "com.android.voicemail.permission.ADD_VOICEMAIL", "android.permission.USE_SIP", "android.permission.PROCESS_OUTGOING_CALLS"};

    /* renamed from: r, reason: collision with root package name */
    private static final String[] f57397r = {"android.permission.BODY_SENSORS"};

    /* renamed from: s, reason: collision with root package name */
    private static final String[] f57398s = {"android.permission.SEND_SMS", "android.permission.RECEIVE_SMS", "android.permission.READ_SMS", "android.permission.RECEIVE_WAP_PUSH", "android.permission.RECEIVE_MMS"};

    /* renamed from: t, reason: collision with root package name */
    private static final String[] f57399t = {"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"};

    /* renamed from: u, reason: collision with root package name */
    private static final String[] f57400u = {"android.permission.ACTIVITY_RECOGNITION"};

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface a {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x007d, code lost:
    
        if (r3.equals("LOCATION") == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String[] a(java.lang.String r3) {
        /*
            r0 = 0
            if (r3 != 0) goto L6
            java.lang.String[] r3 = new java.lang.String[r0]
            return r3
        L6:
            int r1 = r3.hashCode()
            r2 = -1
            switch(r1) {
                case -1611296843: goto L77;
                case -1596608551: goto L6c;
                case -1166291365: goto L61;
                case 82233: goto L56;
                case 76105038: goto L4b;
                case 140654183: goto L40;
                case 215175251: goto L35;
                case 604302142: goto L2a;
                case 1856013610: goto L1e;
                case 1980544805: goto L11;
                default: goto Le;
            }
        Le:
            r0 = r2
            goto L80
        L11:
            java.lang.String r0 = "CAMERA"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L1a
            goto Le
        L1a:
            r0 = 9
            goto L80
        L1e:
            java.lang.String r0 = "MICROPHONE"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L27
            goto Le
        L27:
            r0 = 8
            goto L80
        L2a:
            java.lang.String r0 = "CALENDAR"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L33
            goto Le
        L33:
            r0 = 7
            goto L80
        L35:
            java.lang.String r0 = "CONTACTS"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L3e
            goto Le
        L3e:
            r0 = 6
            goto L80
        L40:
            java.lang.String r0 = "ACTIVITY_RECOGNITION"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L49
            goto Le
        L49:
            r0 = 5
            goto L80
        L4b:
            java.lang.String r0 = "PHONE"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L54
            goto Le
        L54:
            r0 = 4
            goto L80
        L56:
            java.lang.String r0 = "SMS"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L5f
            goto Le
        L5f:
            r0 = 3
            goto L80
        L61:
            java.lang.String r0 = "STORAGE"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L6a
            goto Le
        L6a:
            r0 = 2
            goto L80
        L6c:
            java.lang.String r0 = "SENSORS"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L75
            goto Le
        L75:
            r0 = 1
            goto L80
        L77:
            java.lang.String r1 = "LOCATION"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L80
            goto Le
        L80:
            switch(r0) {
                case 0: goto Lac;
                case 1: goto La9;
                case 2: goto La6;
                case 3: goto La3;
                case 4: goto L97;
                case 5: goto L94;
                case 6: goto L91;
                case 7: goto L8e;
                case 8: goto L8b;
                case 9: goto L88;
                default: goto L83;
            }
        L83:
            java.lang.String[] r3 = new java.lang.String[]{r3}
            return r3
        L88:
            java.lang.String[] r3 = r0.c.f57391l
            return r3
        L8b:
            java.lang.String[] r3 = r0.c.f57394o
            return r3
        L8e:
            java.lang.String[] r3 = r0.c.f57390k
            return r3
        L91:
            java.lang.String[] r3 = r0.c.f57392m
            return r3
        L94:
            java.lang.String[] r3 = r0.c.f57400u
            return r3
        L97:
            int r3 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r3 >= r0) goto La0
            java.lang.String[] r3 = r0.c.f57396q
            return r3
        La0:
            java.lang.String[] r3 = r0.c.f57395p
            return r3
        La3:
            java.lang.String[] r3 = r0.c.f57398s
            return r3
        La6:
            java.lang.String[] r3 = r0.c.f57399t
            return r3
        La9:
            java.lang.String[] r3 = r0.c.f57397r
            return r3
        Lac:
            java.lang.String[] r3 = r0.c.f57393n
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: r0.c.a(java.lang.String):java.lang.String[]");
    }
}
