package androidx.constraintlayout.core.motion.utils;

/* loaded from: classes.dex */
public interface v {

    /* renamed from: a, reason: collision with root package name */
    public static final String f7351a = "CUSTOM";

    /* renamed from: b, reason: collision with root package name */
    public static final int f7352b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f7353c = 2;

    /* renamed from: d, reason: collision with root package name */
    public static final int f7354d = 4;

    /* renamed from: e, reason: collision with root package name */
    public static final int f7355e = 8;

    /* renamed from: f, reason: collision with root package name */
    public static final int f7356f = 100;

    /* renamed from: g, reason: collision with root package name */
    public static final int f7357g = 101;

    /* loaded from: classes.dex */
    public interface a {

        /* renamed from: A, reason: collision with root package name */
        public static final String f7358A = "rotationX";

        /* renamed from: B, reason: collision with root package name */
        public static final String f7359B = "rotationY";

        /* renamed from: C, reason: collision with root package name */
        public static final String f7360C = "rotationZ";

        /* renamed from: D, reason: collision with root package name */
        public static final String f7361D = "scaleX";

        /* renamed from: E, reason: collision with root package name */
        public static final String f7362E = "scaleY";

        /* renamed from: F, reason: collision with root package name */
        public static final String f7363F = "pivotX";

        /* renamed from: G, reason: collision with root package name */
        public static final String f7364G = "pivotY";

        /* renamed from: H, reason: collision with root package name */
        public static final String f7365H = "progress";

        /* renamed from: I, reason: collision with root package name */
        public static final String f7366I = "pathRotate";

        /* renamed from: J, reason: collision with root package name */
        public static final String f7367J = "easing";

        /* renamed from: K, reason: collision with root package name */
        public static final String f7368K = "CUSTOM";

        /* renamed from: L, reason: collision with root package name */
        public static final String f7369L = "frame";

        /* renamed from: M, reason: collision with root package name */
        public static final String f7370M = "target";

        /* renamed from: N, reason: collision with root package name */
        public static final String f7371N = "pivotTarget";

        /* renamed from: O, reason: collision with root package name */
        public static final String[] f7372O = {"curveFit", "visibility", "alpha", "translationX", "translationY", "translationZ", "elevation", "rotationX", "rotationY", "rotationZ", "scaleX", "scaleY", "pivotX", "pivotY", "progress", "pathRotate", "easing", "CUSTOM", f7369L, f7370M, f7371N};

        /* renamed from: a, reason: collision with root package name */
        public static final String f7373a = "KeyAttributes";

        /* renamed from: b, reason: collision with root package name */
        public static final int f7374b = 301;

        /* renamed from: c, reason: collision with root package name */
        public static final int f7375c = 302;

        /* renamed from: d, reason: collision with root package name */
        public static final int f7376d = 303;

        /* renamed from: e, reason: collision with root package name */
        public static final int f7377e = 304;

        /* renamed from: f, reason: collision with root package name */
        public static final int f7378f = 305;

        /* renamed from: g, reason: collision with root package name */
        public static final int f7379g = 306;

        /* renamed from: h, reason: collision with root package name */
        public static final int f7380h = 307;

        /* renamed from: i, reason: collision with root package name */
        public static final int f7381i = 308;

        /* renamed from: j, reason: collision with root package name */
        public static final int f7382j = 309;

        /* renamed from: k, reason: collision with root package name */
        public static final int f7383k = 310;

        /* renamed from: l, reason: collision with root package name */
        public static final int f7384l = 311;

        /* renamed from: m, reason: collision with root package name */
        public static final int f7385m = 312;

        /* renamed from: n, reason: collision with root package name */
        public static final int f7386n = 313;

        /* renamed from: o, reason: collision with root package name */
        public static final int f7387o = 314;

        /* renamed from: p, reason: collision with root package name */
        public static final int f7388p = 315;

        /* renamed from: q, reason: collision with root package name */
        public static final int f7389q = 316;

        /* renamed from: r, reason: collision with root package name */
        public static final int f7390r = 317;

        /* renamed from: s, reason: collision with root package name */
        public static final int f7391s = 318;

        /* renamed from: t, reason: collision with root package name */
        public static final String f7392t = "curveFit";

        /* renamed from: u, reason: collision with root package name */
        public static final String f7393u = "visibility";

        /* renamed from: v, reason: collision with root package name */
        public static final String f7394v = "alpha";

        /* renamed from: w, reason: collision with root package name */
        public static final String f7395w = "translationX";

        /* renamed from: x, reason: collision with root package name */
        public static final String f7396x = "translationY";

        /* renamed from: y, reason: collision with root package name */
        public static final String f7397y = "translationZ";

        /* renamed from: z, reason: collision with root package name */
        public static final String f7398z = "elevation";

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        static int a(String str) {
            char c4;
            str.hashCode();
            switch (str.hashCode()) {
                case -1310311125:
                    if (str.equals("easing")) {
                        c4 = 0;
                        break;
                    }
                    c4 = 65535;
                    break;
                case -1249320806:
                    if (str.equals("rotationX")) {
                        c4 = 1;
                        break;
                    }
                    c4 = 65535;
                    break;
                case -1249320805:
                    if (str.equals("rotationY")) {
                        c4 = 2;
                        break;
                    }
                    c4 = 65535;
                    break;
                case -1249320804:
                    if (str.equals("rotationZ")) {
                        c4 = 3;
                        break;
                    }
                    c4 = 65535;
                    break;
                case -1225497657:
                    if (str.equals("translationX")) {
                        c4 = 4;
                        break;
                    }
                    c4 = 65535;
                    break;
                case -1225497656:
                    if (str.equals("translationY")) {
                        c4 = 5;
                        break;
                    }
                    c4 = 65535;
                    break;
                case -1225497655:
                    if (str.equals("translationZ")) {
                        c4 = 6;
                        break;
                    }
                    c4 = 65535;
                    break;
                case -1001078227:
                    if (str.equals("progress")) {
                        c4 = 7;
                        break;
                    }
                    c4 = 65535;
                    break;
                case -987906986:
                    if (str.equals("pivotX")) {
                        c4 = '\b';
                        break;
                    }
                    c4 = 65535;
                    break;
                case -987906985:
                    if (str.equals("pivotY")) {
                        c4 = '\t';
                        break;
                    }
                    c4 = 65535;
                    break;
                case -908189618:
                    if (str.equals("scaleX")) {
                        c4 = '\n';
                        break;
                    }
                    c4 = 65535;
                    break;
                case -908189617:
                    if (str.equals("scaleY")) {
                        c4 = 11;
                        break;
                    }
                    c4 = 65535;
                    break;
                case -880905839:
                    if (str.equals(f7370M)) {
                        c4 = '\f';
                        break;
                    }
                    c4 = 65535;
                    break;
                case -4379043:
                    if (str.equals("elevation")) {
                        c4 = '\r';
                        break;
                    }
                    c4 = 65535;
                    break;
                case 92909918:
                    if (str.equals("alpha")) {
                        c4 = 14;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 97692013:
                    if (str.equals(f7369L)) {
                        c4 = 15;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 579057826:
                    if (str.equals("curveFit")) {
                        c4 = 16;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 803192288:
                    if (str.equals("pathRotate")) {
                        c4 = 17;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 1167159411:
                    if (str.equals(f7371N)) {
                        c4 = 18;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 1941332754:
                    if (str.equals("visibility")) {
                        c4 = 19;
                        break;
                    }
                    c4 = 65535;
                    break;
                default:
                    c4 = 65535;
                    break;
            }
            switch (c4) {
                case 0:
                    return f7390r;
                case 1:
                    return 308;
                case 2:
                    return 309;
                case 3:
                    return 310;
                case 4:
                    return 304;
                case 5:
                    return 305;
                case 6:
                    return 306;
                case 7:
                    return 315;
                case '\b':
                    return 313;
                case '\t':
                    return 314;
                case '\n':
                    return 311;
                case 11:
                    return 312;
                case '\f':
                    return 101;
                case '\r':
                    return 307;
                case 14:
                    return 303;
                case 15:
                    return 100;
                case 16:
                    return 301;
                case 17:
                    return f7389q;
                case 18:
                    return f7391s;
                case 19:
                    return 302;
                default:
                    return -1;
            }
        }

        static int getType(int i4) {
            if (i4 == 100) {
                return 2;
            }
            if (i4 == 101) {
                return 8;
            }
            switch (i4) {
                case 301:
                case 302:
                    return 2;
                case 303:
                case 304:
                case 305:
                case 306:
                case 307:
                case 308:
                case 309:
                case 310:
                case 311:
                case 312:
                case 313:
                case 314:
                case 315:
                case f7389q /* 316 */:
                    return 4;
                case f7390r /* 317 */:
                case f7391s /* 318 */:
                    return 8;
                default:
                    return -1;
            }
        }
    }

    /* loaded from: classes.dex */
    public interface b {

        /* renamed from: a, reason: collision with root package name */
        public static final String f7399a = "Custom";

        /* renamed from: b, reason: collision with root package name */
        public static final String f7400b = "integer";

        /* renamed from: c, reason: collision with root package name */
        public static final String f7401c = "float";

        /* renamed from: d, reason: collision with root package name */
        public static final String f7402d = "color";

        /* renamed from: e, reason: collision with root package name */
        public static final String f7403e = "string";

        /* renamed from: f, reason: collision with root package name */
        public static final String f7404f = "boolean";

        /* renamed from: g, reason: collision with root package name */
        public static final String f7405g = "dimension";

        /* renamed from: h, reason: collision with root package name */
        public static final String f7406h = "reference";

        /* renamed from: i, reason: collision with root package name */
        public static final String[] f7407i = {f7401c, f7402d, f7403e, f7404f, f7405g, f7406h};

        /* renamed from: j, reason: collision with root package name */
        public static final int f7408j = 900;

        /* renamed from: k, reason: collision with root package name */
        public static final int f7409k = 901;

        /* renamed from: l, reason: collision with root package name */
        public static final int f7410l = 902;

        /* renamed from: m, reason: collision with root package name */
        public static final int f7411m = 903;

        /* renamed from: n, reason: collision with root package name */
        public static final int f7412n = 904;

        /* renamed from: o, reason: collision with root package name */
        public static final int f7413o = 905;

        /* renamed from: p, reason: collision with root package name */
        public static final int f7414p = 906;

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        static int a(String str) {
            char c4;
            str.hashCode();
            switch (str.hashCode()) {
                case -1095013018:
                    if (str.equals(f7405g)) {
                        c4 = 0;
                        break;
                    }
                    c4 = 65535;
                    break;
                case -925155509:
                    if (str.equals(f7406h)) {
                        c4 = 1;
                        break;
                    }
                    c4 = 65535;
                    break;
                case -891985903:
                    if (str.equals(f7403e)) {
                        c4 = 2;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 64711720:
                    if (str.equals(f7404f)) {
                        c4 = 3;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 94842723:
                    if (str.equals(f7402d)) {
                        c4 = 4;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 97526364:
                    if (str.equals(f7401c)) {
                        c4 = 5;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 1958052158:
                    if (str.equals(f7400b)) {
                        c4 = 6;
                        break;
                    }
                    c4 = 65535;
                    break;
                default:
                    c4 = 65535;
                    break;
            }
            switch (c4) {
                case 0:
                    return f7413o;
                case 1:
                    return f7414p;
                case 2:
                    return f7411m;
                case 3:
                    return f7412n;
                case 4:
                    return f7410l;
                case 5:
                    return f7409k;
                case 6:
                    return 900;
                default:
                    return -1;
            }
        }
    }

    /* loaded from: classes.dex */
    public interface c {

        /* renamed from: A, reason: collision with root package name */
        public static final String f7415A = "translationX";

        /* renamed from: B, reason: collision with root package name */
        public static final String f7416B = "translationY";

        /* renamed from: C, reason: collision with root package name */
        public static final String f7417C = "translationZ";

        /* renamed from: D, reason: collision with root package name */
        public static final String f7418D = "elevation";

        /* renamed from: E, reason: collision with root package name */
        public static final String f7419E = "rotationX";

        /* renamed from: F, reason: collision with root package name */
        public static final String f7420F = "rotationY";

        /* renamed from: G, reason: collision with root package name */
        public static final String f7421G = "rotationZ";

        /* renamed from: H, reason: collision with root package name */
        public static final String f7422H = "scaleX";

        /* renamed from: I, reason: collision with root package name */
        public static final String f7423I = "scaleY";

        /* renamed from: J, reason: collision with root package name */
        public static final String f7424J = "pivotX";

        /* renamed from: K, reason: collision with root package name */
        public static final String f7425K = "pivotY";

        /* renamed from: L, reason: collision with root package name */
        public static final String f7426L = "progress";

        /* renamed from: M, reason: collision with root package name */
        public static final String f7427M = "pathRotate";

        /* renamed from: N, reason: collision with root package name */
        public static final String f7428N = "easing";

        /* renamed from: O, reason: collision with root package name */
        public static final String f7429O = "waveShape";

        /* renamed from: P, reason: collision with root package name */
        public static final String f7430P = "customWave";

        /* renamed from: Q, reason: collision with root package name */
        public static final String f7431Q = "period";

        /* renamed from: R, reason: collision with root package name */
        public static final String f7432R = "offset";

        /* renamed from: S, reason: collision with root package name */
        public static final String f7433S = "phase";

        /* renamed from: T, reason: collision with root package name */
        public static final String[] f7434T = {"curveFit", "visibility", "alpha", "translationX", "translationY", "translationZ", "elevation", "rotationX", "rotationY", "rotationZ", "scaleX", "scaleY", "pivotX", "pivotY", "progress", "pathRotate", "easing", "waveShape", f7430P, f7431Q, f7432R, f7433S};

        /* renamed from: a, reason: collision with root package name */
        public static final String f7435a = "KeyCycle";

        /* renamed from: b, reason: collision with root package name */
        public static final int f7436b = 401;

        /* renamed from: c, reason: collision with root package name */
        public static final int f7437c = 402;

        /* renamed from: d, reason: collision with root package name */
        public static final int f7438d = 403;

        /* renamed from: e, reason: collision with root package name */
        public static final int f7439e = 304;

        /* renamed from: f, reason: collision with root package name */
        public static final int f7440f = 305;

        /* renamed from: g, reason: collision with root package name */
        public static final int f7441g = 306;

        /* renamed from: h, reason: collision with root package name */
        public static final int f7442h = 307;

        /* renamed from: i, reason: collision with root package name */
        public static final int f7443i = 308;

        /* renamed from: j, reason: collision with root package name */
        public static final int f7444j = 309;

        /* renamed from: k, reason: collision with root package name */
        public static final int f7445k = 310;

        /* renamed from: l, reason: collision with root package name */
        public static final int f7446l = 311;

        /* renamed from: m, reason: collision with root package name */
        public static final int f7447m = 312;

        /* renamed from: n, reason: collision with root package name */
        public static final int f7448n = 313;

        /* renamed from: o, reason: collision with root package name */
        public static final int f7449o = 314;

        /* renamed from: p, reason: collision with root package name */
        public static final int f7450p = 315;

        /* renamed from: q, reason: collision with root package name */
        public static final int f7451q = 416;

        /* renamed from: r, reason: collision with root package name */
        public static final int f7452r = 420;

        /* renamed from: s, reason: collision with root package name */
        public static final int f7453s = 421;

        /* renamed from: t, reason: collision with root package name */
        public static final int f7454t = 422;

        /* renamed from: u, reason: collision with root package name */
        public static final int f7455u = 423;

        /* renamed from: v, reason: collision with root package name */
        public static final int f7456v = 424;

        /* renamed from: w, reason: collision with root package name */
        public static final int f7457w = 425;

        /* renamed from: x, reason: collision with root package name */
        public static final String f7458x = "curveFit";

        /* renamed from: y, reason: collision with root package name */
        public static final String f7459y = "visibility";

        /* renamed from: z, reason: collision with root package name */
        public static final String f7460z = "alpha";

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        static int a(String str) {
            char c4;
            str.hashCode();
            switch (str.hashCode()) {
                case -1310311125:
                    if (str.equals("easing")) {
                        c4 = 0;
                        break;
                    }
                    c4 = 65535;
                    break;
                case -1249320806:
                    if (str.equals("rotationX")) {
                        c4 = 1;
                        break;
                    }
                    c4 = 65535;
                    break;
                case -1249320805:
                    if (str.equals("rotationY")) {
                        c4 = 2;
                        break;
                    }
                    c4 = 65535;
                    break;
                case -1249320804:
                    if (str.equals("rotationZ")) {
                        c4 = 3;
                        break;
                    }
                    c4 = 65535;
                    break;
                case -1225497657:
                    if (str.equals("translationX")) {
                        c4 = 4;
                        break;
                    }
                    c4 = 65535;
                    break;
                case -1225497656:
                    if (str.equals("translationY")) {
                        c4 = 5;
                        break;
                    }
                    c4 = 65535;
                    break;
                case -1225497655:
                    if (str.equals("translationZ")) {
                        c4 = 6;
                        break;
                    }
                    c4 = 65535;
                    break;
                case -1001078227:
                    if (str.equals("progress")) {
                        c4 = 7;
                        break;
                    }
                    c4 = 65535;
                    break;
                case -987906986:
                    if (str.equals("pivotX")) {
                        c4 = '\b';
                        break;
                    }
                    c4 = 65535;
                    break;
                case -987906985:
                    if (str.equals("pivotY")) {
                        c4 = '\t';
                        break;
                    }
                    c4 = 65535;
                    break;
                case -908189618:
                    if (str.equals("scaleX")) {
                        c4 = '\n';
                        break;
                    }
                    c4 = 65535;
                    break;
                case -908189617:
                    if (str.equals("scaleY")) {
                        c4 = 11;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 92909918:
                    if (str.equals("alpha")) {
                        c4 = '\f';
                        break;
                    }
                    c4 = 65535;
                    break;
                case 579057826:
                    if (str.equals("curveFit")) {
                        c4 = '\r';
                        break;
                    }
                    c4 = 65535;
                    break;
                case 803192288:
                    if (str.equals("pathRotate")) {
                        c4 = 14;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 1941332754:
                    if (str.equals("visibility")) {
                        c4 = 15;
                        break;
                    }
                    c4 = 65535;
                    break;
                default:
                    c4 = 65535;
                    break;
            }
            switch (c4) {
                case 0:
                    return f7452r;
                case 1:
                    return 308;
                case 2:
                    return 309;
                case 3:
                    return 310;
                case 4:
                    return 304;
                case 5:
                    return 305;
                case 6:
                    return 306;
                case 7:
                    return 315;
                case '\b':
                    return 313;
                case '\t':
                    return 314;
                case '\n':
                    return 311;
                case 11:
                    return 312;
                case '\f':
                    return f7438d;
                case '\r':
                    return f7436b;
                case 14:
                    return f7451q;
                case 15:
                    return f7437c;
                default:
                    return -1;
            }
        }

        static int getType(int i4) {
            if (i4 == 100) {
                return 2;
            }
            if (i4 == 101) {
                return 8;
            }
            if (i4 == 416) {
                return 4;
            }
            if (i4 == 420 || i4 == 421) {
                return 8;
            }
            switch (i4) {
                case 304:
                case 305:
                case 306:
                case 307:
                case 308:
                case 309:
                case 310:
                case 311:
                case 312:
                case 313:
                case 314:
                case 315:
                    return 4;
                default:
                    switch (i4) {
                        case f7436b /* 401 */:
                        case f7437c /* 402 */:
                            return 2;
                        case f7438d /* 403 */:
                            return 4;
                        default:
                            switch (i4) {
                                case f7455u /* 423 */:
                                case f7456v /* 424 */:
                                case f7457w /* 425 */:
                                    return 4;
                                default:
                                    return -1;
                            }
                    }
            }
        }
    }

    /* loaded from: classes.dex */
    public interface d {

        /* renamed from: a, reason: collision with root package name */
        public static final String f7461a = "MotionScene";

        /* renamed from: d, reason: collision with root package name */
        public static final int f7464d = 600;

        /* renamed from: e, reason: collision with root package name */
        public static final int f7465e = 601;

        /* renamed from: b, reason: collision with root package name */
        public static final String f7462b = "defaultDuration";

        /* renamed from: c, reason: collision with root package name */
        public static final String f7463c = "layoutDuringTransition";

        /* renamed from: f, reason: collision with root package name */
        public static final String[] f7466f = {f7462b, f7463c};

        static int a(String str) {
            str.hashCode();
            if (!str.equals(f7462b)) {
                if (!str.equals(f7463c)) {
                    return -1;
                }
                return 601;
            }
            return 600;
        }

        static int getType(int i4) {
            if (i4 != 600) {
                return i4 != 601 ? -1 : 1;
            }
            return 2;
        }
    }

    /* loaded from: classes.dex */
    public interface e {

        /* renamed from: A, reason: collision with root package name */
        public static final int f7467A = 611;

        /* renamed from: B, reason: collision with root package name */
        public static final int f7468B = 612;

        /* renamed from: a, reason: collision with root package name */
        public static final String f7469a = "Motion";

        /* renamed from: b, reason: collision with root package name */
        public static final String f7470b = "Stagger";

        /* renamed from: c, reason: collision with root package name */
        public static final String f7471c = "PathRotate";

        /* renamed from: d, reason: collision with root package name */
        public static final String f7472d = "QuantizeMotionPhase";

        /* renamed from: e, reason: collision with root package name */
        public static final String f7473e = "TransitionEasing";

        /* renamed from: f, reason: collision with root package name */
        public static final String f7474f = "QuantizeInterpolator";

        /* renamed from: g, reason: collision with root package name */
        public static final String f7475g = "AnimateRelativeTo";

        /* renamed from: h, reason: collision with root package name */
        public static final String f7476h = "AnimateCircleAngleTo";

        /* renamed from: i, reason: collision with root package name */
        public static final String f7477i = "PathMotionArc";

        /* renamed from: j, reason: collision with root package name */
        public static final String f7478j = "DrawPath";

        /* renamed from: k, reason: collision with root package name */
        public static final String f7479k = "PolarRelativeTo";

        /* renamed from: l, reason: collision with root package name */
        public static final String f7480l = "QuantizeMotionSteps";

        /* renamed from: m, reason: collision with root package name */
        public static final String f7481m = "QuantizeInterpolatorType";

        /* renamed from: n, reason: collision with root package name */
        public static final String f7482n = "QuantizeInterpolatorID";

        /* renamed from: o, reason: collision with root package name */
        public static final String[] f7483o = {f7470b, f7471c, f7472d, f7473e, f7474f, f7475g, f7476h, f7477i, f7478j, f7479k, f7480l, f7481m, f7482n};

        /* renamed from: p, reason: collision with root package name */
        public static final int f7484p = 600;

        /* renamed from: q, reason: collision with root package name */
        public static final int f7485q = 601;

        /* renamed from: r, reason: collision with root package name */
        public static final int f7486r = 602;

        /* renamed from: s, reason: collision with root package name */
        public static final int f7487s = 603;

        /* renamed from: t, reason: collision with root package name */
        public static final int f7488t = 604;

        /* renamed from: u, reason: collision with root package name */
        public static final int f7489u = 605;

        /* renamed from: v, reason: collision with root package name */
        public static final int f7490v = 606;

        /* renamed from: w, reason: collision with root package name */
        public static final int f7491w = 607;

        /* renamed from: x, reason: collision with root package name */
        public static final int f7492x = 608;

        /* renamed from: y, reason: collision with root package name */
        public static final int f7493y = 609;

        /* renamed from: z, reason: collision with root package name */
        public static final int f7494z = 610;

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        static int a(String str) {
            char c4;
            str.hashCode();
            switch (str.hashCode()) {
                case -2033446275:
                    if (str.equals(f7476h)) {
                        c4 = 0;
                        break;
                    }
                    c4 = 65535;
                    break;
                case -1532277420:
                    if (str.equals(f7472d)) {
                        c4 = 1;
                        break;
                    }
                    c4 = 65535;
                    break;
                case -1529145600:
                    if (str.equals(f7480l)) {
                        c4 = 2;
                        break;
                    }
                    c4 = 65535;
                    break;
                case -1498310144:
                    if (str.equals(f7471c)) {
                        c4 = 3;
                        break;
                    }
                    c4 = 65535;
                    break;
                case -1030753096:
                    if (str.equals(f7474f)) {
                        c4 = 4;
                        break;
                    }
                    c4 = 65535;
                    break;
                case -762370135:
                    if (str.equals(f7478j)) {
                        c4 = 5;
                        break;
                    }
                    c4 = 65535;
                    break;
                case -232872051:
                    if (str.equals(f7470b)) {
                        c4 = 6;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 1138491429:
                    if (str.equals(f7479k)) {
                        c4 = 7;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 1539234834:
                    if (str.equals(f7481m)) {
                        c4 = '\b';
                        break;
                    }
                    c4 = 65535;
                    break;
                case 1583722451:
                    if (str.equals(f7482n)) {
                        c4 = '\t';
                        break;
                    }
                    c4 = 65535;
                    break;
                case 1639368448:
                    if (str.equals(f7473e)) {
                        c4 = '\n';
                        break;
                    }
                    c4 = 65535;
                    break;
                case 1900899336:
                    if (str.equals(f7475g)) {
                        c4 = 11;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 2109694967:
                    if (str.equals(f7477i)) {
                        c4 = '\f';
                        break;
                    }
                    c4 = 65535;
                    break;
                default:
                    c4 = 65535;
                    break;
            }
            switch (c4) {
                case 0:
                    return f7490v;
                case 1:
                    return f7486r;
                case 2:
                    return f7494z;
                case 3:
                    return 601;
                case 4:
                    return f7488t;
                case 5:
                    return f7492x;
                case 6:
                    return 600;
                case 7:
                    return f7493y;
                case '\b':
                    return f7467A;
                case '\t':
                    return f7468B;
                case '\n':
                    return f7487s;
                case 11:
                    return f7489u;
                case '\f':
                    return f7491w;
                default:
                    return -1;
            }
        }
    }

    /* loaded from: classes.dex */
    public interface f {

        /* renamed from: a, reason: collision with root package name */
        public static final String f7495a = "dragscale";

        /* renamed from: b, reason: collision with root package name */
        public static final String f7496b = "dragthreshold";

        /* renamed from: c, reason: collision with root package name */
        public static final String f7497c = "maxvelocity";

        /* renamed from: d, reason: collision with root package name */
        public static final String f7498d = "maxacceleration";

        /* renamed from: e, reason: collision with root package name */
        public static final String f7499e = "springmass";

        /* renamed from: f, reason: collision with root package name */
        public static final String f7500f = "springstiffness";

        /* renamed from: g, reason: collision with root package name */
        public static final String f7501g = "springdamping";

        /* renamed from: h, reason: collision with root package name */
        public static final String f7502h = "springstopthreshold";

        /* renamed from: i, reason: collision with root package name */
        public static final String f7503i = "dragdirection";

        /* renamed from: j, reason: collision with root package name */
        public static final String f7504j = "touchanchorid";

        /* renamed from: k, reason: collision with root package name */
        public static final String f7505k = "touchanchorside";

        /* renamed from: l, reason: collision with root package name */
        public static final String f7506l = "rotationcenterid";

        /* renamed from: m, reason: collision with root package name */
        public static final String f7507m = "touchregionid";

        /* renamed from: n, reason: collision with root package name */
        public static final String f7508n = "limitboundsto";

        /* renamed from: o, reason: collision with root package name */
        public static final String f7509o = "movewhenscrollattop";

        /* renamed from: p, reason: collision with root package name */
        public static final String f7510p = "ontouchup";

        /* renamed from: r, reason: collision with root package name */
        public static final String f7512r = "springboundary";

        /* renamed from: t, reason: collision with root package name */
        public static final String f7514t = "autocompletemode";

        /* renamed from: v, reason: collision with root package name */
        public static final String f7516v = "nestedscrollflags";

        /* renamed from: q, reason: collision with root package name */
        public static final String[] f7511q = {"autoComplete", "autoCompleteToStart", "autoCompleteToEnd", "stop", "decelerate", "decelerateAndComplete", "neverCompleteToStart", "neverCompleteToEnd"};

        /* renamed from: s, reason: collision with root package name */
        public static final String[] f7513s = {"overshoot", "bounceStart", "bounceEnd", "bounceBoth"};

        /* renamed from: u, reason: collision with root package name */
        public static final String[] f7515u = {"continuousVelocity", "spring"};

        /* renamed from: w, reason: collision with root package name */
        public static final String[] f7517w = {"none", "disablePostScroll", "disableScroll", "supportScrollUp"};
    }

    /* loaded from: classes.dex */
    public interface g {

        /* renamed from: a, reason: collision with root package name */
        public static final String f7518a = "KeyPosition";

        /* renamed from: b, reason: collision with root package name */
        public static final String f7519b = "transitionEasing";

        /* renamed from: c, reason: collision with root package name */
        public static final String f7520c = "drawPath";

        /* renamed from: d, reason: collision with root package name */
        public static final String f7521d = "percentWidth";

        /* renamed from: e, reason: collision with root package name */
        public static final String f7522e = "percentHeight";

        /* renamed from: f, reason: collision with root package name */
        public static final String f7523f = "sizePercent";

        /* renamed from: g, reason: collision with root package name */
        public static final String f7524g = "percentX";

        /* renamed from: h, reason: collision with root package name */
        public static final String f7525h = "percentY";

        /* renamed from: i, reason: collision with root package name */
        public static final int f7526i = 501;

        /* renamed from: j, reason: collision with root package name */
        public static final int f7527j = 502;

        /* renamed from: k, reason: collision with root package name */
        public static final int f7528k = 503;

        /* renamed from: l, reason: collision with root package name */
        public static final int f7529l = 504;

        /* renamed from: m, reason: collision with root package name */
        public static final int f7530m = 505;

        /* renamed from: n, reason: collision with root package name */
        public static final int f7531n = 506;

        /* renamed from: o, reason: collision with root package name */
        public static final int f7532o = 507;

        /* renamed from: p, reason: collision with root package name */
        public static final int f7533p = 508;

        /* renamed from: q, reason: collision with root package name */
        public static final int f7534q = 509;

        /* renamed from: r, reason: collision with root package name */
        public static final int f7535r = 510;

        /* renamed from: s, reason: collision with root package name */
        public static final String[] f7536s = {"transitionEasing", "drawPath", "percentWidth", "percentHeight", "sizePercent", "percentX", "percentY"};

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        static int a(String str) {
            char c4;
            str.hashCode();
            switch (str.hashCode()) {
                case -1812823328:
                    if (str.equals("transitionEasing")) {
                        c4 = 0;
                        break;
                    }
                    c4 = 65535;
                    break;
                case -1127236479:
                    if (str.equals("percentWidth")) {
                        c4 = 1;
                        break;
                    }
                    c4 = 65535;
                    break;
                case -1017587252:
                    if (str.equals("percentHeight")) {
                        c4 = 2;
                        break;
                    }
                    c4 = 65535;
                    break;
                case -827014263:
                    if (str.equals("drawPath")) {
                        c4 = 3;
                        break;
                    }
                    c4 = 65535;
                    break;
                case -200259324:
                    if (str.equals("sizePercent")) {
                        c4 = 4;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 428090547:
                    if (str.equals("percentX")) {
                        c4 = 5;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 428090548:
                    if (str.equals("percentY")) {
                        c4 = 6;
                        break;
                    }
                    c4 = 65535;
                    break;
                default:
                    c4 = 65535;
                    break;
            }
            switch (c4) {
                case 0:
                    return f7526i;
                case 1:
                    return f7528k;
                case 2:
                    return f7529l;
                case 3:
                    return f7527j;
                case 4:
                    return f7530m;
                case 5:
                    return f7531n;
                case 6:
                    return f7532o;
                default:
                    return -1;
            }
        }

        static int getType(int i4) {
            if (i4 == 100) {
                return 2;
            }
            if (i4 == 101) {
                return 8;
            }
            switch (i4) {
                case f7526i /* 501 */:
                case f7527j /* 502 */:
                    return 8;
                case f7528k /* 503 */:
                case f7529l /* 504 */:
                case f7530m /* 505 */:
                case f7531n /* 506 */:
                case f7532o /* 507 */:
                    return 4;
                case f7533p /* 508 */:
                    return 2;
                default:
                    return -1;
            }
        }
    }

    /* loaded from: classes.dex */
    public interface h {

        /* renamed from: a, reason: collision with root package name */
        public static final String f7537a = "Transitions";

        /* renamed from: c, reason: collision with root package name */
        public static final String f7539c = "from";

        /* renamed from: j, reason: collision with root package name */
        public static final int f7546j = 700;

        /* renamed from: k, reason: collision with root package name */
        public static final int f7547k = 701;

        /* renamed from: l, reason: collision with root package name */
        public static final int f7548l = 702;

        /* renamed from: m, reason: collision with root package name */
        public static final int f7549m = 509;

        /* renamed from: n, reason: collision with root package name */
        public static final int f7550n = 704;

        /* renamed from: o, reason: collision with root package name */
        public static final int f7551o = 705;

        /* renamed from: p, reason: collision with root package name */
        public static final int f7552p = 706;

        /* renamed from: q, reason: collision with root package name */
        public static final int f7553q = 707;

        /* renamed from: b, reason: collision with root package name */
        public static final String f7538b = "duration";

        /* renamed from: d, reason: collision with root package name */
        public static final String f7540d = "to";

        /* renamed from: e, reason: collision with root package name */
        public static final String f7541e = "pathMotionArc";

        /* renamed from: f, reason: collision with root package name */
        public static final String f7542f = "autoTransition";

        /* renamed from: g, reason: collision with root package name */
        public static final String f7543g = "motionInterpolator";

        /* renamed from: h, reason: collision with root package name */
        public static final String f7544h = "staggered";

        /* renamed from: i, reason: collision with root package name */
        public static final String f7545i = "transitionFlags";

        /* renamed from: r, reason: collision with root package name */
        public static final String[] f7554r = {f7538b, "from", f7540d, f7541e, f7542f, f7543g, f7544h, "from", f7545i};

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        static int a(String str) {
            char c4;
            str.hashCode();
            switch (str.hashCode()) {
                case -1996906958:
                    if (str.equals(f7545i)) {
                        c4 = 0;
                        break;
                    }
                    c4 = 65535;
                    break;
                case -1992012396:
                    if (str.equals(f7538b)) {
                        c4 = 1;
                        break;
                    }
                    c4 = 65535;
                    break;
                case -1357874275:
                    if (str.equals(f7543g)) {
                        c4 = 2;
                        break;
                    }
                    c4 = 65535;
                    break;
                case -1298065308:
                    if (str.equals(f7542f)) {
                        c4 = 3;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 3707:
                    if (str.equals(f7540d)) {
                        c4 = 4;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 3151786:
                    if (str.equals("from")) {
                        c4 = 5;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 1310733335:
                    if (str.equals(f7541e)) {
                        c4 = 6;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 1839260940:
                    if (str.equals(f7544h)) {
                        c4 = 7;
                        break;
                    }
                    c4 = 65535;
                    break;
                default:
                    c4 = 65535;
                    break;
            }
            switch (c4) {
                case 0:
                    return f7553q;
                case 1:
                    return f7546j;
                case 2:
                    return f7551o;
                case 3:
                    return f7550n;
                case 4:
                    return f7548l;
                case 5:
                    return f7547k;
                case 6:
                    return 509;
                case 7:
                    return f7552p;
                default:
                    return -1;
            }
        }

        static int getType(int i4) {
            if (i4 == 509) {
                return 2;
            }
            switch (i4) {
                case f7546j /* 700 */:
                    return 2;
                case f7547k /* 701 */:
                case f7548l /* 702 */:
                    return 8;
                default:
                    switch (i4) {
                        case f7551o /* 705 */:
                        case f7553q /* 707 */:
                            return 8;
                        case f7552p /* 706 */:
                            return 4;
                        default:
                            return -1;
                    }
            }
        }
    }

    /* loaded from: classes.dex */
    public interface i {

        /* renamed from: a, reason: collision with root package name */
        public static final String f7555a = "KeyTrigger";

        /* renamed from: b, reason: collision with root package name */
        public static final String f7556b = "viewTransitionOnCross";

        /* renamed from: c, reason: collision with root package name */
        public static final String f7557c = "viewTransitionOnPositiveCross";

        /* renamed from: d, reason: collision with root package name */
        public static final String f7558d = "viewTransitionOnNegativeCross";

        /* renamed from: e, reason: collision with root package name */
        public static final String f7559e = "postLayout";

        /* renamed from: f, reason: collision with root package name */
        public static final String f7560f = "triggerSlack";

        /* renamed from: g, reason: collision with root package name */
        public static final String f7561g = "triggerCollisionView";

        /* renamed from: h, reason: collision with root package name */
        public static final String f7562h = "triggerCollisionId";

        /* renamed from: i, reason: collision with root package name */
        public static final String f7563i = "triggerID";

        /* renamed from: j, reason: collision with root package name */
        public static final String f7564j = "positiveCross";

        /* renamed from: k, reason: collision with root package name */
        public static final String f7565k = "negativeCross";

        /* renamed from: l, reason: collision with root package name */
        public static final String f7566l = "triggerReceiver";

        /* renamed from: m, reason: collision with root package name */
        public static final String f7567m = "CROSS";

        /* renamed from: n, reason: collision with root package name */
        public static final String[] f7568n = {"viewTransitionOnCross", "viewTransitionOnPositiveCross", "viewTransitionOnNegativeCross", "postLayout", "triggerSlack", "triggerCollisionView", "triggerCollisionId", "triggerID", "positiveCross", "negativeCross", "triggerReceiver", "CROSS"};

        /* renamed from: o, reason: collision with root package name */
        public static final int f7569o = 301;

        /* renamed from: p, reason: collision with root package name */
        public static final int f7570p = 302;

        /* renamed from: q, reason: collision with root package name */
        public static final int f7571q = 303;

        /* renamed from: r, reason: collision with root package name */
        public static final int f7572r = 304;

        /* renamed from: s, reason: collision with root package name */
        public static final int f7573s = 305;

        /* renamed from: t, reason: collision with root package name */
        public static final int f7574t = 306;

        /* renamed from: u, reason: collision with root package name */
        public static final int f7575u = 307;

        /* renamed from: v, reason: collision with root package name */
        public static final int f7576v = 308;

        /* renamed from: w, reason: collision with root package name */
        public static final int f7577w = 309;

        /* renamed from: x, reason: collision with root package name */
        public static final int f7578x = 310;

        /* renamed from: y, reason: collision with root package name */
        public static final int f7579y = 311;

        /* renamed from: z, reason: collision with root package name */
        public static final int f7580z = 312;

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        static int a(String str) {
            char c4;
            str.hashCode();
            switch (str.hashCode()) {
                case -1594793529:
                    if (str.equals("positiveCross")) {
                        c4 = 0;
                        break;
                    }
                    c4 = 65535;
                    break;
                case -966421266:
                    if (str.equals("viewTransitionOnPositiveCross")) {
                        c4 = 1;
                        break;
                    }
                    c4 = 65535;
                    break;
                case -786670827:
                    if (str.equals("triggerCollisionId")) {
                        c4 = 2;
                        break;
                    }
                    c4 = 65535;
                    break;
                case -648752941:
                    if (str.equals("triggerID")) {
                        c4 = 3;
                        break;
                    }
                    c4 = 65535;
                    break;
                case -638126837:
                    if (str.equals("negativeCross")) {
                        c4 = 4;
                        break;
                    }
                    c4 = 65535;
                    break;
                case -76025313:
                    if (str.equals("triggerCollisionView")) {
                        c4 = 5;
                        break;
                    }
                    c4 = 65535;
                    break;
                case -9754574:
                    if (str.equals("viewTransitionOnNegativeCross")) {
                        c4 = 6;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 64397344:
                    if (str.equals("CROSS")) {
                        c4 = 7;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 364489912:
                    if (str.equals("triggerSlack")) {
                        c4 = '\b';
                        break;
                    }
                    c4 = 65535;
                    break;
                case 1301930599:
                    if (str.equals("viewTransitionOnCross")) {
                        c4 = '\t';
                        break;
                    }
                    c4 = 65535;
                    break;
                case 1401391082:
                    if (str.equals("postLayout")) {
                        c4 = '\n';
                        break;
                    }
                    c4 = 65535;
                    break;
                case 1535404999:
                    if (str.equals("triggerReceiver")) {
                        c4 = 11;
                        break;
                    }
                    c4 = 65535;
                    break;
                default:
                    c4 = 65535;
                    break;
            }
            switch (c4) {
                case 0:
                    return 309;
                case 1:
                    return 302;
                case 2:
                    return 307;
                case 3:
                    return 308;
                case 4:
                    return 310;
                case 5:
                    return 306;
                case 6:
                    return 303;
                case 7:
                    return 312;
                case '\b':
                    return 305;
                case '\t':
                    return 301;
                case '\n':
                    return 304;
                case 11:
                    return 311;
                default:
                    return -1;
            }
        }
    }

    int a(String str);

    boolean b(int i4, int i5);

    boolean c(int i4, float f4);

    boolean d(int i4, String str);

    boolean e(int i4, boolean z3);
}
