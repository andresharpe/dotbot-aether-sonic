package com.google.android.gms.internal.gtm;

import android.text.TextUtils;
import com.google.android.gms.ads.identifier.a;
import com.google.android.gms.common.util.D;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Locale;

@D
/* loaded from: classes.dex */
public final class zzbk extends zzbu {
    public static boolean zza;
    private a.C0259a zzb;
    private final zzfq zzc;
    private String zzd;
    private boolean zze;
    private final Object zzf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbk(zzbx zzbxVar) {
        super(zzbxVar);
        this.zze = false;
        this.zzf = new Object();
        this.zzc = new zzfq(zzbxVar.zzr());
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x013f, code lost:
    
        if (r0 == false) goto L72;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0044 A[Catch: all -> 0x001b, TryCatch #4 {, blocks: (B:3:0x0001, B:5:0x000b, B:8:0x0012, B:9:0x0032, B:12:0x003c, B:15:0x0141, B:16:0x0044, B:17:0x004e, B:31:0x0144, B:69:0x0154, B:71:0x0038, B:76:0x001f, B:78:0x0023, B:73:0x002c, B:79:0x0155, B:19:0x004f, B:48:0x0054, B:50:0x006c, B:53:0x0085, B:54:0x008e, B:56:0x0093, B:61:0x009d, B:22:0x00b1, B:27:0x00c2, B:28:0x00d5, B:32:0x00d7, B:33:0x00bc, B:34:0x00ec, B:36:0x0105, B:38:0x0107, B:40:0x010f, B:42:0x0111, B:44:0x0119, B:45:0x012b, B:46:0x013e, B:51:0x00ac), top: B:2:0x0001, inners: #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0038 A[Catch: all -> 0x001b, TryCatch #4 {, blocks: (B:3:0x0001, B:5:0x000b, B:8:0x0012, B:9:0x0032, B:12:0x003c, B:15:0x0141, B:16:0x0044, B:17:0x004e, B:31:0x0144, B:69:0x0154, B:71:0x0038, B:76:0x001f, B:78:0x0023, B:73:0x002c, B:79:0x0155, B:19:0x004f, B:48:0x0054, B:50:0x006c, B:53:0x0085, B:54:0x008e, B:56:0x0093, B:61:0x009d, B:22:0x00b1, B:27:0x00c2, B:28:0x00d5, B:32:0x00d7, B:33:0x00bc, B:34:0x00ec, B:36:0x0105, B:38:0x0107, B:40:0x010f, B:42:0x0111, B:44:0x0119, B:45:0x012b, B:46:0x013e, B:51:0x00ac), top: B:2:0x0001, inners: #6, #7 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final synchronized com.google.android.gms.ads.identifier.a.C0259a zzc() {
        /*
            Method dump skipped, instructions count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzbk.zzc():com.google.android.gms.ads.identifier.a$a");
    }

    private static String zze(String str) {
        MessageDigest zze = zzfu.zze("MD5");
        if (zze == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, zze.digest(str.getBytes())));
    }

    private final boolean zzf(String str) {
        try {
            String zze = zze(str);
            zzN("Storing hashed adid.");
            FileOutputStream openFileOutput = zzo().openFileOutput("gaClientIdData", 0);
            openFileOutput.write(zze.getBytes());
            openFileOutput.close();
            this.zzd = zze;
            return true;
        } catch (IOException e4) {
            zzJ("Error creating hash file", e4);
            return false;
        }
    }

    public final String zza() {
        String str;
        zzV();
        a.C0259a zzc = zzc();
        if (zzc != null) {
            str = zzc.a();
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str;
    }

    public final boolean zzb() {
        zzV();
        a.C0259a zzc = zzc();
        if (zzc == null || zzc.b()) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.gtm.zzbu
    protected final void zzd() {
    }
}
