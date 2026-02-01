package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC1440l4;
import com.google.android.gms.internal.measurement.C1408h4;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.measurement.l4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1440l4<MessageType extends AbstractC1440l4<MessageType, BuilderType>, BuilderType extends C1408h4<MessageType, BuilderType>> extends AbstractC1518v3<MessageType, BuilderType> {
    private static final Map zza = new ConcurrentHashMap();
    protected C1496s5 zzc = C1496s5.c();
    protected int zzd = -1;

    /* JADX INFO: Access modifiers changed from: protected */
    public static InterfaceC1480q4 l() {
        return C1448m4.d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static InterfaceC1487r4 n() {
        return F4.c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static InterfaceC1487r4 o(InterfaceC1487r4 interfaceC1487r4) {
        int i4;
        int size = interfaceC1487r4.size();
        if (size == 0) {
            i4 = 10;
        } else {
            i4 = size + size;
        }
        return interfaceC1487r4.zzd(i4);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static InterfaceC1495s4 p() {
        return Y4.c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static InterfaceC1495s4 q(InterfaceC1495s4 interfaceC1495s4) {
        int i4;
        int size = interfaceC1495s4.size();
        if (size == 0) {
            i4 = 10;
        } else {
            i4 = size + size;
        }
        return interfaceC1495s4.zzd(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object r(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e4) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e4);
        } catch (InvocationTargetException e5) {
            Throwable cause = e5.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static Object s(P4 p4, String str, Object[] objArr) {
        return new Z4(p4, str, objArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void t(Class cls, AbstractC1440l4 abstractC1440l4) {
        zza.put(cls, abstractC1440l4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static AbstractC1440l4 x(Class cls) {
        Map map = zza;
        AbstractC1440l4 abstractC1440l4 = (AbstractC1440l4) map.get(cls);
        if (abstractC1440l4 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC1440l4 = (AbstractC1440l4) map.get(cls);
            } catch (ClassNotFoundException e4) {
                throw new IllegalStateException("Class initialization cannot fail.", e4);
            }
        }
        if (abstractC1440l4 == null) {
            abstractC1440l4 = (AbstractC1440l4) ((AbstractC1440l4) B5.j(cls)).y(6, null, null);
            if (abstractC1440l4 != null) {
                map.put(cls, abstractC1440l4);
            } else {
                throw new IllegalStateException();
            }
        }
        return abstractC1440l4;
    }

    @Override // com.google.android.gms.internal.measurement.Q4
    public final /* synthetic */ P4 b() {
        return (AbstractC1440l4) y(6, null, null);
    }

    @Override // com.google.android.gms.internal.measurement.P4
    public final /* synthetic */ O4 d() {
        return (C1408h4) y(5, null, null);
    }

    @Override // com.google.android.gms.internal.measurement.P4
    public final /* synthetic */ O4 e() {
        C1408h4 c1408h4 = (C1408h4) y(5, null, null);
        c1408h4.o(this);
        return c1408h4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return X4.a().b(getClass()).zzj(this, (AbstractC1440l4) obj);
    }

    @Override // com.google.android.gms.internal.measurement.P4
    public final int f() {
        int i4 = this.zzd;
        if (i4 == -1) {
            int zza2 = X4.a().b(getClass()).zza(this);
            this.zzd = zza2;
            return zza2;
        }
        return i4;
    }

    @Override // com.google.android.gms.internal.measurement.P4
    public final void g(S3 s32) throws IOException {
        X4.a().b(getClass()).a(this, T3.J(s32));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC1518v3
    public final int h() {
        return this.zzd;
    }

    public final int hashCode() {
        int i4 = this.zzb;
        if (i4 != 0) {
            return i4;
        }
        int zzb = X4.a().b(getClass()).zzb(this);
        this.zzb = zzb;
        return zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC1518v3
    public final void j(int i4) {
        this.zzd = i4;
    }

    public final String toString() {
        return R4.a(this, super.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final C1408h4 u() {
        return (C1408h4) y(5, null, null);
    }

    public final C1408h4 w() {
        C1408h4 c1408h4 = (C1408h4) y(5, null, null);
        c1408h4.o(this);
        return c1408h4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Object y(int i4, Object obj, Object obj2);
}
