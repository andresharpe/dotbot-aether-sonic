package kotlinx.coroutines.channels;

import java.util.ArrayList;
import kotlin.H0;
import kotlinx.coroutines.channels.AbstractC2244c;
import kotlinx.coroutines.internal.C2296c;
import kotlinx.coroutines.internal.S;
import kotlinx.coroutines.internal.UndeliveredElementException;

/* loaded from: classes2.dex */
public class A<E> extends AbstractC2242a<E> {
    public A(@l3.e X2.l<? super E, H0> lVar) {
        super(lVar);
    }

    @Override // kotlinx.coroutines.channels.AbstractC2244c
    protected final boolean C() {
        return false;
    }

    @Override // kotlinx.coroutines.channels.AbstractC2244c
    protected final boolean D() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.channels.AbstractC2244c
    @l3.d
    public Object G(E e4) {
        G<?> L3;
        do {
            Object G3 = super.G(e4);
            S s4 = C2243b.f53078d;
            if (G3 == s4) {
                return s4;
            }
            if (G3 == C2243b.f53079e) {
                L3 = L(e4);
                if (L3 == null) {
                    return s4;
                }
            } else {
                if (G3 instanceof v) {
                    return G3;
                }
                throw new IllegalStateException(("Invalid offerInternal result " + G3).toString());
            }
        } while (!(L3 instanceof v));
        return L3;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.channels.AbstractC2244c
    @l3.d
    public Object H(E e4, @l3.d kotlinx.coroutines.selects.f<?> fVar) {
        Object g02;
        while (true) {
            if (e0()) {
                g02 = super.H(e4, fVar);
            } else {
                g02 = fVar.g0(j(e4));
                if (g02 == null) {
                    g02 = C2243b.f53078d;
                }
            }
            if (g02 == kotlinx.coroutines.selects.g.d()) {
                return kotlinx.coroutines.selects.g.d();
            }
            S s4 = C2243b.f53078d;
            if (g02 == s4) {
                return s4;
            }
            if (g02 != C2243b.f53079e && g02 != C2296c.f54475b) {
                if (g02 instanceof v) {
                    return g02;
                }
                throw new IllegalStateException(("Invalid result " + g02).toString());
            }
        }
    }

    @Override // kotlinx.coroutines.channels.AbstractC2242a
    protected final boolean f0() {
        return true;
    }

    @Override // kotlinx.coroutines.channels.AbstractC2242a
    protected final boolean g0() {
        return true;
    }

    @Override // kotlinx.coroutines.channels.AbstractC2242a
    protected void j0(@l3.d Object obj, @l3.d v<?> vVar) {
        UndeliveredElementException undeliveredElementException = null;
        if (obj != null) {
            if (!(obj instanceof ArrayList)) {
                I i4 = (I) obj;
                if (i4 instanceof AbstractC2244c.a) {
                    X2.l<E, H0> lVar = this.f53084E;
                    if (lVar != null) {
                        undeliveredElementException = kotlinx.coroutines.internal.I.c(lVar, ((AbstractC2244c.a) i4).f53086H, null);
                    }
                } else {
                    i4.Z0(vVar);
                }
            } else {
                ArrayList arrayList = (ArrayList) obj;
                UndeliveredElementException undeliveredElementException2 = null;
                for (int size = arrayList.size() - 1; -1 < size; size--) {
                    I i5 = (I) arrayList.get(size);
                    if (i5 instanceof AbstractC2244c.a) {
                        X2.l<E, H0> lVar2 = this.f53084E;
                        if (lVar2 != null) {
                            undeliveredElementException2 = kotlinx.coroutines.internal.I.c(lVar2, ((AbstractC2244c.a) i5).f53086H, undeliveredElementException2);
                        } else {
                            undeliveredElementException2 = null;
                        }
                    } else {
                        i5.Z0(vVar);
                    }
                }
                undeliveredElementException = undeliveredElementException2;
            }
        }
        if (undeliveredElementException != null) {
            throw undeliveredElementException;
        }
    }
}
