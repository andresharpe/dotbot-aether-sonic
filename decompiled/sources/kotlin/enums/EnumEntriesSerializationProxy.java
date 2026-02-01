package kotlin.enums;

import com.google.firebase.remoteconfig.u;
import java.io.Serializable;
import java.lang.Enum;
import kotlin.E;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;

@E(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0000\u0018\u0000 \u000f*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\u00060\u0003j\u0002`\u0004:\u0001\u0006B\u0015\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\t¨\u0006\u0010"}, d2 = {"Lkotlin/enums/EnumEntriesSerializationProxy;", "", androidx.exifinterface.media.a.U4, "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "a", "()Ljava/lang/Object;", "Ljava/lang/Class;", "Ljava/lang/Class;", "c", "", u.c.f37791i0, "<init>", "([Ljava/lang/Enum;)V", "F", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class EnumEntriesSerializationProxy<E extends Enum<E>> implements Serializable {

    /* renamed from: F, reason: collision with root package name */
    @l3.d
    private static final a f52082F = new a(null);

    /* renamed from: G, reason: collision with root package name */
    private static final long f52083G = 0;

    /* renamed from: E, reason: collision with root package name */
    @l3.d
    private final Class<E> f52084E;

    /* loaded from: classes2.dex */
    private static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private a() {
        }
    }

    public EnumEntriesSerializationProxy(@l3.d E[] entries) {
        F.p(entries, "entries");
        Class<E> cls = (Class<E>) entries.getClass().getComponentType();
        F.m(cls);
        this.f52084E = cls;
    }

    private final Object a() {
        E[] enumConstants = this.f52084E.getEnumConstants();
        F.o(enumConstants, "getEnumConstants(...)");
        return c.c(enumConstants);
    }
}
