package com.blankj.utilcode.util;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import androidx.annotation.InterfaceC0558a;
import androidx.annotation.InterfaceC0559b;
import androidx.annotation.InterfaceC0569l;
import androidx.annotation.InterfaceC0578v;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class I {

    /* renamed from: a, reason: collision with root package name */
    private static final int f24778a = 1;

    /* renamed from: b, reason: collision with root package name */
    private static final int f24779b = 2;

    /* renamed from: c, reason: collision with root package name */
    private static final int f24780c = 4;

    /* renamed from: d, reason: collision with root package name */
    private static final int f24781d = 8;

    /* renamed from: e, reason: collision with root package name */
    private static final int f24782e = 16;

    /* renamed from: f, reason: collision with root package name */
    private static final int f24783f = 32;

    /* renamed from: g, reason: collision with root package name */
    private static final int f24784g = 64;

    /* renamed from: h, reason: collision with root package name */
    private static final String f24785h = "args_id";

    /* renamed from: i, reason: collision with root package name */
    private static final String f24786i = "args_is_hide";

    /* renamed from: j, reason: collision with root package name */
    private static final String f24787j = "args_is_add_stack";

    /* renamed from: k, reason: collision with root package name */
    private static final String f24788k = "args_tag";

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        final int f24789a;

        /* renamed from: b, reason: collision with root package name */
        final boolean f24790b;

        /* renamed from: c, reason: collision with root package name */
        final boolean f24791c;

        /* renamed from: d, reason: collision with root package name */
        final String f24792d;

        a(int i4, boolean z3, boolean z4) {
            this(i4, null, z3, z4);
        }

        a(int i4, String str, boolean z3, boolean z4) {
            this.f24789a = i4;
            this.f24792d = str;
            this.f24790b = z3;
            this.f24791c = z4;
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        final Fragment f24793a;

        /* renamed from: b, reason: collision with root package name */
        final List<b> f24794b;

        public b(Fragment fragment, List<b> list) {
            this.f24793a = fragment;
            this.f24794b = list;
        }

        public Fragment a() {
            return this.f24793a;
        }

        public List<b> b() {
            return this.f24794b;
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append(this.f24793a.getClass().getSimpleName());
            sb.append("->");
            List<b> list = this.f24794b;
            if (list != null && !list.isEmpty()) {
                str = this.f24794b.toString();
            } else {
                str = "no child";
            }
            sb.append(str);
            return sb.toString();
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        boolean a();
    }

    private I() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static Fragment A(@androidx.annotation.N FragmentManager fragmentManager, Class<? extends Fragment> cls) {
        return fragmentManager.o0(cls.getName());
    }

    public static void A0(@androidx.annotation.N FragmentManager fragmentManager, @androidx.annotation.N Fragment fragment, @androidx.annotation.D int i4, String str, @InterfaceC0558a @InterfaceC0559b int i5, @InterfaceC0558a @InterfaceC0559b int i6, @InterfaceC0558a @InterfaceC0559b int i7, @InterfaceC0558a @InterfaceC0559b int i8) {
        D0(fragmentManager, fragment, i4, str, false, i5, i6, i7, i8);
    }

    public static Fragment B(@androidx.annotation.N FragmentManager fragmentManager, @androidx.annotation.N String str) {
        return fragmentManager.o0(str);
    }

    public static void B0(@androidx.annotation.N FragmentManager fragmentManager, @androidx.annotation.N Fragment fragment, @androidx.annotation.D int i4, String str, boolean z3) {
        androidx.fragment.app.F q4 = fragmentManager.q();
        a0(fragment, new a(i4, str, false, z3));
        S(16, fragmentManager, q4, null, fragment);
    }

    public static List<b> C(@androidx.annotation.N FragmentManager fragmentManager) {
        return D(fragmentManager, new ArrayList());
    }

    public static void C0(@androidx.annotation.N FragmentManager fragmentManager, @androidx.annotation.N Fragment fragment, @androidx.annotation.D int i4, String str, boolean z3, @InterfaceC0558a @InterfaceC0559b int i5, @InterfaceC0558a @InterfaceC0559b int i6) {
        D0(fragmentManager, fragment, i4, str, z3, i5, i6, 0, 0);
    }

    private static List<b> D(@androidx.annotation.N FragmentManager fragmentManager, List<b> list) {
        List<Fragment> H3 = H(fragmentManager);
        for (int size = H3.size() - 1; size >= 0; size--) {
            Fragment fragment = H3.get(size);
            if (fragment != null) {
                list.add(new b(fragment, D(fragment.getChildFragmentManager(), new ArrayList())));
            }
        }
        return list;
    }

    public static void D0(@androidx.annotation.N FragmentManager fragmentManager, @androidx.annotation.N Fragment fragment, @androidx.annotation.D int i4, String str, boolean z3, @InterfaceC0558a @InterfaceC0559b int i5, @InterfaceC0558a @InterfaceC0559b int i6, @InterfaceC0558a @InterfaceC0559b int i7, @InterfaceC0558a @InterfaceC0559b int i8) {
        androidx.fragment.app.F q4 = fragmentManager.q();
        a0(fragment, new a(i4, str, false, z3));
        w(q4, i5, i6, i7, i8);
        S(16, fragmentManager, q4, null, fragment);
    }

    public static List<b> E(@androidx.annotation.N FragmentManager fragmentManager) {
        return F(fragmentManager, new ArrayList());
    }

    public static void E0(@androidx.annotation.N FragmentManager fragmentManager, @androidx.annotation.N Fragment fragment, @androidx.annotation.D int i4, String str, boolean z3, View... viewArr) {
        androidx.fragment.app.F q4 = fragmentManager.q();
        a0(fragment, new a(i4, str, false, z3));
        x(q4, viewArr);
        S(16, fragmentManager, q4, null, fragment);
    }

    private static List<b> F(@androidx.annotation.N FragmentManager fragmentManager, List<b> list) {
        Bundle arguments;
        List<Fragment> H3 = H(fragmentManager);
        for (int size = H3.size() - 1; size >= 0; size--) {
            Fragment fragment = H3.get(size);
            if (fragment != null && (arguments = fragment.getArguments()) != null && arguments.getBoolean(f24787j)) {
                list.add(new b(fragment, F(fragment.getChildFragmentManager(), new ArrayList())));
            }
        }
        return list;
    }

    public static void F0(@androidx.annotation.N FragmentManager fragmentManager, @androidx.annotation.N Fragment fragment, @androidx.annotation.D int i4, String str, View... viewArr) {
        E0(fragmentManager, fragment, i4, str, false, viewArr);
    }

    private static a G(Fragment fragment) {
        Bundle arguments = fragment.getArguments();
        if (arguments == null) {
            arguments = Bundle.EMPTY;
        }
        return new a(arguments.getInt(f24785h, fragment.getId()), arguments.getBoolean(f24786i), arguments.getBoolean(f24787j));
    }

    public static void G0(@androidx.annotation.N FragmentManager fragmentManager, @androidx.annotation.N Fragment fragment, @androidx.annotation.D int i4, boolean z3) {
        B0(fragmentManager, fragment, i4, null, z3);
    }

    public static List<Fragment> H(@androidx.annotation.N FragmentManager fragmentManager) {
        List<Fragment> E02 = fragmentManager.E0();
        if (E02 != null && !E02.isEmpty()) {
            return E02;
        }
        return Collections.emptyList();
    }

    public static void H0(@androidx.annotation.N FragmentManager fragmentManager, @androidx.annotation.N Fragment fragment, @androidx.annotation.D int i4, boolean z3, @InterfaceC0558a @InterfaceC0559b int i5, @InterfaceC0558a @InterfaceC0559b int i6) {
        D0(fragmentManager, fragment, i4, null, z3, i5, i6, 0, 0);
    }

    public static List<Fragment> I(@androidx.annotation.N FragmentManager fragmentManager) {
        Bundle arguments;
        List<Fragment> H3 = H(fragmentManager);
        ArrayList arrayList = new ArrayList();
        for (Fragment fragment : H3) {
            if (fragment != null && (arguments = fragment.getArguments()) != null && arguments.getBoolean(f24787j)) {
                arrayList.add(fragment);
            }
        }
        return arrayList;
    }

    public static void I0(@androidx.annotation.N FragmentManager fragmentManager, @androidx.annotation.N Fragment fragment, @androidx.annotation.D int i4, boolean z3, @InterfaceC0558a @InterfaceC0559b int i5, @InterfaceC0558a @InterfaceC0559b int i6, @InterfaceC0558a @InterfaceC0559b int i7, @InterfaceC0558a @InterfaceC0559b int i8) {
        D0(fragmentManager, fragment, i4, null, z3, i5, i6, i7, i8);
    }

    public static String J(Fragment fragment) {
        if (fragment == null) {
            return "null";
        }
        return fragment.getClass().getSimpleName();
    }

    public static void J0(@androidx.annotation.N FragmentManager fragmentManager, @androidx.annotation.N Fragment fragment, @androidx.annotation.D int i4, boolean z3, View... viewArr) {
        E0(fragmentManager, fragment, i4, null, z3, viewArr);
    }

    public static Fragment K(@androidx.annotation.N FragmentManager fragmentManager) {
        return M(fragmentManager, null, false);
    }

    public static void K0(@androidx.annotation.N FragmentManager fragmentManager, @androidx.annotation.N Fragment fragment, @androidx.annotation.D int i4, View... viewArr) {
        E0(fragmentManager, fragment, i4, null, false, viewArr);
    }

    public static Fragment L(@androidx.annotation.N FragmentManager fragmentManager) {
        return M(fragmentManager, null, true);
    }

    public static void L0(@androidx.annotation.N Fragment fragment, Drawable drawable) {
        View view = fragment.getView();
        if (view == null) {
            return;
        }
        view.setBackground(drawable);
    }

    private static Fragment M(@androidx.annotation.N FragmentManager fragmentManager, Fragment fragment, boolean z3) {
        List<Fragment> H3 = H(fragmentManager);
        for (int size = H3.size() - 1; size >= 0; size--) {
            Fragment fragment2 = H3.get(size);
            if (fragment2 != null) {
                if (z3) {
                    Bundle arguments = fragment2.getArguments();
                    if (arguments != null && arguments.getBoolean(f24787j)) {
                        return M(fragment2.getChildFragmentManager(), fragment2, true);
                    }
                } else {
                    return M(fragment2.getChildFragmentManager(), fragment2, false);
                }
            }
        }
        return fragment;
    }

    public static void M0(@androidx.annotation.N Fragment fragment, @InterfaceC0569l int i4) {
        View view = fragment.getView();
        if (view != null) {
            view.setBackgroundColor(i4);
        }
    }

    public static Fragment N(@androidx.annotation.N FragmentManager fragmentManager) {
        return P(fragmentManager, null, false);
    }

    public static void N0(@androidx.annotation.N Fragment fragment, @InterfaceC0578v int i4) {
        View view = fragment.getView();
        if (view != null) {
            view.setBackgroundResource(i4);
        }
    }

    public static Fragment O(@androidx.annotation.N FragmentManager fragmentManager) {
        return P(fragmentManager, null, true);
    }

    public static void O0(@androidx.annotation.N Fragment fragment) {
        b0(fragment, false);
        T(2, fragment.getFragmentManager(), null, fragment);
    }

    private static Fragment P(@androidx.annotation.N FragmentManager fragmentManager, Fragment fragment, boolean z3) {
        List<Fragment> H3 = H(fragmentManager);
        for (int size = H3.size() - 1; size >= 0; size--) {
            Fragment fragment2 = H3.get(size);
            if (fragment2 != null && fragment2.isResumed() && fragment2.isVisible() && fragment2.getUserVisibleHint()) {
                if (z3) {
                    Bundle arguments = fragment2.getArguments();
                    if (arguments != null && arguments.getBoolean(f24787j)) {
                        return P(fragment2.getChildFragmentManager(), fragment2, true);
                    }
                } else {
                    return P(fragment2.getChildFragmentManager(), fragment2, false);
                }
            }
        }
        return fragment;
    }

    public static void P0(@androidx.annotation.N FragmentManager fragmentManager) {
        List<Fragment> H3 = H(fragmentManager);
        Iterator<Fragment> it = H3.iterator();
        while (it.hasNext()) {
            b0(it.next(), false);
        }
        T(2, fragmentManager, null, (Fragment[]) H3.toArray(new Fragment[0]));
    }

    public static void Q(@androidx.annotation.N Fragment fragment) {
        b0(fragment, true);
        T(4, fragment.getFragmentManager(), null, fragment);
    }

    public static void Q0(int i4, @androidx.annotation.N List<Fragment> list) {
        V0(list.get(i4), list);
    }

    public static void R(@androidx.annotation.N FragmentManager fragmentManager) {
        List<Fragment> H3 = H(fragmentManager);
        Iterator<Fragment> it = H3.iterator();
        while (it.hasNext()) {
            b0(it.next(), true);
        }
        T(4, fragmentManager, null, (Fragment[]) H3.toArray(new Fragment[0]));
    }

    public static void R0(int i4, @androidx.annotation.N List<Fragment> list, @InterfaceC0558a @InterfaceC0559b int i5, @InterfaceC0558a @InterfaceC0559b int i6, @InterfaceC0558a @InterfaceC0559b int i7, @InterfaceC0558a @InterfaceC0559b int i8) {
        W0(list.get(i4), list, i5, i6, i7, i8);
    }

    private static void S(int i4, @androidx.annotation.N FragmentManager fragmentManager, androidx.fragment.app.F f4, Fragment fragment, Fragment... fragmentArr) {
        if (fragment != null && fragment.isRemoving()) {
            Log.e("FragmentUtils", fragment.getClass().getName() + " is isRemoving");
            return;
        }
        int i5 = 0;
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 4) {
                    if (i4 != 8) {
                        if (i4 != 16) {
                            if (i4 != 32) {
                                if (i4 == 64) {
                                    int length = fragmentArr.length - 1;
                                    while (true) {
                                        if (length < 0) {
                                            break;
                                        }
                                        Fragment fragment2 = fragmentArr[length];
                                        if (fragment2 == fragmentArr[0]) {
                                            if (fragment != null) {
                                                f4.B(fragment2);
                                            }
                                        } else {
                                            f4.B(fragment2);
                                            length--;
                                        }
                                    }
                                }
                            } else {
                                int length2 = fragmentArr.length;
                                while (i5 < length2) {
                                    Fragment fragment3 = fragmentArr[i5];
                                    if (fragment3 != fragment) {
                                        f4.B(fragment3);
                                    }
                                    i5++;
                                }
                            }
                        } else {
                            Bundle arguments = fragmentArr[0].getArguments();
                            if (arguments == null) {
                                return;
                            }
                            String string = arguments.getString(f24788k, fragmentArr[0].getClass().getName());
                            f4.D(arguments.getInt(f24785h), fragmentArr[0], string);
                            if (arguments.getBoolean(f24787j)) {
                                f4.o(string);
                            }
                        }
                    } else {
                        f4.T(fragment);
                        int length3 = fragmentArr.length;
                        while (i5 < length3) {
                            Fragment fragment4 = fragmentArr[i5];
                            if (fragment4 != fragment) {
                                f4.y(fragment4);
                            }
                            i5++;
                        }
                    }
                } else {
                    int length4 = fragmentArr.length;
                    while (i5 < length4) {
                        f4.y(fragmentArr[i5]);
                        i5++;
                    }
                }
            } else {
                int length5 = fragmentArr.length;
                while (i5 < length5) {
                    f4.T(fragmentArr[i5]);
                    i5++;
                }
            }
        } else {
            int length6 = fragmentArr.length;
            while (i5 < length6) {
                Fragment fragment5 = fragmentArr[i5];
                Bundle arguments2 = fragment5.getArguments();
                if (arguments2 == null) {
                    return;
                }
                String string2 = arguments2.getString(f24788k, fragment5.getClass().getName());
                Fragment o02 = fragmentManager.o0(string2);
                if (o02 != null && o02.isAdded()) {
                    f4.B(o02);
                }
                f4.g(arguments2.getInt(f24785h), fragment5, string2);
                if (arguments2.getBoolean(f24786i)) {
                    f4.y(fragment5);
                }
                if (arguments2.getBoolean(f24787j)) {
                    f4.o(string2);
                }
                i5++;
            }
        }
        f4.r();
        fragmentManager.j0();
    }

    public static void S0(int i4, @androidx.annotation.N Fragment... fragmentArr) {
        X0(fragmentArr[i4], fragmentArr);
    }

    private static void T(int i4, @androidx.annotation.P FragmentManager fragmentManager, Fragment fragment, Fragment... fragmentArr) {
        if (fragmentManager == null) {
            return;
        }
        S(i4, fragmentManager, fragmentManager.q(), fragment, fragmentArr);
    }

    public static void T0(@androidx.annotation.N Fragment fragment, @androidx.annotation.N Fragment fragment2) {
        V0(fragment, Collections.singletonList(fragment2));
    }

    public static void U(@androidx.annotation.N FragmentManager fragmentManager) {
        V(fragmentManager, true);
    }

    public static void U0(@androidx.annotation.N Fragment fragment, @androidx.annotation.N Fragment fragment2, @InterfaceC0558a @InterfaceC0559b int i4, @InterfaceC0558a @InterfaceC0559b int i5, @InterfaceC0558a @InterfaceC0559b int i6, @InterfaceC0558a @InterfaceC0559b int i7) {
        W0(fragment, Collections.singletonList(fragment2), i4, i5, i6, i7);
    }

    public static void V(@androidx.annotation.N FragmentManager fragmentManager, boolean z3) {
        if (z3) {
            fragmentManager.m1();
        } else {
            fragmentManager.i1();
        }
    }

    public static void V0(@androidx.annotation.N Fragment fragment, @androidx.annotation.N List<Fragment> list) {
        Iterator<Fragment> it = list.iterator();
        while (true) {
            boolean z3 = false;
            if (it.hasNext()) {
                Fragment next = it.next();
                if (next != fragment) {
                    z3 = true;
                }
                b0(next, z3);
            } else {
                T(8, fragment.getFragmentManager(), fragment, (Fragment[]) list.toArray(new Fragment[0]));
                return;
            }
        }
    }

    public static void W(@androidx.annotation.N FragmentManager fragmentManager) {
        X(fragmentManager, true);
    }

    public static void W0(@androidx.annotation.N Fragment fragment, @androidx.annotation.N List<Fragment> list, @InterfaceC0558a @InterfaceC0559b int i4, @InterfaceC0558a @InterfaceC0559b int i5, @InterfaceC0558a @InterfaceC0559b int i6, @InterfaceC0558a @InterfaceC0559b int i7) {
        Iterator<Fragment> it = list.iterator();
        while (true) {
            boolean z3 = false;
            if (!it.hasNext()) {
                break;
            }
            Fragment next = it.next();
            if (next != fragment) {
                z3 = true;
            }
            b0(next, z3);
        }
        FragmentManager fragmentManager = fragment.getFragmentManager();
        if (fragmentManager != null) {
            androidx.fragment.app.F q4 = fragmentManager.q();
            w(q4, i4, i5, i6, i7);
            S(8, fragmentManager, q4, fragment, (Fragment[]) list.toArray(new Fragment[0]));
        }
    }

    public static void X(@androidx.annotation.N FragmentManager fragmentManager, boolean z3) {
        if (fragmentManager.x0() > 0) {
            FragmentManager.i w02 = fragmentManager.w0(0);
            if (z3) {
                fragmentManager.n1(w02.getId(), 1);
            } else {
                fragmentManager.j1(w02.getId(), 1);
            }
        }
    }

    public static void X0(@androidx.annotation.N Fragment fragment, @androidx.annotation.N Fragment... fragmentArr) {
        V0(fragment, Arrays.asList(fragmentArr));
    }

    public static void Y(@androidx.annotation.N FragmentManager fragmentManager, Class<? extends Fragment> cls, boolean z3) {
        Z(fragmentManager, cls, z3, true);
    }

    public static void Z(@androidx.annotation.N FragmentManager fragmentManager, Class<? extends Fragment> cls, boolean z3, boolean z4) {
        if (z4) {
            fragmentManager.o1(cls.getName(), z3 ? 1 : 0);
        } else {
            fragmentManager.l1(cls.getName(), z3 ? 1 : 0);
        }
    }

    public static void a(@androidx.annotation.N FragmentManager fragmentManager, @androidx.annotation.N Fragment fragment, @androidx.annotation.D int i4) {
        j(fragmentManager, fragment, i4, null, false, false);
    }

    private static void a0(Fragment fragment, a aVar) {
        Bundle arguments = fragment.getArguments();
        if (arguments == null) {
            arguments = new Bundle();
            fragment.setArguments(arguments);
        }
        arguments.putInt(f24785h, aVar.f24789a);
        arguments.putBoolean(f24786i, aVar.f24790b);
        arguments.putBoolean(f24787j, aVar.f24791c);
        arguments.putString(f24788k, aVar.f24792d);
    }

    public static void b(@androidx.annotation.N FragmentManager fragmentManager, @androidx.annotation.N Fragment fragment, @androidx.annotation.D int i4, @InterfaceC0558a @InterfaceC0559b int i5, @InterfaceC0558a @InterfaceC0559b int i6) {
        i(fragmentManager, fragment, i4, null, false, i5, i6, 0, 0);
    }

    private static void b0(Fragment fragment, boolean z3) {
        Bundle arguments = fragment.getArguments();
        if (arguments == null) {
            arguments = new Bundle();
            fragment.setArguments(arguments);
        }
        arguments.putBoolean(f24786i, z3);
    }

    public static void c(@androidx.annotation.N FragmentManager fragmentManager, @androidx.annotation.N Fragment fragment, @androidx.annotation.D int i4, @InterfaceC0558a @InterfaceC0559b int i5, @InterfaceC0558a @InterfaceC0559b int i6, @InterfaceC0558a @InterfaceC0559b int i7, @InterfaceC0558a @InterfaceC0559b int i8) {
        i(fragmentManager, fragment, i4, null, false, i5, i6, i7, i8);
    }

    public static void c0(@androidx.annotation.N Fragment fragment) {
        T(32, fragment.getFragmentManager(), null, fragment);
    }

    public static void d(@androidx.annotation.N FragmentManager fragmentManager, @androidx.annotation.N Fragment fragment, @androidx.annotation.D int i4, String str) {
        j(fragmentManager, fragment, i4, str, false, false);
    }

    public static void d0(@androidx.annotation.N FragmentManager fragmentManager) {
        T(32, fragmentManager, null, (Fragment[]) H(fragmentManager).toArray(new Fragment[0]));
    }

    public static void e(@androidx.annotation.N FragmentManager fragmentManager, @androidx.annotation.N Fragment fragment, @androidx.annotation.D int i4, String str, @InterfaceC0558a @InterfaceC0559b int i5, @InterfaceC0558a @InterfaceC0559b int i6) {
        i(fragmentManager, fragment, i4, str, false, i5, i6, 0, 0);
    }

    public static void e0(@androidx.annotation.N Fragment fragment, boolean z3) {
        Fragment fragment2;
        FragmentManager fragmentManager = fragment.getFragmentManager();
        if (z3) {
            fragment2 = fragment;
        } else {
            fragment2 = null;
        }
        T(64, fragmentManager, fragment2, fragment);
    }

    public static void f(@androidx.annotation.N FragmentManager fragmentManager, @androidx.annotation.N Fragment fragment, @androidx.annotation.D int i4, String str, @InterfaceC0558a @InterfaceC0559b int i5, @InterfaceC0558a @InterfaceC0559b int i6, @InterfaceC0558a @InterfaceC0559b int i7, @InterfaceC0558a @InterfaceC0559b int i8) {
        i(fragmentManager, fragment, i4, str, false, i5, i6, i7, i8);
    }

    public static void f0(@androidx.annotation.N Fragment fragment, @androidx.annotation.N Fragment fragment2) {
        l0(fragment, fragment2, null, false);
    }

    public static void g(@androidx.annotation.N FragmentManager fragmentManager, @androidx.annotation.N Fragment fragment, @androidx.annotation.D int i4, String str, boolean z3) {
        j(fragmentManager, fragment, i4, str, z3, false);
    }

    public static void g0(@androidx.annotation.N Fragment fragment, @androidx.annotation.N Fragment fragment2, @InterfaceC0558a @InterfaceC0559b int i4, @InterfaceC0558a @InterfaceC0559b int i5) {
        n0(fragment, fragment2, null, false, i4, i5, 0, 0);
    }

    public static void h(@androidx.annotation.N FragmentManager fragmentManager, @androidx.annotation.N Fragment fragment, @androidx.annotation.D int i4, String str, boolean z3, @InterfaceC0558a @InterfaceC0559b int i5, @InterfaceC0558a @InterfaceC0559b int i6) {
        i(fragmentManager, fragment, i4, str, z3, i5, i6, 0, 0);
    }

    public static void h0(@androidx.annotation.N Fragment fragment, @androidx.annotation.N Fragment fragment2, @InterfaceC0558a @InterfaceC0559b int i4, @InterfaceC0558a @InterfaceC0559b int i5, @InterfaceC0558a @InterfaceC0559b int i6, @InterfaceC0558a @InterfaceC0559b int i7) {
        n0(fragment, fragment2, null, false, i4, i5, i6, i7);
    }

    public static void i(@androidx.annotation.N FragmentManager fragmentManager, @androidx.annotation.N Fragment fragment, @androidx.annotation.D int i4, String str, boolean z3, @InterfaceC0558a @InterfaceC0559b int i5, @InterfaceC0558a @InterfaceC0559b int i6, @InterfaceC0558a @InterfaceC0559b int i7, @InterfaceC0558a @InterfaceC0559b int i8) {
        androidx.fragment.app.F q4 = fragmentManager.q();
        a0(fragment, new a(i4, str, false, z3));
        w(q4, i5, i6, i7, i8);
        S(1, fragmentManager, q4, null, fragment);
    }

    public static void i0(@androidx.annotation.N Fragment fragment, @androidx.annotation.N Fragment fragment2, String str) {
        l0(fragment, fragment2, str, false);
    }

    public static void j(@androidx.annotation.N FragmentManager fragmentManager, @androidx.annotation.N Fragment fragment, @androidx.annotation.D int i4, String str, boolean z3, boolean z4) {
        a0(fragment, new a(i4, str, z3, z4));
        T(1, fragmentManager, null, fragment);
    }

    public static void j0(@androidx.annotation.N Fragment fragment, @androidx.annotation.N Fragment fragment2, String str, @InterfaceC0558a @InterfaceC0559b int i4, @InterfaceC0558a @InterfaceC0559b int i5) {
        n0(fragment, fragment2, str, false, i4, i5, 0, 0);
    }

    public static void k(@androidx.annotation.N FragmentManager fragmentManager, @androidx.annotation.N Fragment fragment, @androidx.annotation.D int i4, String str, boolean z3, @androidx.annotation.N View... viewArr) {
        androidx.fragment.app.F q4 = fragmentManager.q();
        a0(fragment, new a(i4, str, false, z3));
        x(q4, viewArr);
        S(1, fragmentManager, q4, null, fragment);
    }

    public static void k0(@androidx.annotation.N Fragment fragment, @androidx.annotation.N Fragment fragment2, String str, @InterfaceC0558a @InterfaceC0559b int i4, @InterfaceC0558a @InterfaceC0559b int i5, @InterfaceC0558a @InterfaceC0559b int i6, @InterfaceC0558a @InterfaceC0559b int i7) {
        n0(fragment, fragment2, str, false, i4, i5, i6, i7);
    }

    public static void l(@androidx.annotation.N FragmentManager fragmentManager, @androidx.annotation.N Fragment fragment, @androidx.annotation.D int i4, String str, @androidx.annotation.N View... viewArr) {
        k(fragmentManager, fragment, i4, str, false, viewArr);
    }

    public static void l0(@androidx.annotation.N Fragment fragment, @androidx.annotation.N Fragment fragment2, String str, boolean z3) {
        FragmentManager fragmentManager = fragment.getFragmentManager();
        if (fragmentManager == null) {
            return;
        }
        B0(fragmentManager, fragment2, G(fragment).f24789a, str, z3);
    }

    public static void m(@androidx.annotation.N FragmentManager fragmentManager, @androidx.annotation.N Fragment fragment, @androidx.annotation.D int i4, boolean z3) {
        j(fragmentManager, fragment, i4, null, z3, false);
    }

    public static void m0(@androidx.annotation.N Fragment fragment, @androidx.annotation.N Fragment fragment2, String str, boolean z3, @InterfaceC0558a @InterfaceC0559b int i4, @InterfaceC0558a @InterfaceC0559b int i5) {
        n0(fragment, fragment2, str, z3, i4, i5, 0, 0);
    }

    public static void n(@androidx.annotation.N FragmentManager fragmentManager, @androidx.annotation.N Fragment fragment, @androidx.annotation.D int i4, boolean z3, @InterfaceC0558a @InterfaceC0559b int i5, @InterfaceC0558a @InterfaceC0559b int i6) {
        i(fragmentManager, fragment, i4, null, z3, i5, i6, 0, 0);
    }

    public static void n0(@androidx.annotation.N Fragment fragment, @androidx.annotation.N Fragment fragment2, String str, boolean z3, @InterfaceC0558a @InterfaceC0559b int i4, @InterfaceC0558a @InterfaceC0559b int i5, @InterfaceC0558a @InterfaceC0559b int i6, @InterfaceC0558a @InterfaceC0559b int i7) {
        FragmentManager fragmentManager = fragment.getFragmentManager();
        if (fragmentManager == null) {
            return;
        }
        D0(fragmentManager, fragment2, G(fragment).f24789a, str, z3, i4, i5, i6, i7);
    }

    public static void o(@androidx.annotation.N FragmentManager fragmentManager, @androidx.annotation.N Fragment fragment, @androidx.annotation.D int i4, boolean z3, @InterfaceC0558a @InterfaceC0559b int i5, @InterfaceC0558a @InterfaceC0559b int i6, @InterfaceC0558a @InterfaceC0559b int i7, @InterfaceC0558a @InterfaceC0559b int i8) {
        i(fragmentManager, fragment, i4, null, z3, i5, i6, i7, i8);
    }

    public static void o0(@androidx.annotation.N Fragment fragment, @androidx.annotation.N Fragment fragment2, String str, boolean z3, View... viewArr) {
        FragmentManager fragmentManager = fragment.getFragmentManager();
        if (fragmentManager == null) {
            return;
        }
        E0(fragmentManager, fragment2, G(fragment).f24789a, str, z3, viewArr);
    }

    public static void p(@androidx.annotation.N FragmentManager fragmentManager, @androidx.annotation.N Fragment fragment, @androidx.annotation.D int i4, boolean z3, boolean z4) {
        j(fragmentManager, fragment, i4, null, z3, z4);
    }

    public static void p0(@androidx.annotation.N Fragment fragment, @androidx.annotation.N Fragment fragment2, String str, View... viewArr) {
        o0(fragment, fragment2, str, false, viewArr);
    }

    public static void q(@androidx.annotation.N FragmentManager fragmentManager, @androidx.annotation.N Fragment fragment, @androidx.annotation.D int i4, boolean z3, @androidx.annotation.N View... viewArr) {
        k(fragmentManager, fragment, i4, null, z3, viewArr);
    }

    public static void q0(@androidx.annotation.N Fragment fragment, @androidx.annotation.N Fragment fragment2, boolean z3) {
        l0(fragment, fragment2, null, z3);
    }

    public static void r(@androidx.annotation.N FragmentManager fragmentManager, @androidx.annotation.N Fragment fragment, @androidx.annotation.D int i4, @androidx.annotation.N View... viewArr) {
        k(fragmentManager, fragment, i4, null, false, viewArr);
    }

    public static void r0(@androidx.annotation.N Fragment fragment, @androidx.annotation.N Fragment fragment2, boolean z3, @InterfaceC0558a @InterfaceC0559b int i4, @InterfaceC0558a @InterfaceC0559b int i5) {
        n0(fragment, fragment2, null, z3, i4, i5, 0, 0);
    }

    public static void s(@androidx.annotation.N FragmentManager fragmentManager, @androidx.annotation.N List<Fragment> list, @androidx.annotation.D int i4, int i5) {
        v(fragmentManager, (Fragment[]) list.toArray(new Fragment[0]), i4, null, i5);
    }

    public static void s0(@androidx.annotation.N Fragment fragment, @androidx.annotation.N Fragment fragment2, boolean z3, @InterfaceC0558a @InterfaceC0559b int i4, @InterfaceC0558a @InterfaceC0559b int i5, @InterfaceC0558a @InterfaceC0559b int i6, @InterfaceC0558a @InterfaceC0559b int i7) {
        n0(fragment, fragment2, null, z3, i4, i5, i6, i7);
    }

    public static void t(@androidx.annotation.N FragmentManager fragmentManager, @androidx.annotation.N List<Fragment> list, @androidx.annotation.D int i4, String[] strArr, int i5) {
        v(fragmentManager, (Fragment[]) list.toArray(new Fragment[0]), i4, strArr, i5);
    }

    public static void t0(@androidx.annotation.N Fragment fragment, @androidx.annotation.N Fragment fragment2, boolean z3, View... viewArr) {
        o0(fragment, fragment2, null, z3, viewArr);
    }

    public static void u(@androidx.annotation.N FragmentManager fragmentManager, @androidx.annotation.N Fragment[] fragmentArr, @androidx.annotation.D int i4, int i5) {
        v(fragmentManager, fragmentArr, i4, null, i5);
    }

    public static void u0(@androidx.annotation.N Fragment fragment, @androidx.annotation.N Fragment fragment2, View... viewArr) {
        o0(fragment, fragment2, null, false, viewArr);
    }

    public static void v(@androidx.annotation.N FragmentManager fragmentManager, @androidx.annotation.N Fragment[] fragmentArr, @androidx.annotation.D int i4, String[] strArr, int i5) {
        boolean z3;
        boolean z4;
        if (strArr == null) {
            int length = fragmentArr.length;
            for (int i6 = 0; i6 < length; i6++) {
                Fragment fragment = fragmentArr[i6];
                if (i5 != i6) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                a0(fragment, new a(i4, null, z4, false));
            }
        } else {
            int length2 = fragmentArr.length;
            for (int i7 = 0; i7 < length2; i7++) {
                Fragment fragment2 = fragmentArr[i7];
                String str = strArr[i7];
                if (i5 != i7) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                a0(fragment2, new a(i4, str, z3, false));
            }
        }
        T(1, fragmentManager, null, fragmentArr);
    }

    public static void v0(@androidx.annotation.N FragmentManager fragmentManager, @androidx.annotation.N Fragment fragment, @androidx.annotation.D int i4) {
        B0(fragmentManager, fragment, i4, null, false);
    }

    private static void w(androidx.fragment.app.F f4, int i4, int i5, int i6, int i7) {
        f4.N(i4, i5, i6, i7);
    }

    public static void w0(@androidx.annotation.N FragmentManager fragmentManager, @androidx.annotation.N Fragment fragment, @androidx.annotation.D int i4, @InterfaceC0558a @InterfaceC0559b int i5, @InterfaceC0558a @InterfaceC0559b int i6) {
        D0(fragmentManager, fragment, i4, null, false, i5, i6, 0, 0);
    }

    private static void x(androidx.fragment.app.F f4, View... viewArr) {
        for (View view : viewArr) {
            f4.n(view, view.getTransitionName());
        }
    }

    public static void x0(@androidx.annotation.N FragmentManager fragmentManager, @androidx.annotation.N Fragment fragment, @androidx.annotation.D int i4, @InterfaceC0558a @InterfaceC0559b int i5, @InterfaceC0558a @InterfaceC0559b int i6, @InterfaceC0558a @InterfaceC0559b int i7, @InterfaceC0558a @InterfaceC0559b int i8) {
        D0(fragmentManager, fragment, i4, null, false, i5, i6, i7, i8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean y(@androidx.annotation.N Fragment fragment) {
        if (fragment.isResumed() && fragment.isVisible() && fragment.getUserVisibleHint() && (fragment instanceof c) && ((c) fragment).a()) {
            return true;
        }
        return false;
    }

    public static void y0(@androidx.annotation.N FragmentManager fragmentManager, @androidx.annotation.N Fragment fragment, @androidx.annotation.D int i4, String str) {
        B0(fragmentManager, fragment, i4, str, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean z(@androidx.annotation.N FragmentManager fragmentManager) {
        List<Fragment> H3 = H(fragmentManager);
        if (H3 != null && !H3.isEmpty()) {
            for (int size = H3.size() - 1; size >= 0; size--) {
                Fragment fragment = H3.get(size);
                if (fragment != 0 && fragment.isResumed() && fragment.isVisible() && fragment.getUserVisibleHint() && (fragment instanceof c) && ((c) fragment).a()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void z0(@androidx.annotation.N FragmentManager fragmentManager, @androidx.annotation.N Fragment fragment, @androidx.annotation.D int i4, String str, @InterfaceC0558a @InterfaceC0559b int i5, @InterfaceC0558a @InterfaceC0559b int i6) {
        D0(fragmentManager, fragment, i4, str, false, i5, i6, 0, 0);
    }
}
