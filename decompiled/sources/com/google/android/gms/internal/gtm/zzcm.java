package com.google.android.gms.internal.gtm;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.analytics.A;
import com.google.android.gms.analytics.C1153a;
import com.google.android.gms.analytics.j;
import com.google.android.gms.analytics.q;
import com.google.android.gms.common.internal.C1285y;
import com.google.android.gms.common.wrappers.e;
import com.google.firebase.messaging.C1821f;
import com.harman.jbl.partybox.ui.effectlab.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzcm extends zzbu {
    private boolean zza;
    private final zzcg zzb;
    private final zzfg zzc;
    private final zzfe zzd;
    private final zzce zze;
    private long zzf;
    private final zzcy zzg;
    private final zzcy zzh;
    private final zzfq zzi;
    private long zzj;
    private boolean zzk;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzcm(zzbx zzbxVar, zzby zzbyVar) {
        super(zzbxVar);
        C1285y.l(zzbyVar);
        this.zzf = Long.MIN_VALUE;
        this.zzd = new zzfe(zzbxVar);
        this.zzb = new zzcg(zzbxVar);
        this.zzc = new zzfg(zzbxVar);
        this.zze = new zzce(zzbxVar);
        this.zzi = new zzfq(zzC());
        this.zzg = new zzci(this, zzbxVar);
        this.zzh = new zzcj(this, zzbxVar);
    }

    private final void zzaf() {
        zzda zzy = zzy();
        if (zzy.zze()) {
            zzy.zza();
        }
    }

    private final void zzag() {
        if (this.zzg.zzh()) {
            zzN("All hits dispatched or no network/service. Going to power save mode");
        }
        this.zzg.zzf();
    }

    private final void zzah() {
        long j4;
        zzda zzy = zzy();
        if (zzy.zzc() && !zzy.zze()) {
            A.h();
            zzV();
            try {
                j4 = this.zzb.zzc();
            } catch (SQLiteException e4) {
                zzJ("Failed to get min/max hit times from local store", e4);
                j4 = 0;
            }
            if (j4 != 0) {
                long abs = Math.abs(zzC().a() - j4);
                zzw();
                if (abs <= ((Long) zzew.zzn.zzb()).longValue()) {
                    zzw();
                    zzO("Dispatch alarm scheduled (ms)", Long.valueOf(zzcv.zzd()));
                    zzy.zzb();
                }
            }
        }
    }

    private final void zzai(zzbz zzbzVar, zzay zzayVar) {
        C1285y.l(zzbzVar);
        C1285y.l(zzayVar);
        j jVar = new j(zzt());
        jVar.f(zzbzVar.zzc());
        jVar.g(zzbzVar.zzf());
        q d4 = jVar.d();
        zzbg zzbgVar = (zzbg) d4.b(zzbg.class);
        zzbgVar.zzk(C1821f.C0339f.a.f37006R);
        zzbgVar.zzl(true);
        d4.g(zzayVar);
        zzbb zzbbVar = (zzbb) d4.b(zzbb.class);
        zzax zzaxVar = (zzax) d4.b(zzax.class);
        for (Map.Entry entry : zzbzVar.zzd().entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if ("an".equals(str)) {
                zzaxVar.zzk(str2);
            } else if ("av".equals(str)) {
                zzaxVar.zzl(str2);
            } else if ("aid".equals(str)) {
                zzaxVar.zzi(str2);
            } else if ("aiid".equals(str)) {
                zzaxVar.zzj(str2);
            } else if ("uid".equals(str)) {
                zzbgVar.zzm(str2);
            } else {
                zzbbVar.zze(str, str2);
            }
        }
        zzG("Sending installation campaign to", zzbzVar.zzc(), zzayVar);
        d4.j(zzA().zza());
        d4.k();
    }

    private final boolean zzaj(String str) {
        if (e.a(zzo()).a(str) == 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zzc(zzcm zzcmVar) {
        try {
            zzcmVar.zzb.zza();
            zzcmVar.zzad();
        } catch (SQLiteException e4) {
            zzcmVar.zzR("Failed to delete stale hits", e4);
        }
        zzcy zzcyVar = zzcmVar.zzh;
        zzcmVar.zzw();
        zzcyVar.zzg(86400000L);
    }

    public final void zzY(long j4) {
        A.h();
        zzV();
        if (j4 < 0) {
            j4 = 0;
        }
        this.zzf = j4;
        zzad();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzZ() {
        zzV();
        C1285y.s(!this.zza, "Analytics backend already started");
        this.zza = true;
        zzq().i(new zzck(this));
    }

    public final long zza() {
        long j4 = this.zzf;
        if (j4 != Long.MIN_VALUE) {
            return j4;
        }
        zzw();
        long longValue = ((Long) zzew.zzi.zzb()).longValue();
        zzfv zzB = zzB();
        zzB.zzV();
        if (zzB.zzc) {
            zzB().zzV();
            return r0.zzd * 1000;
        }
        return longValue;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzaa() {
        zzV();
        zzw();
        A.h();
        Context zza = zzt().zza();
        if (!zzfk.zza(zza)) {
            zzQ("AnalyticsReceiver is not registered or is disabled. Register the receiver for reliable dispatching on non-Google Play devices. See http://goo.gl/8Rd3yj for instructions.");
        } else if (!zzfp.zzh(zza)) {
            zzI("AnalyticsService is not registered or is disabled. Analytics service at risk of not starting. See http://goo.gl/8Rd3yj for instructions.");
        }
        if (!C1153a.zzb(zza)) {
            zzQ("CampaignTrackingReceiver is not registered, not exported or is disabled. Installation campaign tracking is not possible. See http://goo.gl/8Rd3yj for instructions.");
        }
        zzA().zza();
        if (!zzaj("android.permission.ACCESS_NETWORK_STATE")) {
            zzI("Missing required android.permission.ACCESS_NETWORK_STATE. Google Analytics disabled. See http://goo.gl/8Rd3yj for instructions");
            zzac();
        }
        if (!zzaj("android.permission.INTERNET")) {
            zzI("Missing required android.permission.INTERNET. Google Analytics disabled. See http://goo.gl/8Rd3yj for instructions");
            zzac();
        }
        if (zzfp.zzh(zzo())) {
            zzN("AnalyticsService registered in the app manifest and enabled");
        } else {
            zzw();
            zzQ("AnalyticsService not registered in the app manifest. Hits might not be delivered reliably. See http://goo.gl/8Rd3yj for instructions.");
        }
        if (!this.zzk) {
            zzw();
            if (!this.zzb.zzab()) {
                zzi();
            }
        }
        zzad();
    }

    public final void zzab() {
        A.h();
        zzV();
        zzE("Sync dispatching local hits");
        long j4 = this.zzj;
        zzw();
        zzi();
        try {
            zzae();
            zzA().zzi();
            zzad();
            if (this.zzj != j4) {
                this.zzd.zzb();
            }
        } catch (Exception e4) {
            zzJ("Sync local dispatch failed", e4);
            zzad();
        }
    }

    public final void zzac() {
        zzV();
        A.h();
        this.zzk = true;
        this.zze.zzc();
        zzad();
    }

    public final void zzad() {
        long min;
        A.h();
        zzV();
        if (!this.zzk) {
            zzw();
            if (zza() > 0) {
                if (this.zzb.zzab()) {
                    this.zzd.zzc();
                    zzag();
                    zzaf();
                    return;
                }
                if (!((Boolean) zzew.zzJ.zzb()).booleanValue()) {
                    this.zzd.zza();
                    if (!this.zzd.zzd()) {
                        zzag();
                        zzaf();
                        zzah();
                        return;
                    }
                }
                zzah();
                long zza = zza();
                long zzb = zzA().zzb();
                if (zzb != 0) {
                    min = zza - Math.abs(zzC().a() - zzb);
                    if (min <= 0) {
                        zzw();
                        min = Math.min(zzcv.zze(), zza);
                    }
                } else {
                    zzw();
                    min = Math.min(zzcv.zze(), zza);
                }
                zzO("Dispatch scheduled (ms)", Long.valueOf(min));
                if (this.zzg.zzh()) {
                    this.zzg.zze(Math.max(1L, min + this.zzg.zzb()));
                    return;
                } else {
                    this.zzg.zzg(min);
                    return;
                }
            }
        }
        this.zzd.zzc();
        zzag();
        zzaf();
    }

    protected final boolean zzae() {
        boolean z3;
        A.h();
        zzV();
        zzN("Dispatching a batch of local hits");
        if (!this.zze.zzg()) {
            zzw();
            z3 = true;
        } else {
            z3 = false;
        }
        boolean zze = true ^ this.zzc.zze();
        if (z3 && zze) {
            zzN("No network or service available. Will retry later");
            return false;
        }
        zzw();
        int zzh = zzcv.zzh();
        zzw();
        long max = Math.max(zzh, zzcv.zzg());
        ArrayList arrayList = new ArrayList();
        long j4 = 0;
        while (true) {
            try {
                try {
                    this.zzb.zzm();
                    arrayList.clear();
                    try {
                        List zzj = this.zzb.zzj(max);
                        if (zzj.isEmpty()) {
                            zzN("Store is empty, nothing to dispatch");
                            zzag();
                            zzaf();
                            try {
                                this.zzb.zzaa();
                                this.zzb.zzZ();
                                return false;
                            } catch (SQLiteException e4) {
                                zzJ("Failed to commit local dispatch transaction", e4);
                                zzag();
                                zzaf();
                                return false;
                            }
                        }
                        zzO("Hits loaded from store. count", Integer.valueOf(zzj.size()));
                        Iterator it = zzj.iterator();
                        while (it.hasNext()) {
                            if (((zzez) it.next()).zzb() == j4) {
                                zzK("Database contains successfully uploaded hit", Long.valueOf(j4), Integer.valueOf(zzj.size()));
                                zzag();
                                zzaf();
                                try {
                                    this.zzb.zzaa();
                                    this.zzb.zzZ();
                                    return false;
                                } catch (SQLiteException e5) {
                                    zzJ("Failed to commit local dispatch transaction", e5);
                                    zzag();
                                    zzaf();
                                    return false;
                                }
                            }
                        }
                        if (this.zze.zzg()) {
                            zzw();
                            zzN("Service connected, sending hits to the service");
                            while (!zzj.isEmpty()) {
                                zzez zzezVar = (zzez) zzj.get(0);
                                if (!this.zze.zzh(zzezVar)) {
                                    break;
                                }
                                j4 = Math.max(j4, zzezVar.zzb());
                                zzj.remove(zzezVar);
                                zzF("Hit sent do device AnalyticsService for delivery", zzezVar);
                                try {
                                    this.zzb.zzn(zzezVar.zzb());
                                    arrayList.add(Long.valueOf(zzezVar.zzb()));
                                } catch (SQLiteException e6) {
                                    zzJ("Failed to remove hit that was send for delivery", e6);
                                    zzag();
                                    zzaf();
                                    try {
                                        this.zzb.zzaa();
                                        this.zzb.zzZ();
                                        return false;
                                    } catch (SQLiteException e7) {
                                        zzJ("Failed to commit local dispatch transaction", e7);
                                        zzag();
                                        zzaf();
                                        return false;
                                    }
                                }
                            }
                        }
                        if (this.zzc.zze()) {
                            List zzc = this.zzc.zzc(zzj);
                            Iterator it2 = zzc.iterator();
                            while (it2.hasNext()) {
                                j4 = Math.max(j4, ((Long) it2.next()).longValue());
                            }
                            try {
                                this.zzb.zzY(zzc);
                                arrayList.addAll(zzc);
                            } catch (SQLiteException e8) {
                                zzJ("Failed to remove successfully uploaded hits", e8);
                                zzag();
                                zzaf();
                                try {
                                    this.zzb.zzaa();
                                    this.zzb.zzZ();
                                    return false;
                                } catch (SQLiteException e9) {
                                    zzJ("Failed to commit local dispatch transaction", e9);
                                    zzag();
                                    zzaf();
                                    return false;
                                }
                            }
                        }
                        if (arrayList.isEmpty()) {
                            try {
                                this.zzb.zzaa();
                                this.zzb.zzZ();
                                return false;
                            } catch (SQLiteException e10) {
                                zzJ("Failed to commit local dispatch transaction", e10);
                                zzag();
                                zzaf();
                                return false;
                            }
                        }
                        try {
                            this.zzb.zzaa();
                            this.zzb.zzZ();
                        } catch (SQLiteException e11) {
                            zzJ("Failed to commit local dispatch transaction", e11);
                            zzag();
                            zzaf();
                            return false;
                        }
                    } catch (SQLiteException e12) {
                        zzR("Failed to read hits from persisted store", e12);
                        zzag();
                        zzaf();
                        try {
                            this.zzb.zzaa();
                            this.zzb.zzZ();
                            return false;
                        } catch (SQLiteException e13) {
                            zzJ("Failed to commit local dispatch transaction", e13);
                            zzag();
                            zzaf();
                            return false;
                        }
                    }
                } catch (Throwable th) {
                    this.zzb.zzaa();
                    this.zzb.zzZ();
                    throw th;
                }
                this.zzb.zzaa();
                this.zzb.zzZ();
                throw th;
            } catch (SQLiteException e14) {
                zzJ("Failed to commit local dispatch transaction", e14);
                zzag();
                zzaf();
                return false;
            }
        }
    }

    public final long zzb(zzbz zzbzVar, boolean z3) {
        C1285y.l(zzbzVar);
        zzV();
        A.h();
        try {
            try {
                this.zzb.zzm();
                zzcg zzcgVar = this.zzb;
                String zzb = zzbzVar.zzb();
                C1285y.h(zzb);
                zzcgVar.zzV();
                A.h();
                int delete = zzcgVar.zzf().delete("properties", "app_uid=? AND cid<>?", new String[]{a.f43472q, zzb});
                if (delete > 0) {
                    zzcgVar.zzO("Deleted property records", Integer.valueOf(delete));
                }
                long zze = this.zzb.zze(0L, zzbzVar.zzb(), zzbzVar.zzc());
                zzbzVar.zze(1 + zze);
                zzcg zzcgVar2 = this.zzb;
                C1285y.l(zzbzVar);
                zzcgVar2.zzV();
                A.h();
                SQLiteDatabase zzf = zzcgVar2.zzf();
                Map zzd = zzbzVar.zzd();
                C1285y.l(zzd);
                Uri.Builder builder = new Uri.Builder();
                for (Map.Entry entry : zzd.entrySet()) {
                    builder.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
                }
                String encodedQuery = builder.build().getEncodedQuery();
                if (encodedQuery == null) {
                    encodedQuery = "";
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("app_uid", (Long) 0L);
                contentValues.put("cid", zzbzVar.zzb());
                contentValues.put("tid", zzbzVar.zzc());
                contentValues.put("adid", Integer.valueOf(zzbzVar.zzf() ? 1 : 0));
                contentValues.put("hits_count", Long.valueOf(zzbzVar.zza()));
                contentValues.put("params", encodedQuery);
                try {
                    if (zzf.insertWithOnConflict("properties", null, contentValues, 5) == -1) {
                        zzcgVar2.zzI("Failed to insert/update a property (got -1)");
                    }
                } catch (SQLiteException e4) {
                    zzcgVar2.zzJ("Error storing a property", e4);
                }
                this.zzb.zzaa();
                try {
                    this.zzb.zzZ();
                } catch (SQLiteException e5) {
                    zzJ("Failed to end transaction", e5);
                }
                return zze;
            } catch (SQLiteException e6) {
                zzJ("Failed to update Analytics property", e6);
                try {
                    this.zzb.zzZ();
                } catch (SQLiteException e7) {
                    zzJ("Failed to end transaction", e7);
                }
                return -1L;
            }
        } catch (Throwable th) {
            try {
                this.zzb.zzZ();
            } catch (SQLiteException e8) {
                zzJ("Failed to end transaction", e8);
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzbu
    protected final void zzd() {
        this.zzb.zzW();
        this.zzc.zzW();
        this.zze.zzW();
    }

    public final void zzf(zzdb zzdbVar) {
        zzg(zzdbVar, this.zzj);
    }

    public final void zzg(zzdb zzdbVar, long j4) {
        long j5;
        A.h();
        zzV();
        long zzb = zzA().zzb();
        if (zzb != 0) {
            j5 = Math.abs(zzC().a() - zzb);
        } else {
            j5 = -1;
        }
        zzF("Dispatching local hits. Elapsed time since last dispatch (ms)", Long.valueOf(j5));
        zzw();
        zzi();
        try {
            zzae();
            zzA().zzi();
            zzad();
            if (zzdbVar != null) {
                zzdbVar.zza(null);
            }
            if (this.zzj != j4) {
                this.zzd.zzb();
            }
        } catch (Exception e4) {
            zzJ("Local dispatch failed", e4);
            zzA().zzi();
            zzad();
            if (zzdbVar != null) {
                zzdbVar.zza(e4);
            }
        }
    }

    public final void zzh() {
        A.h();
        zzV();
        zzw();
        zzN("Delete all hits from local store");
        try {
            zzcg zzcgVar = this.zzb;
            A.h();
            zzcgVar.zzV();
            zzcgVar.zzf().delete("hits2", null, null);
            zzcg zzcgVar2 = this.zzb;
            A.h();
            zzcgVar2.zzV();
            zzcgVar2.zzf().delete("properties", null, null);
            zzad();
        } catch (SQLiteException e4) {
            zzR("Failed to delete hits from store", e4);
        }
        zzi();
        if (this.zze.zze()) {
            zzN("Device service unavailable. Can't clear hits stored on the device service.");
        }
    }

    protected final void zzi() {
        if (this.zzk) {
            return;
        }
        zzw();
        if (!zzcv.zzl() || this.zze.zzg()) {
            return;
        }
        zzw();
        if (this.zzi.zzc(((Long) zzew.zzO.zzb()).longValue())) {
            this.zzi.zzb();
            zzN("Connecting to service");
            if (this.zze.zzf()) {
                zzN("Connected to service");
                this.zzi.zza();
                zzm();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x014e, code lost:
    
        if (r2.moveToFirst() != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0150, code lost:
    
        r8.add(java.lang.Long.valueOf(r2.getLong(0)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x015f, code lost:
    
        if (r2.moveToNext() != false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0166, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0178, code lost:
    
        r0 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0175, code lost:
    
        if (r2 == 0) goto L61;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:71:0x018c A[Catch: SQLiteException -> 0x00cc, TryCatch #4 {SQLiteException -> 0x00cc, blocks: (B:16:0x0079, B:17:0x0098, B:19:0x009e, B:22:0x00b2, B:25:0x00ba, B:28:0x00c2, B:35:0x00cf, B:38:0x00db, B:40:0x00e4, B:41:0x01f5, B:43:0x00ef, B:45:0x010a, B:47:0x011b, B:48:0x0179, B:49:0x0120, B:61:0x0166, B:71:0x018c, B:72:0x018f, B:76:0x0190, B:78:0x01be, B:79:0x01cd, B:89:0x01f0, B:90:0x01c6, B:81:0x01d2, B:83:0x01de, B:86:0x01e6), top: B:15:0x0079, inners: #1 }] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v11, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzj(com.google.android.gms.internal.gtm.zzez r20) {
        /*
            Method dump skipped, instructions count: 520
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzcm.zzj(com.google.android.gms.internal.gtm.zzez):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzk(zzbz zzbzVar) {
        A.h();
        zzF("Sending first hit to property", zzbzVar.zzc());
        zzfq zzf = zzA().zzf();
        zzw();
        if (zzf.zzc(zzcv.zzc())) {
            return;
        }
        String zzg = zzA().zzg();
        if (TextUtils.isEmpty(zzg)) {
            return;
        }
        zzay zzb = zzfu.zzb(zzz(), zzg);
        zzF("Found relevant installation campaign", zzb);
        zzai(zzbzVar, zzb);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzl() {
        A.h();
        this.zzj = zzC().a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzm() {
        A.h();
        zzw();
        A.h();
        zzV();
        zzw();
        zzw();
        if (!zzcv.zzl()) {
            zzQ("Service client disabled. Can't dispatch local hits to device AnalyticsService");
        }
        if (!this.zze.zzg()) {
            zzN("Service not connected");
            return;
        }
        if (this.zzb.zzab()) {
            return;
        }
        zzN("Dispatching local hits to device AnalyticsService");
        while (true) {
            try {
                zzcg zzcgVar = this.zzb;
                zzw();
                List zzj = zzcgVar.zzj(zzcv.zzh());
                if (zzj.isEmpty()) {
                    zzad();
                    return;
                }
                while (!zzj.isEmpty()) {
                    zzez zzezVar = (zzez) zzj.get(0);
                    if (!this.zze.zzh(zzezVar)) {
                        zzad();
                        return;
                    }
                    zzj.remove(zzezVar);
                    try {
                        this.zzb.zzn(zzezVar.zzb());
                    } catch (SQLiteException e4) {
                        zzJ("Failed to remove hit that was send for delivery", e4);
                        zzag();
                        zzaf();
                        return;
                    }
                }
            } catch (SQLiteException e5) {
                zzJ("Failed to read hits from store", e5);
                zzag();
                zzaf();
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00c6, code lost:
    
        if (r5.moveToFirst() != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c8, code lost:
    
        r7 = r5.getString(0);
        r8 = r5.getString(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00d4, code lost:
    
        if (r5.getInt(2) == 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00d6, code lost:
    
        r24 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00dd, code lost:
    
        r10 = r5.getInt(3);
        r27 = r4.zzl(r5.getString(4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ef, code lost:
    
        if (android.text.TextUtils.isEmpty(r7) != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00f5, code lost:
    
        if (android.text.TextUtils.isEmpty(r8) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00f8, code lost:
    
        r6.add(new com.google.android.gms.internal.gtm.zzbz(0, r7, r8, r24, r10, r27));
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0118, code lost:
    
        if (r5.moveToNext() != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x010f, code lost:
    
        r4.zzS("Read property with empty client id or tracker id", r7, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00da, code lost:
    
        r24 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x011e, code lost:
    
        if (r6.size() < r0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0120, code lost:
    
        r4.zzQ("Sending hits to too many properties. Campaign report might be incorrect");
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0125, code lost:
    
        r5.close();
        r0 = r6.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0130, code lost:
    
        if (r0.hasNext() == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0132, code lost:
    
        zzai((com.google.android.gms.internal.gtm.zzbz) r0.next(), r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x013c, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0151  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzn(java.lang.String r29) {
        /*
            Method dump skipped, instructions count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzcm.zzn(java.lang.String):void");
    }
}
