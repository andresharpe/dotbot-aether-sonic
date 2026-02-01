package com.google.android.gms.internal.gtm;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.analytics.A;
import com.google.android.gms.common.internal.C1285y;
import com.google.android.gms.common.util.D;
import com.google.android.gms.common.util.p;
import com.harman.jbl.partybox.ui.effectlab.a;
import java.io.Closeable;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzcg extends zzbu implements Closeable {
    private static final String zza = String.format("CREATE TABLE IF NOT EXISTS %s ( '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, '%s' INTEGER NOT NULL, '%s' TEXT NOT NULL, '%s' TEXT NOT NULL, '%s' INTEGER);", "hits2", "hit_id", "hit_time", "hit_url", "hit_string", "hit_app_id");
    private static final String zzb = String.format("SELECT MAX(%s) FROM %s WHERE 1;", "hit_time", "hits2");
    private final zzcf zzc;
    private final zzfq zzd;
    private final zzfq zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcg(zzbx zzbxVar) {
        super(zzbxVar);
        this.zzd = new zzfq(zzC());
        this.zze = new zzfq(zzC());
        this.zzc = new zzcf(this, zzbxVar.zza(), zzad());
    }

    private final long zzac(String str, String[] strArr, long j4) {
        Cursor cursor = null;
        try {
            try {
                cursor = zzf().rawQuery(str, strArr);
                if (cursor.moveToFirst()) {
                    long j5 = cursor.getLong(0);
                    cursor.close();
                    return j5;
                }
                cursor.close();
                return 0L;
            } catch (SQLiteException e4) {
                zzK("Database error", str, e4);
                throw e4;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String zzad() {
        zzw();
        zzw();
        return "google_analytics_v4.db";
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            this.zzc.close();
        } catch (SQLiteException e4) {
            zzJ("Sql error closing database", e4);
        } catch (IllegalStateException e5) {
            zzJ("Error closing database", e5);
        }
    }

    public final void zzY(List list) {
        C1285y.l(list);
        A.h();
        zzV();
        if (list.isEmpty()) {
            return;
        }
        StringBuilder sb = new StringBuilder("hit_id");
        sb.append(" in (");
        for (int i4 = 0; i4 < list.size(); i4++) {
            Long l4 = (Long) list.get(i4);
            if (l4 != null && l4.longValue() != 0) {
                if (i4 > 0) {
                    sb.append(",");
                }
                sb.append(l4);
            } else {
                throw new SQLiteException("Invalid hit id");
            }
        }
        sb.append(")");
        String sb2 = sb.toString();
        try {
            SQLiteDatabase zzf = zzf();
            zzO("Deleting dispatched hits. count", Integer.valueOf(list.size()));
            int delete = zzf.delete("hits2", sb2, null);
            if (delete != list.size()) {
                zzT("Deleted fewer hits then expected", Integer.valueOf(list.size()), Integer.valueOf(delete), sb2);
            }
        } catch (SQLiteException e4) {
            zzJ("Error deleting hits", e4);
            throw e4;
        }
    }

    public final void zzZ() {
        zzV();
        zzf().endTransaction();
    }

    public final int zza() {
        A.h();
        zzV();
        if (!this.zzd.zzc(86400000L)) {
            return 0;
        }
        this.zzd.zzb();
        zzN("Deleting stale hits (if any)");
        int delete = zzf().delete("hits2", "hit_time < ?", new String[]{Long.toString(zzC().a() - 2592000000L)});
        zzO("Deleted stale hits, count", Integer.valueOf(delete));
        return delete;
    }

    public final void zzaa() {
        zzV();
        zzf().setTransactionSuccessful();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzab() {
        if (zzb() == 0) {
            return true;
        }
        return false;
    }

    public final long zzb() {
        A.h();
        zzV();
        Cursor cursor = null;
        try {
            try {
                Cursor rawQuery = zzf().rawQuery("SELECT COUNT(*) FROM hits2", null);
                if (rawQuery.moveToFirst()) {
                    long j4 = rawQuery.getLong(0);
                    rawQuery.close();
                    return j4;
                }
                throw new SQLiteException("Database returned empty set");
            } catch (SQLiteException e4) {
                zzK("Database error", "SELECT COUNT(*) FROM hits2", e4);
                throw e4;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public final long zzc() {
        A.h();
        zzV();
        return zzac(zzb, null, 0L);
    }

    @Override // com.google.android.gms.internal.gtm.zzbu
    protected final void zzd() {
    }

    public final long zze(long j4, String str, String str2) {
        C1285y.h(str);
        C1285y.h(str2);
        zzV();
        A.h();
        return zzac("SELECT hits_count FROM properties WHERE app_uid=? AND cid=? AND tid=?", new String[]{a.f43472q, str, str2}, 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @D
    public final SQLiteDatabase zzf() {
        try {
            return this.zzc.getWritableDatabase();
        } catch (SQLiteException e4) {
            zzR("Error opening database", e4);
            throw e4;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a1 A[LOOP:0: B:11:0x005b->B:19:0x00a1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b6 A[EDGE_INSN: B:20:0x00b6->B:21:0x00b6 BREAK  A[LOOP:0: B:11:0x005b->B:19:0x00a1], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List zzj(long r19) {
        /*
            Method dump skipped, instructions count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzcg.zzj(long):java.util.List");
    }

    @D
    final Map zzk(String str) {
        if (TextUtils.isEmpty(str)) {
            return new HashMap(0);
        }
        try {
            if (!str.startsWith("?")) {
                str = "?" + str;
            }
            return p.a(new URI(str), "UTF-8");
        } catch (URISyntaxException e4) {
            zzJ("Error parsing hit parameters", e4);
            return new HashMap(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @D
    public final Map zzl(String str) {
        if (TextUtils.isEmpty(str)) {
            return new HashMap(0);
        }
        try {
            return p.a(new URI("?" + str), "UTF-8");
        } catch (URISyntaxException e4) {
            zzJ("Error parsing property parameters", e4);
            return new HashMap(0);
        }
    }

    public final void zzm() {
        zzV();
        zzf().beginTransaction();
    }

    public final void zzn(long j4) {
        A.h();
        zzV();
        ArrayList arrayList = new ArrayList(1);
        Long valueOf = Long.valueOf(j4);
        arrayList.add(valueOf);
        zzO("Deleting hit, id", valueOf);
        zzY(arrayList);
    }
}
