package R2;

import kotlin.InterfaceC2229v;
import kotlin.Y;
import kotlin.contracts.InvocationKind;

@f
@Y(version = "1.3")
@kotlin.internal.b
/* loaded from: classes2.dex */
public interface c {

    /* loaded from: classes2.dex */
    public static final class a {
        public static /* synthetic */ R2.a a(c cVar, InterfaceC2229v interfaceC2229v, InvocationKind invocationKind, int i4, Object obj) {
            if (obj == null) {
                if ((i4 & 2) != 0) {
                    invocationKind = InvocationKind.UNKNOWN;
                }
                return cVar.d(interfaceC2229v, invocationKind);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: callsInPlace");
        }
    }

    @l3.d
    @kotlin.internal.b
    g a();

    @l3.d
    @kotlin.internal.b
    g b(@l3.e Object obj);

    @l3.d
    @kotlin.internal.b
    h c();

    @l3.d
    @kotlin.internal.b
    <R> R2.a d(@l3.d InterfaceC2229v<? extends R> interfaceC2229v, @l3.d InvocationKind invocationKind);
}
