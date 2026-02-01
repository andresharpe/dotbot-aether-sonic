package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzbez;
import com.google.android.gms.internal.gtm.zzbff;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public abstract class zzbff<MessageType extends zzbff<MessageType, BuilderType>, BuilderType extends zzbez<MessageType, BuilderType>> extends zzbay<MessageType, BuilderType> {
    private static final Map zza = new ConcurrentHashMap();
    protected zzbia zzd = zzbia.zzc();
    protected int zze = -1;

    public static zzbfd zzab(zzbgs zzbgsVar, zzbgs zzbgsVar2, zzbfi zzbfiVar, int i4, zzbip zzbipVar, boolean z3, Class cls) {
        return new zzbfd(zzbgsVar, Collections.emptyList(), zzbgsVar2, new zzbfc(null, i4, zzbipVar, true, false), cls);
    }

    public static zzbfd zzac(zzbgs zzbgsVar, Object obj, zzbgs zzbgsVar2, zzbfi zzbfiVar, int i4, zzbip zzbipVar, Class cls) {
        return new zzbfd(zzbgsVar, obj, zzbgsVar2, new zzbfc(zzbfiVar, i4, zzbipVar, false, false), cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzbff zzad(Class cls) {
        Map map = zza;
        zzbff zzbffVar = (zzbff) map.get(cls);
        if (zzbffVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzbffVar = (zzbff) map.get(cls);
            } catch (ClassNotFoundException e4) {
                throw new IllegalStateException("Class initialization cannot fail.", e4);
            }
        }
        if (zzbffVar == null) {
            zzbffVar = (zzbff) ((zzbff) zzbij.zze(cls)).zzb(6, null, null);
            if (zzbffVar != null) {
                map.put(cls, zzbffVar);
            } else {
                throw new IllegalStateException();
            }
        }
        return zzbffVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static zzbff zzae(zzbff zzbffVar, InputStream inputStream, zzbep zzbepVar) throws zzbfs {
        zzbca zzbcaVar = new zzbca(inputStream, 4096, null);
        zzbff zzbffVar2 = (zzbff) zzbffVar.zzb(4, null, null);
        try {
            zzbhf zzb = zzbhb.zza().zzb(zzbffVar2.getClass());
            zzb.zzh(zzbffVar2, zzbcd.zzp(zzbcaVar), zzbepVar);
            zzb.zzf(zzbffVar2);
            zzc(zzbffVar2);
            return zzbffVar2;
        } catch (zzbfs e4) {
            e = e4;
            if (e.zzl()) {
                e = new zzbfs(e);
            }
            e.zzh(zzbffVar2);
            throw e;
        } catch (zzbhy e5) {
            zzbfs zza2 = e5.zza();
            zza2.zzh(zzbffVar2);
            throw zza2;
        } catch (IOException e6) {
            if (e6.getCause() instanceof zzbfs) {
                throw ((zzbfs) e6.getCause());
            }
            zzbfs zzbfsVar = new zzbfs(e6);
            zzbfsVar.zzh(zzbffVar2);
            throw zzbfsVar;
        } catch (RuntimeException e7) {
            if (e7.getCause() instanceof zzbfs) {
                throw ((zzbfs) e7.getCause());
            }
            throw e7;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static zzbff zzaf(zzbff zzbffVar, byte[] bArr, zzbep zzbepVar) throws zzbfs {
        zzbff zze = zze(zzbffVar, bArr, 0, bArr.length, zzbepVar);
        zzc(zze);
        return zze;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static zzbfk zzag() {
        return zzbew.zze();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static zzbfl zzah() {
        return zzbfg.zzf();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static zzbfo zzai() {
        return zzbgh.zzf();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static zzbfp zzaj() {
        return zzbhc.zze();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static zzbfp zzak(zzbfp zzbfpVar) {
        int i4;
        int size = zzbfpVar.size();
        if (size == 0) {
            i4 = 10;
        } else {
            i4 = size + size;
        }
        return zzbfpVar.zzd(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object zzal(Method method, Object obj, Object... objArr) {
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
    public static Object zzam(zzbgs zzbgsVar, String str, Object[] objArr) {
        return new zzbhd(zzbgsVar, str, objArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void zzan(Class cls, zzbff zzbffVar) {
        zza.put(cls, zzbffVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final boolean zzao(zzbff zzbffVar, boolean z3) {
        zzbff zzbffVar2;
        byte byteValue = ((Byte) zzbffVar.zzb(1, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zzk = zzbhb.zza().zzb(zzbffVar.getClass()).zzk(zzbffVar);
        if (z3) {
            if (true != zzk) {
                zzbffVar2 = null;
            } else {
                zzbffVar2 = zzbffVar;
            }
            zzbffVar.zzb(2, zzbffVar2, null);
        }
        return zzk;
    }

    private static zzbff zzc(zzbff zzbffVar) throws zzbfs {
        if (zzbffVar != null && !zzbffVar.zzaw()) {
            zzbfs zza2 = new zzbhy(zzbffVar).zza();
            zza2.zzh(zzbffVar);
            throw zza2;
        }
        return zzbffVar;
    }

    private static zzbff zze(zzbff zzbffVar, byte[] bArr, int i4, int i5, zzbep zzbepVar) throws zzbfs {
        zzbff zzbffVar2 = (zzbff) zzbffVar.zzb(4, null, null);
        try {
            zzbhf zzb = zzbhb.zza().zzb(zzbffVar2.getClass());
            zzb.zzi(zzbffVar2, bArr, 0, i5, new zzbbf(zzbepVar));
            zzb.zzf(zzbffVar2);
            if (zzbffVar2.zzc == 0) {
                return zzbffVar2;
            }
            throw new RuntimeException();
        } catch (zzbfs e4) {
            e = e4;
            if (e.zzl()) {
                e = new zzbfs(e);
            }
            e.zzh(zzbffVar2);
            throw e;
        } catch (zzbhy e5) {
            zzbfs zza2 = e5.zza();
            zza2.zzh(zzbffVar2);
            throw zza2;
        } catch (IOException e6) {
            if (e6.getCause() instanceof zzbfs) {
                throw ((zzbfs) e6.getCause());
            }
            zzbfs zzbfsVar = new zzbfs(e6);
            zzbfsVar.zzh(zzbffVar2);
            throw zzbfsVar;
        } catch (IndexOutOfBoundsException unused) {
            zzbfs zzj = zzbfs.zzj();
            zzj.zzh(zzbffVar2);
            throw zzj;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zzbhb.zza().zzb(getClass()).zzj(this, (zzbff) obj);
    }

    public final int hashCode() {
        int i4 = this.zzc;
        if (i4 != 0) {
            return i4;
        }
        int zzb = zzbhb.zza().zzb(getClass()).zzb(this);
        this.zzc = zzb;
        return zzb;
    }

    public final String toString() {
        return zzbgu.zza(this, super.toString());
    }

    @Override // com.google.android.gms.internal.gtm.zzbay
    final int zzQ() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.gtm.zzbay
    final void zzT(int i4) {
        this.zze = i4;
    }

    @Override // com.google.android.gms.internal.gtm.zzbgs
    public final int zzY() {
        int i4 = this.zze;
        if (i4 == -1) {
            int zza2 = zzbhb.zza().zzb(getClass()).zza(this);
            this.zze = zza2;
            return zza2;
        }
        return i4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzbez zzZ() {
        return (zzbez) zzb(5, null, null);
    }

    public final zzbez zzaa() {
        zzbez zzbezVar = (zzbez) zzb(5, null, null);
        zzbezVar.zzz(this);
        return zzbezVar;
    }

    @Override // com.google.android.gms.internal.gtm.zzbgs
    public final /* synthetic */ zzbgr zzas() {
        return (zzbez) zzb(5, null, null);
    }

    @Override // com.google.android.gms.internal.gtm.zzbgs
    public final /* synthetic */ zzbgr zzat() {
        zzbez zzbezVar = (zzbez) zzb(5, null, null);
        zzbezVar.zzz(this);
        return zzbezVar;
    }

    @Override // com.google.android.gms.internal.gtm.zzbgs
    public final void zzau(zzbcj zzbcjVar) throws IOException {
        zzbhb.zza().zzb(getClass()).zzn(this, zzbck.zza(zzbcjVar));
    }

    @Override // com.google.android.gms.internal.gtm.zzbgt
    public final /* synthetic */ zzbgs zzav() {
        return (zzbff) zzb(6, null, null);
    }

    @Override // com.google.android.gms.internal.gtm.zzbgt
    public final boolean zzaw() {
        return zzao(this, true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Object zzb(int i4, Object obj, Object obj2);
}
