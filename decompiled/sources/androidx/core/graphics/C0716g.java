package androidx.core.graphics;

import android.graphics.BlendMode;
import android.graphics.PorterDuff;
import androidx.annotation.InterfaceC0577u;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: androidx.core.graphics.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C0716g {

    /* renamed from: androidx.core.graphics.g$a */
    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f12553a;

        static {
            int[] iArr = new int[BlendModeCompat.values().length];
            f12553a = iArr;
            try {
                iArr[BlendModeCompat.CLEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12553a[BlendModeCompat.SRC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12553a[BlendModeCompat.DST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12553a[BlendModeCompat.SRC_OVER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f12553a[BlendModeCompat.DST_OVER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f12553a[BlendModeCompat.SRC_IN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f12553a[BlendModeCompat.DST_IN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f12553a[BlendModeCompat.SRC_OUT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f12553a[BlendModeCompat.DST_OUT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f12553a[BlendModeCompat.SRC_ATOP.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f12553a[BlendModeCompat.DST_ATOP.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f12553a[BlendModeCompat.XOR.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f12553a[BlendModeCompat.PLUS.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f12553a[BlendModeCompat.MODULATE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f12553a[BlendModeCompat.SCREEN.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f12553a[BlendModeCompat.OVERLAY.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f12553a[BlendModeCompat.DARKEN.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f12553a[BlendModeCompat.LIGHTEN.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f12553a[BlendModeCompat.COLOR_DODGE.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f12553a[BlendModeCompat.COLOR_BURN.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f12553a[BlendModeCompat.HARD_LIGHT.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f12553a[BlendModeCompat.SOFT_LIGHT.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f12553a[BlendModeCompat.DIFFERENCE.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f12553a[BlendModeCompat.EXCLUSION.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f12553a[BlendModeCompat.MULTIPLY.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f12553a[BlendModeCompat.HUE.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f12553a[BlendModeCompat.SATURATION.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f12553a[BlendModeCompat.COLOR.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f12553a[BlendModeCompat.LUMINOSITY.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
        }
    }

    @androidx.annotation.W(ConstraintLayout.b.a.f9571D)
    /* renamed from: androidx.core.graphics.g$b */
    /* loaded from: classes.dex */
    static class b {
        private b() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @androidx.annotation.P
        @InterfaceC0577u
        public static Object a(@androidx.annotation.N BlendModeCompat blendModeCompat) {
            switch (a.f12553a[blendModeCompat.ordinal()]) {
                case 1:
                    return BlendMode.CLEAR;
                case 2:
                    return BlendMode.SRC;
                case 3:
                    return BlendMode.DST;
                case 4:
                    return BlendMode.SRC_OVER;
                case 5:
                    return BlendMode.DST_OVER;
                case 6:
                    return BlendMode.SRC_IN;
                case 7:
                    return BlendMode.DST_IN;
                case 8:
                    return BlendMode.SRC_OUT;
                case 9:
                    return BlendMode.DST_OUT;
                case 10:
                    return BlendMode.SRC_ATOP;
                case 11:
                    return BlendMode.DST_ATOP;
                case 12:
                    return BlendMode.XOR;
                case 13:
                    return BlendMode.PLUS;
                case 14:
                    return BlendMode.MODULATE;
                case 15:
                    return BlendMode.SCREEN;
                case 16:
                    return BlendMode.OVERLAY;
                case 17:
                    return BlendMode.DARKEN;
                case 18:
                    return BlendMode.LIGHTEN;
                case 19:
                    return BlendMode.COLOR_DODGE;
                case 20:
                    return BlendMode.COLOR_BURN;
                case 21:
                    return BlendMode.HARD_LIGHT;
                case 22:
                    return BlendMode.SOFT_LIGHT;
                case 23:
                    return BlendMode.DIFFERENCE;
                case 24:
                    return BlendMode.EXCLUSION;
                case 25:
                    return BlendMode.MULTIPLY;
                case 26:
                    return BlendMode.HUE;
                case 27:
                    return BlendMode.SATURATION;
                case 28:
                    return BlendMode.COLOR;
                case ConstraintLayout.b.a.f9571D /* 29 */:
                    return BlendMode.LUMINOSITY;
                default:
                    return null;
            }
        }
    }

    private C0716g() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.P
    public static PorterDuff.Mode a(@androidx.annotation.P BlendModeCompat blendModeCompat) {
        if (blendModeCompat == null) {
            return null;
        }
        switch (a.f12553a[blendModeCompat.ordinal()]) {
            case 1:
                return PorterDuff.Mode.CLEAR;
            case 2:
                return PorterDuff.Mode.SRC;
            case 3:
                return PorterDuff.Mode.DST;
            case 4:
                return PorterDuff.Mode.SRC_OVER;
            case 5:
                return PorterDuff.Mode.DST_OVER;
            case 6:
                return PorterDuff.Mode.SRC_IN;
            case 7:
                return PorterDuff.Mode.DST_IN;
            case 8:
                return PorterDuff.Mode.SRC_OUT;
            case 9:
                return PorterDuff.Mode.DST_OUT;
            case 10:
                return PorterDuff.Mode.SRC_ATOP;
            case 11:
                return PorterDuff.Mode.DST_ATOP;
            case 12:
                return PorterDuff.Mode.XOR;
            case 13:
                return PorterDuff.Mode.ADD;
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.OVERLAY;
            case 17:
                return PorterDuff.Mode.DARKEN;
            case 18:
                return PorterDuff.Mode.LIGHTEN;
            default:
                return null;
        }
    }
}
