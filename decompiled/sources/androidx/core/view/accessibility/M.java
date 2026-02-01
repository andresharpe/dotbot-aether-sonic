package androidx.core.view.accessibility;

import android.R;
import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.InterfaceC0577u;
import androidx.annotation.RestrictTo;
import androidx.annotation.W;
import androidx.core.os.C0738a;
import androidx.core.view.accessibility.U;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import m.C2356a;

/* loaded from: classes.dex */
public class M {

    /* renamed from: A, reason: collision with root package name */
    public static final int f13283A = 128;

    /* renamed from: B, reason: collision with root package name */
    public static final int f13284B = 256;

    /* renamed from: C, reason: collision with root package name */
    public static final int f13285C = 512;

    /* renamed from: D, reason: collision with root package name */
    public static final int f13286D = 1024;

    /* renamed from: E, reason: collision with root package name */
    public static final int f13287E = 2048;

    /* renamed from: F, reason: collision with root package name */
    public static final int f13288F = 4096;

    /* renamed from: G, reason: collision with root package name */
    public static final int f13289G = 8192;

    /* renamed from: H, reason: collision with root package name */
    public static final int f13290H = 16384;

    /* renamed from: I, reason: collision with root package name */
    public static final int f13291I = 32768;

    /* renamed from: J, reason: collision with root package name */
    public static final int f13292J = 65536;

    /* renamed from: K, reason: collision with root package name */
    public static final int f13293K = 131072;

    /* renamed from: L, reason: collision with root package name */
    public static final int f13294L = 262144;

    /* renamed from: M, reason: collision with root package name */
    public static final int f13295M = 524288;

    /* renamed from: N, reason: collision with root package name */
    public static final int f13296N = 1048576;

    /* renamed from: O, reason: collision with root package name */
    public static final int f13297O = 2097152;

    /* renamed from: P, reason: collision with root package name */
    public static final String f13298P = "ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT";

    /* renamed from: Q, reason: collision with root package name */
    public static final String f13299Q = "ACTION_ARGUMENT_HTML_ELEMENT_STRING";

    /* renamed from: R, reason: collision with root package name */
    public static final String f13300R = "ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN";

    /* renamed from: S, reason: collision with root package name */
    public static final String f13301S = "ACTION_ARGUMENT_SELECTION_START_INT";

    /* renamed from: T, reason: collision with root package name */
    public static final String f13302T = "ACTION_ARGUMENT_SELECTION_END_INT";

    /* renamed from: U, reason: collision with root package name */
    public static final String f13303U = "ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE";

    /* renamed from: V, reason: collision with root package name */
    public static final String f13304V = "android.view.accessibility.action.ARGUMENT_ROW_INT";

    /* renamed from: W, reason: collision with root package name */
    public static final String f13305W = "android.view.accessibility.action.ARGUMENT_COLUMN_INT";

    /* renamed from: X, reason: collision with root package name */
    public static final String f13306X = "android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE";

    /* renamed from: Y, reason: collision with root package name */
    public static final String f13307Y = "ACTION_ARGUMENT_MOVE_WINDOW_X";

    /* renamed from: Z, reason: collision with root package name */
    public static final String f13308Z = "ACTION_ARGUMENT_MOVE_WINDOW_Y";

    /* renamed from: a0, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f13309a0 = "android.view.accessibility.action.ARGUMENT_PRESS_AND_HOLD_DURATION_MILLIS_INT";

    /* renamed from: b0, reason: collision with root package name */
    public static final int f13310b0 = 1;

    /* renamed from: c0, reason: collision with root package name */
    public static final int f13311c0 = 2;

    /* renamed from: d, reason: collision with root package name */
    private static final String f13312d = "AccessibilityNodeInfo.roleDescription";

    /* renamed from: d0, reason: collision with root package name */
    public static final int f13313d0 = 1;

    /* renamed from: e, reason: collision with root package name */
    private static final String f13314e = "androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY";

    /* renamed from: e0, reason: collision with root package name */
    public static final int f13315e0 = 2;

    /* renamed from: f, reason: collision with root package name */
    private static final String f13316f = "androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY";

    /* renamed from: f0, reason: collision with root package name */
    public static final int f13317f0 = 4;

    /* renamed from: g, reason: collision with root package name */
    private static final String f13318g = "androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY";

    /* renamed from: g0, reason: collision with root package name */
    public static final int f13319g0 = 8;

    /* renamed from: h, reason: collision with root package name */
    private static final String f13320h = "androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY";

    /* renamed from: h0, reason: collision with root package name */
    public static final int f13321h0 = 16;

    /* renamed from: i, reason: collision with root package name */
    private static final String f13322i = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY";

    /* renamed from: i0, reason: collision with root package name */
    public static final String f13323i0 = "android.core.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY";

    /* renamed from: j, reason: collision with root package name */
    private static final String f13324j = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY";

    /* renamed from: j0, reason: collision with root package name */
    public static final String f13325j0 = "android.core.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX";

    /* renamed from: k, reason: collision with root package name */
    private static final String f13326k = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY";

    /* renamed from: k0, reason: collision with root package name */
    public static final String f13327k0 = "android.core.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH";

    /* renamed from: l, reason: collision with root package name */
    private static final String f13328l = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY";

    /* renamed from: l0, reason: collision with root package name */
    public static final int f13329l0 = 20000;

    /* renamed from: m, reason: collision with root package name */
    private static final String f13330m = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY";

    /* renamed from: m0, reason: collision with root package name */
    private static int f13331m0 = 0;

    /* renamed from: n, reason: collision with root package name */
    private static final String f13332n = "androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY";

    /* renamed from: o, reason: collision with root package name */
    private static final String f13333o = "androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY";

    /* renamed from: p, reason: collision with root package name */
    private static final int f13334p = 1;

    /* renamed from: q, reason: collision with root package name */
    private static final int f13335q = 2;

    /* renamed from: r, reason: collision with root package name */
    private static final int f13336r = 4;

    /* renamed from: s, reason: collision with root package name */
    private static final int f13337s = 8;

    /* renamed from: t, reason: collision with root package name */
    public static final int f13338t = 1;

    /* renamed from: u, reason: collision with root package name */
    public static final int f13339u = 2;

    /* renamed from: v, reason: collision with root package name */
    public static final int f13340v = 4;

    /* renamed from: w, reason: collision with root package name */
    public static final int f13341w = 8;

    /* renamed from: x, reason: collision with root package name */
    public static final int f13342x = 16;

    /* renamed from: y, reason: collision with root package name */
    public static final int f13343y = 32;

    /* renamed from: z, reason: collision with root package name */
    public static final int f13344z = 64;

    /* renamed from: a, reason: collision with root package name */
    private final AccessibilityNodeInfo f13345a;

    /* renamed from: b, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int f13346b = -1;

    /* renamed from: c, reason: collision with root package name */
    private int f13347c = -1;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: B, reason: collision with root package name */
        public static final a f13349B;

        /* renamed from: C, reason: collision with root package name */
        public static final a f13350C;

        /* renamed from: D, reason: collision with root package name */
        public static final a f13351D;

        /* renamed from: E, reason: collision with root package name */
        public static final a f13352E;

        /* renamed from: F, reason: collision with root package name */
        public static final a f13353F;

        /* renamed from: G, reason: collision with root package name */
        public static final a f13354G;

        /* renamed from: H, reason: collision with root package name */
        @androidx.annotation.N
        public static final a f13355H;

        /* renamed from: I, reason: collision with root package name */
        @androidx.annotation.N
        public static final a f13356I;

        /* renamed from: J, reason: collision with root package name */
        @androidx.annotation.N
        public static final a f13357J;

        /* renamed from: K, reason: collision with root package name */
        @androidx.annotation.N
        public static final a f13358K;

        /* renamed from: L, reason: collision with root package name */
        public static final a f13359L;

        /* renamed from: M, reason: collision with root package name */
        public static final a f13360M;

        /* renamed from: N, reason: collision with root package name */
        public static final a f13361N;

        /* renamed from: O, reason: collision with root package name */
        public static final a f13362O;

        /* renamed from: P, reason: collision with root package name */
        public static final a f13363P;

        /* renamed from: Q, reason: collision with root package name */
        @androidx.annotation.N
        public static final a f13364Q;

        /* renamed from: R, reason: collision with root package name */
        @androidx.annotation.N
        public static final a f13365R;

        /* renamed from: S, reason: collision with root package name */
        @androidx.annotation.N
        public static final a f13366S;

        /* renamed from: T, reason: collision with root package name */
        @androidx.annotation.N
        public static final a f13367T;

        /* renamed from: U, reason: collision with root package name */
        @androidx.annotation.N
        public static final a f13368U;

        /* renamed from: V, reason: collision with root package name */
        @androidx.annotation.N
        public static final a f13369V;

        /* renamed from: e, reason: collision with root package name */
        private static final String f13370e = "A11yActionCompat";

        /* renamed from: a, reason: collision with root package name */
        final Object f13392a;

        /* renamed from: b, reason: collision with root package name */
        private final int f13393b;

        /* renamed from: c, reason: collision with root package name */
        private final Class<? extends U.a> f13394c;

        /* renamed from: d, reason: collision with root package name */
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        protected final U f13395d;

        /* renamed from: f, reason: collision with root package name */
        public static final a f13371f = new a(1, null);

        /* renamed from: g, reason: collision with root package name */
        public static final a f13372g = new a(2, null);

        /* renamed from: h, reason: collision with root package name */
        public static final a f13373h = new a(4, null);

        /* renamed from: i, reason: collision with root package name */
        public static final a f13374i = new a(8, null);

        /* renamed from: j, reason: collision with root package name */
        public static final a f13375j = new a(16, null);

        /* renamed from: k, reason: collision with root package name */
        public static final a f13376k = new a(32, null);

        /* renamed from: l, reason: collision with root package name */
        public static final a f13377l = new a(64, null);

        /* renamed from: m, reason: collision with root package name */
        public static final a f13378m = new a(128, null);

        /* renamed from: n, reason: collision with root package name */
        public static final a f13379n = new a(256, (CharSequence) null, (Class<? extends U.a>) U.b.class);

        /* renamed from: o, reason: collision with root package name */
        public static final a f13380o = new a(512, (CharSequence) null, (Class<? extends U.a>) U.b.class);

        /* renamed from: p, reason: collision with root package name */
        public static final a f13381p = new a(1024, (CharSequence) null, (Class<? extends U.a>) U.c.class);

        /* renamed from: q, reason: collision with root package name */
        public static final a f13382q = new a(2048, (CharSequence) null, (Class<? extends U.a>) U.c.class);

        /* renamed from: r, reason: collision with root package name */
        public static final a f13383r = new a(4096, null);

        /* renamed from: s, reason: collision with root package name */
        public static final a f13384s = new a(8192, null);

        /* renamed from: t, reason: collision with root package name */
        public static final a f13385t = new a(16384, null);

        /* renamed from: u, reason: collision with root package name */
        public static final a f13386u = new a(32768, null);

        /* renamed from: v, reason: collision with root package name */
        public static final a f13387v = new a(65536, null);

        /* renamed from: w, reason: collision with root package name */
        public static final a f13388w = new a(131072, (CharSequence) null, (Class<? extends U.a>) U.g.class);

        /* renamed from: x, reason: collision with root package name */
        public static final a f13389x = new a(262144, null);

        /* renamed from: y, reason: collision with root package name */
        public static final a f13390y = new a(524288, null);

        /* renamed from: z, reason: collision with root package name */
        public static final a f13391z = new a(1048576, null);

        /* renamed from: A, reason: collision with root package name */
        public static final a f13348A = new a(2097152, (CharSequence) null, (Class<? extends U.a>) U.h.class);

        static {
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction2;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction3;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction4;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction5;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction6;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction7;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction8;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction9;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction10;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction11;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction12;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction13;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction14;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction15;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction16;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction17;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction18;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction19;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction20;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction21;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction22;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction23;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction24;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction25 = null;
            int i4 = Build.VERSION.SDK_INT;
            f13349B = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
            f13350C = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, U.e.class);
            f13351D = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
            f13352E = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
            f13353F = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
            f13354G = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
            if (i4 >= 29) {
                accessibilityAction24 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP;
                accessibilityAction = accessibilityAction24;
            } else {
                accessibilityAction = null;
            }
            f13355H = new a(accessibilityAction, R.id.accessibilityActionPageUp, null, null, null);
            if (i4 >= 29) {
                accessibilityAction23 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN;
                accessibilityAction2 = accessibilityAction23;
            } else {
                accessibilityAction2 = null;
            }
            f13356I = new a(accessibilityAction2, R.id.accessibilityActionPageDown, null, null, null);
            if (i4 >= 29) {
                accessibilityAction22 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT;
                accessibilityAction3 = accessibilityAction22;
            } else {
                accessibilityAction3 = null;
            }
            f13357J = new a(accessibilityAction3, R.id.accessibilityActionPageLeft, null, null, null);
            if (i4 >= 29) {
                accessibilityAction21 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT;
                accessibilityAction4 = accessibilityAction21;
            } else {
                accessibilityAction4 = null;
            }
            f13358K = new a(accessibilityAction4, R.id.accessibilityActionPageRight, null, null, null);
            f13359L = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
            f13360M = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, U.f.class);
            if (i4 >= 26) {
                accessibilityAction20 = AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW;
                accessibilityAction5 = accessibilityAction20;
            } else {
                accessibilityAction5 = null;
            }
            f13361N = new a(accessibilityAction5, R.id.accessibilityActionMoveWindow, null, null, U.d.class);
            if (i4 >= 28) {
                accessibilityAction19 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP;
                accessibilityAction6 = accessibilityAction19;
            } else {
                accessibilityAction6 = null;
            }
            f13362O = new a(accessibilityAction6, R.id.accessibilityActionShowTooltip, null, null, null);
            if (i4 >= 28) {
                accessibilityAction18 = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
                accessibilityAction7 = accessibilityAction18;
            } else {
                accessibilityAction7 = null;
            }
            f13363P = new a(accessibilityAction7, R.id.accessibilityActionHideTooltip, null, null, null);
            if (i4 >= 30) {
                accessibilityAction17 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD;
                accessibilityAction8 = accessibilityAction17;
            } else {
                accessibilityAction8 = null;
            }
            f13364Q = new a(accessibilityAction8, R.id.accessibilityActionPressAndHold, null, null, null);
            if (i4 >= 30) {
                accessibilityAction16 = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
                accessibilityAction9 = accessibilityAction16;
            } else {
                accessibilityAction9 = null;
            }
            f13365R = new a(accessibilityAction9, R.id.accessibilityActionImeEnter, null, null, null);
            if (i4 >= 32) {
                accessibilityAction15 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START;
                accessibilityAction10 = accessibilityAction15;
            } else {
                accessibilityAction10 = null;
            }
            f13366S = new a(accessibilityAction10, R.id.ALT, null, null, null);
            if (i4 >= 32) {
                accessibilityAction14 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP;
                accessibilityAction11 = accessibilityAction14;
            } else {
                accessibilityAction11 = null;
            }
            f13367T = new a(accessibilityAction11, R.id.CTRL, null, null, null);
            if (i4 >= 32) {
                accessibilityAction13 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL;
                accessibilityAction12 = accessibilityAction13;
            } else {
                accessibilityAction12 = null;
            }
            f13368U = new a(accessibilityAction12, R.id.FUNCTION, null, null, null);
            if (i4 >= 33) {
                accessibilityAction25 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS;
            }
            f13369V = new a(accessibilityAction25, R.id.KEYCODE_0, null, null, null);
        }

        public a(int i4, CharSequence charSequence) {
            this(null, i4, charSequence, null, null);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public a a(CharSequence charSequence, U u3) {
            return new a(null, this.f13393b, charSequence, u3, this.f13394c);
        }

        public int b() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f13392a).getId();
        }

        public CharSequence c() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f13392a).getLabel();
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public boolean d(View view, Bundle bundle) {
            String name;
            U.a newInstance;
            if (this.f13395d == null) {
                return false;
            }
            Class<? extends U.a> cls = this.f13394c;
            U.a aVar = null;
            if (cls != null) {
                try {
                    newInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Exception e4) {
                    e = e4;
                }
                try {
                    newInstance.a(bundle);
                    aVar = newInstance;
                } catch (Exception e5) {
                    e = e5;
                    aVar = newInstance;
                    Class<? extends U.a> cls2 = this.f13394c;
                    if (cls2 == null) {
                        name = "null";
                    } else {
                        name = cls2.getName();
                    }
                    Log.e(f13370e, "Failed to execute command with argument class ViewCommandArgument: " + name, e);
                    return this.f13395d.a(view, aVar);
                }
            }
            return this.f13395d.a(view, aVar);
        }

        public boolean equals(@androidx.annotation.P Object obj) {
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            Object obj2 = this.f13392a;
            if (obj2 == null) {
                if (aVar.f13392a != null) {
                    return false;
                }
                return true;
            }
            if (!obj2.equals(aVar.f13392a)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            Object obj = this.f13392a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public a(int i4, CharSequence charSequence, U u3) {
            this(null, i4, charSequence, u3, null);
        }

        a(Object obj) {
            this(obj, 0, null, null, null);
        }

        private a(int i4, CharSequence charSequence, Class<? extends U.a> cls) {
            this(null, i4, charSequence, null, cls);
        }

        a(Object obj, int i4, CharSequence charSequence, U u3, Class<? extends U.a> cls) {
            this.f13393b = i4;
            this.f13395d = u3;
            if (obj == null) {
                this.f13392a = new AccessibilityNodeInfo.AccessibilityAction(i4, charSequence);
            } else {
                this.f13392a = obj;
            }
            this.f13394c = cls;
        }
    }

    @W(33)
    /* loaded from: classes.dex */
    private static class b {
        private b() {
        }

        @InterfaceC0577u
        public static AccessibilityNodeInfo.ExtraRenderingInfo a(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getExtraRenderingInfo();
        }

        @InterfaceC0577u
        public static boolean b(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isTextSelectable();
        }

        @InterfaceC0577u
        public static void c(AccessibilityNodeInfo accessibilityNodeInfo, boolean z3) {
            accessibilityNodeInfo.setTextSelectable(z3);
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: b, reason: collision with root package name */
        public static final int f13396b = 0;

        /* renamed from: c, reason: collision with root package name */
        public static final int f13397c = 1;

        /* renamed from: d, reason: collision with root package name */
        public static final int f13398d = 2;

        /* renamed from: a, reason: collision with root package name */
        final Object f13399a;

        c(Object obj) {
            this.f13399a = obj;
        }

        public static c e(int i4, int i5, boolean z3) {
            return new c(AccessibilityNodeInfo.CollectionInfo.obtain(i4, i5, z3));
        }

        public static c f(int i4, int i5, boolean z3, int i6) {
            return new c(AccessibilityNodeInfo.CollectionInfo.obtain(i4, i5, z3, i6));
        }

        public int a() {
            return ((AccessibilityNodeInfo.CollectionInfo) this.f13399a).getColumnCount();
        }

        public int b() {
            return ((AccessibilityNodeInfo.CollectionInfo) this.f13399a).getRowCount();
        }

        public int c() {
            return ((AccessibilityNodeInfo.CollectionInfo) this.f13399a).getSelectionMode();
        }

        public boolean d() {
            return ((AccessibilityNodeInfo.CollectionInfo) this.f13399a).isHierarchical();
        }
    }

    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        final Object f13400a;

        d(Object obj) {
            this.f13400a = obj;
        }

        public static d g(int i4, int i5, int i6, int i7, boolean z3) {
            return new d(AccessibilityNodeInfo.CollectionItemInfo.obtain(i4, i5, i6, i7, z3));
        }

        public static d h(int i4, int i5, int i6, int i7, boolean z3, boolean z4) {
            return new d(AccessibilityNodeInfo.CollectionItemInfo.obtain(i4, i5, i6, i7, z3, z4));
        }

        public int a() {
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.f13400a).getColumnIndex();
        }

        public int b() {
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.f13400a).getColumnSpan();
        }

        public int c() {
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.f13400a).getRowIndex();
        }

        public int d() {
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.f13400a).getRowSpan();
        }

        @Deprecated
        public boolean e() {
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.f13400a).isHeading();
        }

        public boolean f() {
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.f13400a).isSelected();
        }
    }

    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: b, reason: collision with root package name */
        public static final int f13401b = 0;

        /* renamed from: c, reason: collision with root package name */
        public static final int f13402c = 1;

        /* renamed from: d, reason: collision with root package name */
        public static final int f13403d = 2;

        /* renamed from: a, reason: collision with root package name */
        final Object f13404a;

        e(Object obj) {
            this.f13404a = obj;
        }

        public static e e(int i4, float f4, float f5, float f6) {
            return new e(AccessibilityNodeInfo.RangeInfo.obtain(i4, f4, f5, f6));
        }

        public float a() {
            return ((AccessibilityNodeInfo.RangeInfo) this.f13404a).getCurrent();
        }

        public float b() {
            return ((AccessibilityNodeInfo.RangeInfo) this.f13404a).getMax();
        }

        public float c() {
            return ((AccessibilityNodeInfo.RangeInfo) this.f13404a).getMin();
        }

        public int d() {
            return ((AccessibilityNodeInfo.RangeInfo) this.f13404a).getType();
        }
    }

    @Deprecated
    public M(Object obj) {
        this.f13345a = (AccessibilityNodeInfo) obj;
    }

    public static M F0() {
        return c2(AccessibilityNodeInfo.obtain());
    }

    public static M G0(View view) {
        return c2(AccessibilityNodeInfo.obtain(view));
    }

    public static M H0(View view, int i4) {
        return d2(AccessibilityNodeInfo.obtain(view, i4));
    }

    public static M I0(M m4) {
        return c2(AccessibilityNodeInfo.obtain(m4.f13345a));
    }

    private SparseArray<WeakReference<ClickableSpan>> N(View view) {
        SparseArray<WeakReference<ClickableSpan>> T3 = T(view);
        if (T3 == null) {
            SparseArray<WeakReference<ClickableSpan>> sparseArray = new SparseArray<>();
            view.setTag(C2356a.e.f54932e0, sparseArray);
            return sparseArray;
        }
        return T3;
    }

    private void Q0(View view) {
        SparseArray<WeakReference<ClickableSpan>> T3 = T(view);
        if (T3 != null) {
            ArrayList arrayList = new ArrayList();
            for (int i4 = 0; i4 < T3.size(); i4++) {
                if (T3.valueAt(i4).get() == null) {
                    arrayList.add(Integer.valueOf(i4));
                }
            }
            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                T3.remove(((Integer) arrayList.get(i5)).intValue());
            }
        }
    }

    private SparseArray<WeakReference<ClickableSpan>> T(View view) {
        return (SparseArray) view.getTag(C2356a.e.f54932e0);
    }

    private void T0(int i4, boolean z3) {
        Bundle E3 = E();
        if (E3 != null) {
            int i5 = E3.getInt(f13320h, 0) & (~i4);
            if (!z3) {
                i4 = 0;
            }
            E3.putInt(f13320h, i4 | i5);
        }
    }

    public static M c2(@androidx.annotation.N AccessibilityNodeInfo accessibilityNodeInfo) {
        return new M(accessibilityNodeInfo);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static M d2(Object obj) {
        if (obj != null) {
            return new M(obj);
        }
        return null;
    }

    private void e(ClickableSpan clickableSpan, Spanned spanned, int i4) {
        i(f13324j).add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        i(f13326k).add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        i(f13328l).add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        i(f13322i).add(Integer.valueOf(i4));
    }

    private boolean g0() {
        return !i(f13324j).isEmpty();
    }

    private void h() {
        this.f13345a.getExtras().remove(f13324j);
        this.f13345a.getExtras().remove(f13326k);
        this.f13345a.getExtras().remove(f13328l);
        this.f13345a.getExtras().remove(f13322i);
    }

    private int h0(ClickableSpan clickableSpan, SparseArray<WeakReference<ClickableSpan>> sparseArray) {
        if (sparseArray != null) {
            for (int i4 = 0; i4 < sparseArray.size(); i4++) {
                if (clickableSpan.equals(sparseArray.valueAt(i4).get())) {
                    return sparseArray.keyAt(i4);
                }
            }
        }
        int i5 = f13331m0;
        f13331m0 = i5 + 1;
        return i5;
    }

    private List<Integer> i(String str) {
        ArrayList<Integer> integerArrayList = this.f13345a.getExtras().getIntegerArrayList(str);
        if (integerArrayList == null) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            this.f13345a.getExtras().putIntegerArrayList(str, arrayList);
            return arrayList;
        }
        return integerArrayList;
    }

    private static String o(int i4) {
        if (i4 != 1) {
            if (i4 != 2) {
                switch (i4) {
                    case 4:
                        return "ACTION_SELECT";
                    case 8:
                        return "ACTION_CLEAR_SELECTION";
                    case 16:
                        return "ACTION_CLICK";
                    case 32:
                        return "ACTION_LONG_CLICK";
                    case 64:
                        return "ACTION_ACCESSIBILITY_FOCUS";
                    case 128:
                        return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
                    case 256:
                        return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
                    case 512:
                        return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
                    case 1024:
                        return "ACTION_NEXT_HTML_ELEMENT";
                    case 2048:
                        return "ACTION_PREVIOUS_HTML_ELEMENT";
                    case 4096:
                        return "ACTION_SCROLL_FORWARD";
                    case 8192:
                        return "ACTION_SCROLL_BACKWARD";
                    case 16384:
                        return "ACTION_COPY";
                    case 32768:
                        return "ACTION_PASTE";
                    case 65536:
                        return "ACTION_CUT";
                    case 131072:
                        return "ACTION_SET_SELECTION";
                    case 262144:
                        return "ACTION_EXPAND";
                    case 524288:
                        return "ACTION_COLLAPSE";
                    case 2097152:
                        return "ACTION_SET_TEXT";
                    case R.id.accessibilityActionMoveWindow:
                        return "ACTION_MOVE_WINDOW";
                    default:
                        switch (i4) {
                            case R.id.accessibilityActionShowOnScreen:
                                return "ACTION_SHOW_ON_SCREEN";
                            case R.id.accessibilityActionScrollToPosition:
                                return "ACTION_SCROLL_TO_POSITION";
                            case R.id.accessibilityActionScrollUp:
                                return "ACTION_SCROLL_UP";
                            case R.id.accessibilityActionScrollLeft:
                                return "ACTION_SCROLL_LEFT";
                            case R.id.accessibilityActionScrollDown:
                                return "ACTION_SCROLL_DOWN";
                            case R.id.accessibilityActionScrollRight:
                                return "ACTION_SCROLL_RIGHT";
                            case R.id.accessibilityActionContextClick:
                                return "ACTION_CONTEXT_CLICK";
                            case R.id.accessibilityActionSetProgress:
                                return "ACTION_SET_PROGRESS";
                            default:
                                switch (i4) {
                                    case R.id.accessibilityActionShowTooltip:
                                        return "ACTION_SHOW_TOOLTIP";
                                    case R.id.accessibilityActionHideTooltip:
                                        return "ACTION_HIDE_TOOLTIP";
                                    case R.id.accessibilityActionPageUp:
                                        return "ACTION_PAGE_UP";
                                    case R.id.accessibilityActionPageDown:
                                        return "ACTION_PAGE_DOWN";
                                    case R.id.accessibilityActionPageLeft:
                                        return "ACTION_PAGE_LEFT";
                                    case R.id.accessibilityActionPageRight:
                                        return "ACTION_PAGE_RIGHT";
                                    case R.id.accessibilityActionPressAndHold:
                                        return "ACTION_PRESS_AND_HOLD";
                                    default:
                                        switch (i4) {
                                            case R.id.accessibilityActionImeEnter:
                                                return "ACTION_IME_ENTER";
                                            case R.id.ALT:
                                                return "ACTION_DRAG_START";
                                            case R.id.CTRL:
                                                return "ACTION_DRAG_DROP";
                                            case R.id.FUNCTION:
                                                return "ACTION_DRAG_CANCEL";
                                            default:
                                                return "ACTION_UNKNOWN";
                                        }
                                }
                        }
                }
            }
            return "ACTION_CLEAR_FOCUS";
        }
        return "ACTION_FOCUS";
    }

    private boolean r(int i4) {
        Bundle E3 = E();
        if (E3 == null || (E3.getInt(f13320h, 0) & i4) != i4) {
            return false;
        }
        return true;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static ClickableSpan[] x(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    public CharSequence A() {
        return this.f13345a.getContentDescription();
    }

    public boolean A0() {
        return this.f13345a.isSelected();
    }

    public void A1(CharSequence charSequence) {
        this.f13345a.setPackageName(charSequence);
    }

    public int B() {
        return this.f13345a.getDrawingOrder();
    }

    public boolean B0() {
        boolean isShowingHintText;
        if (Build.VERSION.SDK_INT >= 26) {
            isShowingHintText = this.f13345a.isShowingHintText();
            return isShowingHintText;
        }
        return r(4);
    }

    public void B1(@androidx.annotation.P CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f13345a.setPaneTitle(charSequence);
        } else {
            this.f13345a.getExtras().putCharSequence(f13314e, charSequence);
        }
    }

    public CharSequence C() {
        return this.f13345a.getError();
    }

    public boolean C0() {
        boolean isTextEntryKey;
        if (Build.VERSION.SDK_INT >= 29) {
            isTextEntryKey = this.f13345a.isTextEntryKey();
            return isTextEntryKey;
        }
        return r(8);
    }

    public void C1(View view) {
        this.f13346b = -1;
        this.f13345a.setParent(view);
    }

    @androidx.annotation.P
    public AccessibilityNodeInfo.ExtraRenderingInfo D() {
        if (Build.VERSION.SDK_INT >= 33) {
            return b.a(this.f13345a);
        }
        return null;
    }

    public boolean D0() {
        if (Build.VERSION.SDK_INT >= 33) {
            return b.b(this.f13345a);
        }
        return false;
    }

    public void D1(View view, int i4) {
        this.f13346b = i4;
        this.f13345a.setParent(view, i4);
    }

    public Bundle E() {
        return this.f13345a.getExtras();
    }

    public boolean E0() {
        return this.f13345a.isVisibleToUser();
    }

    public void E1(boolean z3) {
        this.f13345a.setPassword(z3);
    }

    @androidx.annotation.P
    public CharSequence F() {
        CharSequence hintText;
        if (Build.VERSION.SDK_INT >= 26) {
            hintText = this.f13345a.getHintText();
            return hintText;
        }
        return this.f13345a.getExtras().getCharSequence(f13318g);
    }

    public void F1(e eVar) {
        this.f13345a.setRangeInfo((AccessibilityNodeInfo.RangeInfo) eVar.f13404a);
    }

    @Deprecated
    public Object G() {
        return this.f13345a;
    }

    public void G1(@androidx.annotation.P CharSequence charSequence) {
        this.f13345a.getExtras().putCharSequence(f13312d, charSequence);
    }

    public int H() {
        return this.f13345a.getInputType();
    }

    public void H1(boolean z3) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f13345a.setScreenReaderFocusable(z3);
        } else {
            T0(1, z3);
        }
    }

    public M I() {
        return d2(this.f13345a.getLabelFor());
    }

    public void I1(boolean z3) {
        this.f13345a.setScrollable(z3);
    }

    public M J() {
        return d2(this.f13345a.getLabeledBy());
    }

    public boolean J0(int i4) {
        return this.f13345a.performAction(i4);
    }

    public void J1(boolean z3) {
        this.f13345a.setSelected(z3);
    }

    public int K() {
        return this.f13345a.getLiveRegion();
    }

    public boolean K0(int i4, Bundle bundle) {
        return this.f13345a.performAction(i4, bundle);
    }

    public void K1(boolean z3) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f13345a.setShowingHintText(z3);
        } else {
            T0(4, z3);
        }
    }

    public int L() {
        return this.f13345a.getMaxTextLength();
    }

    public void L0() {
        this.f13345a.recycle();
    }

    public void L1(View view) {
        this.f13347c = -1;
        this.f13345a.setSource(view);
    }

    public int M() {
        return this.f13345a.getMovementGranularities();
    }

    public boolean M0() {
        return this.f13345a.refresh();
    }

    public void M1(View view, int i4) {
        this.f13347c = i4;
        this.f13345a.setSource(view, i4);
    }

    public boolean N0(a aVar) {
        return this.f13345a.removeAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f13392a);
    }

    public void N1(@androidx.annotation.P CharSequence charSequence) {
        if (C0738a.h()) {
            this.f13345a.setStateDescription(charSequence);
        } else {
            this.f13345a.getExtras().putCharSequence(f13332n, charSequence);
        }
    }

    public CharSequence O() {
        return this.f13345a.getPackageName();
    }

    public boolean O0(View view) {
        return this.f13345a.removeChild(view);
    }

    public void O1(CharSequence charSequence) {
        this.f13345a.setText(charSequence);
    }

    @androidx.annotation.P
    public CharSequence P() {
        CharSequence paneTitle;
        if (Build.VERSION.SDK_INT >= 28) {
            paneTitle = this.f13345a.getPaneTitle();
            return paneTitle;
        }
        return this.f13345a.getExtras().getCharSequence(f13314e);
    }

    public boolean P0(View view, int i4) {
        return this.f13345a.removeChild(view, i4);
    }

    public void P1(boolean z3) {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f13345a.setTextEntryKey(z3);
        } else {
            T0(8, z3);
        }
    }

    public M Q() {
        return d2(this.f13345a.getParent());
    }

    public void Q1(boolean z3) {
        if (Build.VERSION.SDK_INT >= 33) {
            b.c(this.f13345a, z3);
        }
    }

    public e R() {
        AccessibilityNodeInfo.RangeInfo rangeInfo = this.f13345a.getRangeInfo();
        if (rangeInfo != null) {
            return new e(rangeInfo);
        }
        return null;
    }

    public void R0(boolean z3) {
        this.f13345a.setAccessibilityFocused(z3);
    }

    public void R1(int i4, int i5) {
        this.f13345a.setTextSelection(i4, i5);
    }

    @androidx.annotation.P
    public CharSequence S() {
        return this.f13345a.getExtras().getCharSequence(f13312d);
    }

    public void S0(@androidx.annotation.N List<String> list) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f13345a.setAvailableExtraData(list);
        }
    }

    public void S1(@androidx.annotation.P CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f13345a.setTooltipText(charSequence);
        } else {
            this.f13345a.getExtras().putCharSequence(f13316f, charSequence);
        }
    }

    public void T1(@androidx.annotation.N f fVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f13345a.setTouchDelegateInfo(fVar.f13405a);
        }
    }

    @androidx.annotation.P
    public CharSequence U() {
        CharSequence stateDescription;
        if (C0738a.h()) {
            stateDescription = this.f13345a.getStateDescription();
            return stateDescription;
        }
        return this.f13345a.getExtras().getCharSequence(f13332n);
    }

    @Deprecated
    public void U0(Rect rect) {
        this.f13345a.setBoundsInParent(rect);
    }

    public void U1(View view) {
        this.f13345a.setTraversalAfter(view);
    }

    public CharSequence V() {
        if (g0()) {
            List<Integer> i4 = i(f13324j);
            List<Integer> i5 = i(f13326k);
            List<Integer> i6 = i(f13328l);
            List<Integer> i7 = i(f13322i);
            SpannableString spannableString = new SpannableString(TextUtils.substring(this.f13345a.getText(), 0, this.f13345a.getText().length()));
            for (int i8 = 0; i8 < i4.size(); i8++) {
                spannableString.setSpan(new C0774a(i7.get(i8).intValue(), this, E().getInt(f13330m)), i4.get(i8).intValue(), i5.get(i8).intValue(), i6.get(i8).intValue());
            }
            return spannableString;
        }
        return this.f13345a.getText();
    }

    public void V0(Rect rect) {
        this.f13345a.setBoundsInScreen(rect);
    }

    public void V1(View view, int i4) {
        this.f13345a.setTraversalAfter(view, i4);
    }

    public int W() {
        return this.f13345a.getTextSelectionEnd();
    }

    public void W0(boolean z3) {
        this.f13345a.setCanOpenPopup(z3);
    }

    public void W1(View view) {
        this.f13345a.setTraversalBefore(view);
    }

    public int X() {
        return this.f13345a.getTextSelectionStart();
    }

    public void X0(boolean z3) {
        this.f13345a.setCheckable(z3);
    }

    public void X1(View view, int i4) {
        this.f13345a.setTraversalBefore(view, i4);
    }

    @androidx.annotation.P
    public CharSequence Y() {
        CharSequence tooltipText;
        if (Build.VERSION.SDK_INT >= 28) {
            tooltipText = this.f13345a.getTooltipText();
            return tooltipText;
        }
        return this.f13345a.getExtras().getCharSequence(f13316f);
    }

    public void Y0(boolean z3) {
        this.f13345a.setChecked(z3);
    }

    @androidx.annotation.S(markerClass = {C0738a.InterfaceC0093a.class})
    public void Y1(@androidx.annotation.P String str) {
        if (C0738a.k()) {
            this.f13345a.setUniqueId(str);
        } else {
            this.f13345a.getExtras().putString(f13333o, str);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0006, code lost:
    
        r0 = r2.f13345a.getTouchDelegateInfo();
     */
    @androidx.annotation.P
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public androidx.core.view.accessibility.M.f Z() {
        /*
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L14
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.f13345a
            android.view.accessibility.AccessibilityNodeInfo$TouchDelegateInfo r0 = androidx.core.view.accessibility.C0793u.a(r0)
            if (r0 == 0) goto L14
            androidx.core.view.accessibility.M$f r1 = new androidx.core.view.accessibility.M$f
            r1.<init>(r0)
            return r1
        L14:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.accessibility.M.Z():androidx.core.view.accessibility.M$f");
    }

    public void Z0(CharSequence charSequence) {
        this.f13345a.setClassName(charSequence);
    }

    public void Z1(String str) {
        this.f13345a.setViewIdResourceName(str);
    }

    public void a(int i4) {
        this.f13345a.addAction(i4);
    }

    public M a0() {
        return d2(this.f13345a.getTraversalAfter());
    }

    public void a1(boolean z3) {
        this.f13345a.setClickable(z3);
    }

    public void a2(boolean z3) {
        this.f13345a.setVisibleToUser(z3);
    }

    public void b(a aVar) {
        this.f13345a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f13392a);
    }

    public M b0() {
        return d2(this.f13345a.getTraversalBefore());
    }

    public void b1(Object obj) {
        AccessibilityNodeInfo.CollectionInfo collectionInfo;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f13345a;
        if (obj == null) {
            collectionInfo = null;
        } else {
            collectionInfo = (AccessibilityNodeInfo.CollectionInfo) ((c) obj).f13399a;
        }
        accessibilityNodeInfo.setCollectionInfo(collectionInfo);
    }

    public AccessibilityNodeInfo b2() {
        return this.f13345a;
    }

    public void c(View view) {
        this.f13345a.addChild(view);
    }

    @androidx.annotation.P
    @androidx.annotation.S(markerClass = {C0738a.InterfaceC0093a.class})
    public String c0() {
        String uniqueId;
        if (C0738a.k()) {
            uniqueId = this.f13345a.getUniqueId();
            return uniqueId;
        }
        return this.f13345a.getExtras().getString(f13333o);
    }

    public void c1(Object obj) {
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f13345a;
        if (obj == null) {
            collectionItemInfo = null;
        } else {
            collectionItemInfo = (AccessibilityNodeInfo.CollectionItemInfo) ((d) obj).f13400a;
        }
        accessibilityNodeInfo.setCollectionItemInfo(collectionItemInfo);
    }

    public void d(View view, int i4) {
        this.f13345a.addChild(view, i4);
    }

    public String d0() {
        return this.f13345a.getViewIdResourceName();
    }

    public void d1(CharSequence charSequence) {
        this.f13345a.setContentDescription(charSequence);
    }

    public V e0() {
        return V.v(this.f13345a.getWindow());
    }

    public void e1(boolean z3) {
        this.f13345a.setContentInvalid(z3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof M)) {
            return false;
        }
        M m4 = (M) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f13345a;
        if (accessibilityNodeInfo == null) {
            if (m4.f13345a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(m4.f13345a)) {
            return false;
        }
        if (this.f13347c == m4.f13347c && this.f13346b == m4.f13346b) {
            return true;
        }
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void f(CharSequence charSequence, View view) {
        if (Build.VERSION.SDK_INT < 26) {
            h();
            Q0(view);
            ClickableSpan[] x3 = x(charSequence);
            if (x3 != null && x3.length > 0) {
                E().putInt(f13330m, C2356a.e.f54923a);
                SparseArray<WeakReference<ClickableSpan>> N3 = N(view);
                for (int i4 = 0; i4 < x3.length; i4++) {
                    int h02 = h0(x3[i4], N3);
                    N3.put(h02, new WeakReference<>(x3[i4]));
                    e(x3[i4], (Spanned) charSequence, h02);
                }
            }
        }
    }

    public int f0() {
        return this.f13345a.getWindowId();
    }

    public void f1(boolean z3) {
        this.f13345a.setContextClickable(z3);
    }

    public boolean g() {
        return this.f13345a.canOpenPopup();
    }

    public void g1(boolean z3) {
        this.f13345a.setDismissable(z3);
    }

    public void h1(int i4) {
        this.f13345a.setDrawingOrder(i4);
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f13345a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public boolean i0() {
        return this.f13345a.isAccessibilityFocused();
    }

    public void i1(boolean z3) {
        this.f13345a.setEditable(z3);
    }

    public List<M> j(String str) {
        ArrayList arrayList = new ArrayList();
        List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText = this.f13345a.findAccessibilityNodeInfosByText(str);
        int size = findAccessibilityNodeInfosByText.size();
        for (int i4 = 0; i4 < size; i4++) {
            arrayList.add(c2(findAccessibilityNodeInfosByText.get(i4)));
        }
        return arrayList;
    }

    public boolean j0() {
        return this.f13345a.isCheckable();
    }

    public void j1(boolean z3) {
        this.f13345a.setEnabled(z3);
    }

    public List<M> k(String str) {
        List<AccessibilityNodeInfo> findAccessibilityNodeInfosByViewId = this.f13345a.findAccessibilityNodeInfosByViewId(str);
        ArrayList arrayList = new ArrayList();
        Iterator<AccessibilityNodeInfo> it = findAccessibilityNodeInfosByViewId.iterator();
        while (it.hasNext()) {
            arrayList.add(c2(it.next()));
        }
        return arrayList;
    }

    public boolean k0() {
        return this.f13345a.isChecked();
    }

    public void k1(CharSequence charSequence) {
        this.f13345a.setError(charSequence);
    }

    public M l(int i4) {
        return d2(this.f13345a.findFocus(i4));
    }

    public boolean l0() {
        return this.f13345a.isClickable();
    }

    public void l1(boolean z3) {
        this.f13345a.setFocusable(z3);
    }

    public M m(int i4) {
        return d2(this.f13345a.focusSearch(i4));
    }

    public boolean m0() {
        return this.f13345a.isContentInvalid();
    }

    public void m1(boolean z3) {
        this.f13345a.setFocused(z3);
    }

    public List<a> n() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.f13345a.getActionList();
        if (actionList != null) {
            ArrayList arrayList = new ArrayList();
            int size = actionList.size();
            for (int i4 = 0; i4 < size; i4++) {
                arrayList.add(new a(actionList.get(i4)));
            }
            return arrayList;
        }
        return Collections.emptyList();
    }

    public boolean n0() {
        return this.f13345a.isContextClickable();
    }

    public void n1(boolean z3) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f13345a.setHeading(z3);
        } else {
            T0(2, z3);
        }
    }

    public boolean o0() {
        return this.f13345a.isDismissable();
    }

    public void o1(@androidx.annotation.P CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f13345a.setHintText(charSequence);
        } else {
            this.f13345a.getExtras().putCharSequence(f13318g, charSequence);
        }
    }

    @Deprecated
    public int p() {
        return this.f13345a.getActions();
    }

    public boolean p0() {
        return this.f13345a.isEditable();
    }

    public void p1(boolean z3) {
        this.f13345a.setImportantForAccessibility(z3);
    }

    @androidx.annotation.N
    public List<String> q() {
        List<String> availableExtraData;
        if (Build.VERSION.SDK_INT >= 26) {
            availableExtraData = this.f13345a.getAvailableExtraData();
            return availableExtraData;
        }
        return Collections.emptyList();
    }

    public boolean q0() {
        return this.f13345a.isEnabled();
    }

    public void q1(int i4) {
        this.f13345a.setInputType(i4);
    }

    public boolean r0() {
        return this.f13345a.isFocusable();
    }

    public void r1(View view) {
        this.f13345a.setLabelFor(view);
    }

    @Deprecated
    public void s(Rect rect) {
        this.f13345a.getBoundsInParent(rect);
    }

    public boolean s0() {
        return this.f13345a.isFocused();
    }

    public void s1(View view, int i4) {
        this.f13345a.setLabelFor(view, i4);
    }

    public void t(Rect rect) {
        this.f13345a.getBoundsInScreen(rect);
    }

    public boolean t0() {
        boolean isHeading;
        if (Build.VERSION.SDK_INT >= 28) {
            isHeading = this.f13345a.isHeading();
            return isHeading;
        }
        if (r(2)) {
            return true;
        }
        d z3 = z();
        if (z3 != null && z3.e()) {
            return true;
        }
        return false;
    }

    public void t1(View view) {
        this.f13345a.setLabeledBy(view);
    }

    @androidx.annotation.N
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        s(rect);
        sb.append("; boundsInParent: " + rect);
        t(rect);
        sb.append("; boundsInScreen: " + rect);
        sb.append("; packageName: ");
        sb.append(O());
        sb.append("; className: ");
        sb.append(w());
        sb.append("; text: ");
        sb.append(V());
        sb.append("; contentDescription: ");
        sb.append(A());
        sb.append("; viewId: ");
        sb.append(d0());
        sb.append("; uniqueId: ");
        sb.append(c0());
        sb.append("; checkable: ");
        sb.append(j0());
        sb.append("; checked: ");
        sb.append(k0());
        sb.append("; focusable: ");
        sb.append(r0());
        sb.append("; focused: ");
        sb.append(s0());
        sb.append("; selected: ");
        sb.append(A0());
        sb.append("; clickable: ");
        sb.append(l0());
        sb.append("; longClickable: ");
        sb.append(v0());
        sb.append("; enabled: ");
        sb.append(q0());
        sb.append("; password: ");
        sb.append(x0());
        sb.append("; scrollable: " + z0());
        sb.append("; [");
        List<a> n4 = n();
        for (int i4 = 0; i4 < n4.size(); i4++) {
            a aVar = n4.get(i4);
            String o4 = o(aVar.b());
            if (o4.equals("ACTION_UNKNOWN") && aVar.c() != null) {
                o4 = aVar.c().toString();
            }
            sb.append(o4);
            if (i4 != n4.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public M u(int i4) {
        return d2(this.f13345a.getChild(i4));
    }

    public boolean u0() {
        return this.f13345a.isImportantForAccessibility();
    }

    public void u1(View view, int i4) {
        this.f13345a.setLabeledBy(view, i4);
    }

    public int v() {
        return this.f13345a.getChildCount();
    }

    public boolean v0() {
        return this.f13345a.isLongClickable();
    }

    public void v1(int i4) {
        this.f13345a.setLiveRegion(i4);
    }

    public CharSequence w() {
        return this.f13345a.getClassName();
    }

    public boolean w0() {
        return this.f13345a.isMultiLine();
    }

    public void w1(boolean z3) {
        this.f13345a.setLongClickable(z3);
    }

    public boolean x0() {
        return this.f13345a.isPassword();
    }

    public void x1(int i4) {
        this.f13345a.setMaxTextLength(i4);
    }

    public c y() {
        AccessibilityNodeInfo.CollectionInfo collectionInfo = this.f13345a.getCollectionInfo();
        if (collectionInfo != null) {
            return new c(collectionInfo);
        }
        return null;
    }

    public boolean y0() {
        boolean isScreenReaderFocusable;
        if (Build.VERSION.SDK_INT >= 28) {
            isScreenReaderFocusable = this.f13345a.isScreenReaderFocusable();
            return isScreenReaderFocusable;
        }
        return r(1);
    }

    public void y1(int i4) {
        this.f13345a.setMovementGranularities(i4);
    }

    public d z() {
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = this.f13345a.getCollectionItemInfo();
        if (collectionItemInfo != null) {
            return new d(collectionItemInfo);
        }
        return null;
    }

    public boolean z0() {
        return this.f13345a.isScrollable();
    }

    public void z1(boolean z3) {
        this.f13345a.setMultiLine(z3);
    }

    /* loaded from: classes.dex */
    public static final class f {

        /* renamed from: a, reason: collision with root package name */
        final AccessibilityNodeInfo.TouchDelegateInfo f13405a;

        public f(@androidx.annotation.N Map<Region, View> map) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f13405a = Q.a(map);
            } else {
                this.f13405a = null;
            }
        }

        @androidx.annotation.P
        public Region a(@androidx.annotation.F(from = 0) int i4) {
            Region regionAt;
            if (Build.VERSION.SDK_INT >= 29) {
                regionAt = this.f13405a.getRegionAt(i4);
                return regionAt;
            }
            return null;
        }

        @androidx.annotation.F(from = 0)
        public int b() {
            int regionCount;
            if (Build.VERSION.SDK_INT >= 29) {
                regionCount = this.f13405a.getRegionCount();
                return regionCount;
            }
            return 0;
        }

        /* JADX WARN: Code restructure failed: missing block: B:3:0x0006, code lost:
        
            r3 = r2.f13405a.getTargetForRegion(r3);
         */
        @androidx.annotation.P
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public androidx.core.view.accessibility.M c(@androidx.annotation.N android.graphics.Region r3) {
            /*
                r2 = this;
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 29
                if (r0 < r1) goto L13
                android.view.accessibility.AccessibilityNodeInfo$TouchDelegateInfo r0 = r2.f13405a
                android.view.accessibility.AccessibilityNodeInfo r3 = androidx.core.view.accessibility.N.a(r0, r3)
                if (r3 == 0) goto L13
                androidx.core.view.accessibility.M r3 = androidx.core.view.accessibility.M.c2(r3)
                return r3
            L13:
                r3 = 0
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.accessibility.M.f.c(android.graphics.Region):androidx.core.view.accessibility.M");
        }

        f(@androidx.annotation.N AccessibilityNodeInfo.TouchDelegateInfo touchDelegateInfo) {
            this.f13405a = touchDelegateInfo;
        }
    }

    private M(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f13345a = accessibilityNodeInfo;
    }
}
