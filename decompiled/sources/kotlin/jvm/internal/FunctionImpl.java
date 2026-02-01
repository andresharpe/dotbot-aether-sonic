package kotlin.jvm.internal;

import java.io.Serializable;
import kotlin.DeprecationLevel;
import kotlin.InterfaceC2205l;
import kotlin.InterfaceC2229v;

@InterfaceC2205l(level = DeprecationLevel.ERROR, message = "This class is no longer supported, do not use it.")
@Deprecated
/* loaded from: classes2.dex */
public abstract class FunctionImpl implements InterfaceC2229v, Serializable, X2.a, X2.l, X2.p, X2.q, X2.r, X2.s, X2.t, X2.u, X2.v, X2.w, X2.b, X2.c, X2.d, X2.e, X2.f, X2.g, X2.h, X2.i, X2.j, X2.k, X2.m, X2.n, X2.o {
    private void c(int i4) {
        if (g() != i4) {
            e(i4);
        }
    }

    private void e(int i4) {
        throw new IllegalStateException("Wrong function arity, expected: " + i4 + ", actual: " + g());
    }

    @Override // X2.d
    public Object B(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12) {
        c(12);
        return d(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12);
    }

    @Override // X2.l
    public Object C(Object obj) {
        c(1);
        return d(obj);
    }

    @Override // X2.k
    public Object F(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18, Object obj19) {
        c(19);
        return d(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, obj19);
    }

    @Override // X2.h
    public Object G(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16) {
        c(16);
        return d(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16);
    }

    @Override // X2.r
    public Object N(Object obj, Object obj2, Object obj3, Object obj4) {
        c(4);
        return d(obj, obj2, obj3, obj4);
    }

    @Override // X2.v
    public Object P(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        c(8);
        return d(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8);
    }

    @Override // X2.m
    public Object S(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18, Object obj19, Object obj20) {
        c(20);
        return d(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, obj19, obj20);
    }

    @Override // X2.o
    public Object U(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18, Object obj19, Object obj20, Object obj21, Object obj22) {
        c(22);
        return d(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, obj19, obj20, obj21, obj22);
    }

    @Override // X2.e
    public Object V(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13) {
        c(13);
        return d(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13);
    }

    @Override // X2.t
    public Object Y(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        c(6);
        return d(obj, obj2, obj3, obj4, obj5, obj6);
    }

    @Override // X2.f
    public Object Z(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14) {
        c(14);
        return d(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14);
    }

    @Override // X2.i
    public Object a0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17) {
        c(17);
        return d(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17);
    }

    @Override // X2.p
    public Object c0(Object obj, Object obj2) {
        c(2);
        return d(obj, obj2);
    }

    public Object d(Object... objArr) {
        throw new UnsupportedOperationException();
    }

    @Override // X2.w
    public Object d0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        c(9);
        return d(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9);
    }

    @Override // X2.s
    public Object f0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        c(5);
        return d(obj, obj2, obj3, obj4, obj5);
    }

    public abstract int g();

    @Override // X2.n
    public Object h0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18, Object obj19, Object obj20, Object obj21) {
        c(21);
        return d(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, obj19, obj20, obj21);
    }

    @Override // X2.u
    public Object k0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        c(7);
        return d(obj, obj2, obj3, obj4, obj5, obj6, obj7);
    }

    @Override // X2.b
    public Object l0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        c(10);
        return d(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10);
    }

    @Override // X2.a
    public Object n() {
        c(0);
        return d(new Object[0]);
    }

    @Override // X2.c
    public Object p(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11) {
        c(11);
        return d(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11);
    }

    @Override // X2.g
    public Object r0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15) {
        c(15);
        return d(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15);
    }

    @Override // X2.j
    public Object t(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18) {
        c(18);
        return d(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18);
    }

    @Override // X2.q
    public Object z(Object obj, Object obj2, Object obj3) {
        c(3);
        return d(obj, obj2, obj3);
    }
}
