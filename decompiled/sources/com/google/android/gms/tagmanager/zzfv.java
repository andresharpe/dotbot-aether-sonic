package com.google.android.gms.tagmanager;

import N0.a;
import android.content.Context;
import android.util.Log;
import com.google.android.gms.analytics.ecommerce.b;
import com.google.android.gms.analytics.ecommerce.c;
import com.google.android.gms.analytics.f;
import com.google.android.gms.analytics.i;
import com.google.android.gms.common.internal.D;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.harman.jbl.partybox.ui.effectlab.a;
import com.spotify.sdk.android.auth.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@D
@com.google.android.gms.common.util.D
/* loaded from: classes2.dex */
public final class zzfv extends zzfs {
    private static final String zza = com.google.android.gms.internal.gtm.zza.UNIVERSAL_ANALYTICS.toString();
    private static final String zzb = com.google.android.gms.internal.gtm.zzb.ACCOUNT.toString();
    private static final String zzc = com.google.android.gms.internal.gtm.zzb.ANALYTICS_PASS_THROUGH.toString();
    private static final String zzd = com.google.android.gms.internal.gtm.zzb.ENABLE_ECOMMERCE.toString();
    private static final String zze = com.google.android.gms.internal.gtm.zzb.ECOMMERCE_USE_DATA_LAYER.toString();
    private static final String zzf = com.google.android.gms.internal.gtm.zzb.ECOMMERCE_MACRO_DATA.toString();
    private static final String zzg = com.google.android.gms.internal.gtm.zzb.ANALYTICS_FIELDS.toString();
    private static final String zzh = com.google.android.gms.internal.gtm.zzb.TRACK_TRANSACTION.toString();
    private static final String zzi = com.google.android.gms.internal.gtm.zzb.TRANSACTION_DATALAYER_MAP.toString();
    private static final String zzj = com.google.android.gms.internal.gtm.zzb.TRANSACTION_ITEM_DATALAYER_MAP.toString();
    private static final List zzk = Arrays.asList(b.f27771b, b.f27775f, b.f27776g, "click", b.f27773d, b.f27774e, "purchase", "refund");
    private static final Pattern zzl = Pattern.compile("dimension(\\d+)");
    private static final Pattern zzm = Pattern.compile("metric(\\d+)");
    private static Map zzn;
    private static Map zzo;
    private final Set zzp;
    private final zzfr zzq;
    private final DataLayer zzr;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfv(Context context, DataLayer dataLayer) {
        super(zza, new String[0]);
        zzfr zzfrVar = new zzfr(context);
        this.zzr = dataLayer;
        this.zzq = zzfrVar;
        HashSet hashSet = new HashSet();
        this.zzp = hashSet;
        hashSet.add("");
        hashSet.add(a.f43472q);
        hashSet.add(L1.a.t3);
    }

    private final String zzd(String str) {
        Object obj = this.zzr.get(str);
        if (obj == null) {
            return null;
        }
        return obj.toString();
    }

    private final Map zzh(com.google.android.gms.internal.gtm.zzam zzamVar) {
        if (zzamVar == null) {
            return new HashMap();
        }
        Map zzm2 = zzm(zzamVar);
        if (zzm2 == null) {
            return new HashMap();
        }
        String str = (String) zzm2.get("&aip");
        if (str != null && this.zzp.contains(str.toLowerCase())) {
            zzm2.remove("&aip");
        }
        return zzm2;
    }

    private static final void zzi(Map map, String str, String str2) {
        if (str2 != null) {
            map.put(str, str2);
        }
    }

    private static final boolean zzj(Map map, String str) {
        com.google.android.gms.internal.gtm.zzam zzamVar = (com.google.android.gms.internal.gtm.zzam) map.get(str);
        if (zzamVar == null) {
            return false;
        }
        return zzfu.zzg(zzfu.zzl(zzamVar)).booleanValue();
    }

    private static final Double zzk(Object obj) {
        if (obj instanceof String) {
            try {
                return Double.valueOf((String) obj);
            } catch (NumberFormatException e4) {
                throw new RuntimeException("Cannot convert the object to Double: ".concat(String.valueOf(e4.getMessage())));
            }
        }
        if (obj instanceof Integer) {
            return Double.valueOf(((Integer) obj).doubleValue());
        }
        if (obj instanceof Double) {
            return (Double) obj;
        }
        throw new RuntimeException("Cannot convert the object to Double: ".concat(String.valueOf(obj.toString())));
    }

    private static final Integer zzl(Object obj) {
        if (obj instanceof String) {
            try {
                return Integer.valueOf((String) obj);
            } catch (NumberFormatException e4) {
                throw new RuntimeException("Cannot convert the object to Integer: ".concat(String.valueOf(e4.getMessage())));
            }
        }
        if (obj instanceof Double) {
            return Integer.valueOf(((Double) obj).intValue());
        }
        if (obj instanceof Integer) {
            return (Integer) obj;
        }
        throw new RuntimeException("Cannot convert the object to Integer: ".concat(String.valueOf(obj.toString())));
    }

    private static final Map zzm(com.google.android.gms.internal.gtm.zzam zzamVar) {
        Object zzl2 = zzfu.zzl(zzamVar);
        if (!(zzl2 instanceof Map)) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : ((Map) zzl2).entrySet()) {
            linkedHashMap.put(entry.getKey().toString(), entry.getValue().toString());
        }
        return linkedHashMap;
    }

    private static final com.google.android.gms.analytics.ecommerce.a zzn(Map map) {
        com.google.android.gms.analytics.ecommerce.a aVar = new com.google.android.gms.analytics.ecommerce.a();
        Object obj = map.get(b.c.f48986a);
        if (obj != null) {
            aVar.f(obj.toString());
        }
        Object obj2 = map.get(a.C0015a.f1688b);
        if (obj2 != null) {
            aVar.g(obj2.toString());
        }
        Object obj3 = map.get("brand");
        if (obj3 != null) {
            aVar.a(obj3.toString());
        }
        Object obj4 = map.get("category");
        if (obj4 != null) {
            aVar.b(obj4.toString());
        }
        Object obj5 = map.get("variant");
        if (obj5 != null) {
            aVar.k(obj5.toString());
        }
        Object obj6 = map.get(FirebaseAnalytics.b.f34798j);
        if (obj6 != null) {
            aVar.c(obj6.toString());
        }
        Object obj7 = map.get("position");
        if (obj7 != null) {
            aVar.h(zzl(obj7).intValue());
        }
        Object obj8 = map.get(FirebaseAnalytics.b.f34755B);
        if (obj8 != null) {
            aVar.i(zzk(obj8).doubleValue());
        }
        Object obj9 = map.get(FirebaseAnalytics.b.f34756C);
        if (obj9 != null) {
            aVar.j(zzl(obj9).intValue());
        }
        for (String str : map.keySet()) {
            Matcher matcher = zzl.matcher(str);
            if (matcher.matches()) {
                try {
                    aVar.d(Integer.parseInt(matcher.group(1)), String.valueOf(map.get(str)));
                } catch (NumberFormatException unused) {
                    Log.w("GoogleTagManager", "illegal number in custom dimension value: ".concat(String.valueOf(str)));
                }
            } else {
                Matcher matcher2 = zzm.matcher(str);
                if (matcher2.matches()) {
                    try {
                        aVar.e(Integer.parseInt(matcher2.group(1)), zzl(map.get(str)).intValue());
                    } catch (NumberFormatException unused2) {
                        Log.w("GoogleTagManager", "illegal number in custom metric value: ".concat(String.valueOf(str)));
                    }
                }
            }
        }
        return aVar;
    }

    @Override // com.google.android.gms.tagmanager.zzfs, com.google.android.gms.tagmanager.zzbt
    public final /* bridge */ /* synthetic */ boolean zzb() {
        return false;
    }

    @Override // com.google.android.gms.tagmanager.zzfs
    public final void zzc(Map map) {
        Map map2;
        Map map3;
        Map map4;
        com.google.android.gms.analytics.ecommerce.b bVar;
        i zza2 = this.zzq.zza("_GTM_DEFAULT_TRACKER_");
        zza2.b(zzj(map, "collect_adid"));
        List<Map> list = null;
        if (zzj(map, zzd)) {
            f.C0260f c0260f = new f.C0260f();
            Map<String, String> zzh2 = zzh((com.google.android.gms.internal.gtm.zzam) map.get(zzg));
            c0260f.g(zzh2);
            if (zzj(map, zze)) {
                Object obj = this.zzr.get("ecommerce");
                if (obj instanceof Map) {
                    map4 = (Map) obj;
                }
                map4 = null;
            } else {
                Object zzl2 = zzfu.zzl((com.google.android.gms.internal.gtm.zzam) map.get(zzf));
                if (zzl2 instanceof Map) {
                    map4 = (Map) zzl2;
                }
                map4 = null;
            }
            if (map4 != null) {
                String str = zzh2.get("&cu");
                if (str == null) {
                    str = (String) map4.get("currencyCode");
                }
                if (str != null) {
                    c0260f.f("&cu", str);
                }
                Object obj2 = map4.get("impressions");
                if (obj2 instanceof List) {
                    for (Map map5 : (List) obj2) {
                        try {
                            c0260f.a(zzn(map5), (String) map5.get("list"));
                        } catch (RuntimeException e4) {
                            Log.e("GoogleTagManager", "Failed to extract a product from DataLayer. ".concat(String.valueOf(e4.getMessage())));
                        }
                    }
                }
                if (map4.containsKey("promoClick")) {
                    list = (List) ((Map) map4.get("promoClick")).get("promotions");
                } else if (map4.containsKey("promoView")) {
                    list = (List) ((Map) map4.get("promoView")).get("promotions");
                }
                if (list != null) {
                    for (Map map6 : list) {
                        try {
                            c cVar = new c();
                            String str2 = (String) map6.get(b.c.f48986a);
                            if (str2 != null) {
                                cVar.b(str2);
                            }
                            String str3 = (String) map6.get(a.C0015a.f1688b);
                            if (str3 != null) {
                                cVar.c(str3);
                            }
                            String str4 = (String) map6.get("creative");
                            if (str4 != null) {
                                cVar.a(str4);
                            }
                            String str5 = (String) map6.get("position");
                            if (str5 != null) {
                                cVar.d(str5);
                            }
                            c0260f.c(cVar);
                        } catch (RuntimeException e5) {
                            Log.e("GoogleTagManager", "Failed to extract a promotion from DataLayer. ".concat(String.valueOf(e5.getMessage())));
                        }
                    }
                    if (map4.containsKey("promoClick")) {
                        c0260f.f("&promoa", "click");
                    } else {
                        c0260f.f("&promoa", c.f27782c);
                    }
                }
                Iterator it = zzk.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    String str6 = (String) it.next();
                    if (map4.containsKey(str6)) {
                        Map map7 = (Map) map4.get(str6);
                        List list2 = (List) map7.get("products");
                        if (list2 != null) {
                            Iterator it2 = list2.iterator();
                            while (it2.hasNext()) {
                                try {
                                    c0260f.b(zzn((Map) it2.next()));
                                } catch (RuntimeException e6) {
                                    Log.e("GoogleTagManager", "Failed to extract a product from DataLayer. ".concat(String.valueOf(e6.getMessage())));
                                }
                            }
                        }
                        try {
                            if (map7.containsKey("actionField")) {
                                Map map8 = (Map) map7.get("actionField");
                                bVar = new com.google.android.gms.analytics.ecommerce.b(str6);
                                Object obj3 = map8.get(b.c.f48986a);
                                if (obj3 != null) {
                                    bVar.g(obj3.toString());
                                }
                                Object obj4 = map8.get(FirebaseAnalytics.b.f34776W);
                                if (obj4 != null) {
                                    bVar.e(obj4.toString());
                                }
                                Object obj5 = map8.get(FirebaseAnalytics.b.f34798j);
                                if (obj5 != null) {
                                    bVar.f(obj5.toString());
                                }
                                Object obj6 = map8.get("list");
                                if (obj6 != null) {
                                    bVar.c(obj6.toString());
                                }
                                Object obj7 = map8.get("option");
                                if (obj7 != null) {
                                    bVar.a(obj7.toString());
                                }
                                Object obj8 = map8.get("revenue");
                                if (obj8 != null) {
                                    bVar.h(zzk(obj8).doubleValue());
                                }
                                Object obj9 = map8.get(FirebaseAnalytics.b.f34762I);
                                if (obj9 != null) {
                                    bVar.j(zzk(obj9).doubleValue());
                                }
                                Object obj10 = map8.get(FirebaseAnalytics.b.f34758E);
                                if (obj10 != null) {
                                    bVar.i(zzk(obj10).doubleValue());
                                }
                                Object obj11 = map8.get("step");
                                if (obj11 != null) {
                                    bVar.b(zzl(obj11).intValue());
                                }
                            } else {
                                bVar = new com.google.android.gms.analytics.ecommerce.b(str6);
                            }
                            c0260f.n(bVar);
                        } catch (RuntimeException e7) {
                            Log.e("GoogleTagManager", "Failed to extract a product action from DataLayer. ".concat(String.valueOf(e7.getMessage())));
                        }
                    }
                }
            }
            zza2.h(c0260f.d());
            return;
        }
        if (zzj(map, zzc)) {
            zza2.h(zzh((com.google.android.gms.internal.gtm.zzam) map.get(zzg)));
            return;
        }
        if (zzj(map, zzh)) {
            String zzd2 = zzd("transactionId");
            if (zzd2 == null) {
                Log.e("GoogleTagManager", "Cannot find transactionId in data layer.");
                return;
            }
            ArrayList arrayList = new ArrayList();
            try {
                Map zzh3 = zzh((com.google.android.gms.internal.gtm.zzam) map.get(zzg));
                zzh3.put("&t", "transaction");
                com.google.android.gms.internal.gtm.zzam zzamVar = (com.google.android.gms.internal.gtm.zzam) map.get(zzi);
                if (zzamVar != null) {
                    map2 = zzm(zzamVar);
                } else {
                    if (zzn == null) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("transactionId", "&ti");
                        hashMap.put("transactionAffiliation", "&ta");
                        hashMap.put("transactionTax", "&tt");
                        hashMap.put("transactionShipping", "&ts");
                        hashMap.put("transactionTotal", "&tr");
                        hashMap.put("transactionCurrency", "&cu");
                        zzn = hashMap;
                    }
                    map2 = zzn;
                }
                for (Map.Entry entry : map2.entrySet()) {
                    zzi(zzh3, (String) entry.getValue(), zzd((String) entry.getKey()));
                }
                arrayList.add(zzh3);
                Object obj12 = this.zzr.get("transactionProducts");
                if (obj12 != null) {
                    if (obj12 instanceof List) {
                        Iterator it3 = ((List) obj12).iterator();
                        while (it3.hasNext()) {
                            if (!(it3.next() instanceof Map)) {
                                throw new IllegalArgumentException("Each element of transactionProducts should be of type Map.");
                            }
                        }
                        list = (List) obj12;
                    } else {
                        throw new IllegalArgumentException("transactionProducts should be of type List.");
                    }
                }
                if (list != null) {
                    for (Map map9 : list) {
                        if (map9.get(a.C0015a.f1688b) == null) {
                            Log.e("GoogleTagManager", "Unable to send transaction item hit due to missing 'name' field.");
                            return;
                        }
                        Map zzh4 = zzh((com.google.android.gms.internal.gtm.zzam) map.get(zzg));
                        zzh4.put("&t", "item");
                        zzh4.put("&ti", zzd2);
                        com.google.android.gms.internal.gtm.zzam zzamVar2 = (com.google.android.gms.internal.gtm.zzam) map.get(zzj);
                        if (zzamVar2 != null) {
                            map3 = zzm(zzamVar2);
                        } else {
                            if (zzo == null) {
                                HashMap hashMap2 = new HashMap();
                                hashMap2.put(a.C0015a.f1688b, "&in");
                                hashMap2.put("sku", "&ic");
                                hashMap2.put("category", "&iv");
                                hashMap2.put(FirebaseAnalytics.b.f34755B, "&ip");
                                hashMap2.put(FirebaseAnalytics.b.f34756C, "&iq");
                                hashMap2.put(FirebaseAnalytics.b.f34796i, "&cu");
                                zzo = hashMap2;
                            }
                            map3 = zzo;
                        }
                        for (Map.Entry entry2 : map3.entrySet()) {
                            zzi(zzh4, (String) entry2.getValue(), (String) map9.get(entry2.getKey()));
                        }
                        arrayList.add(zzh4);
                    }
                }
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    zza2.h((Map) it4.next());
                }
                return;
            } catch (IllegalArgumentException e8) {
                Log.e("GoogleTagManager", "Unable to send transaction", e8);
                return;
            }
        }
        Log.w("GoogleTagManager", "Ignoring unknown tag.");
    }
}
