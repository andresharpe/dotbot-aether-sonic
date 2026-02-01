package com.google.android.gms.internal.gtm;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import kotlin.text.F;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzbgu {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static String zza(zzbgs zzbgsVar, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        zzd(zzbgsVar, sb, 0);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void zzb(StringBuilder sb, int i4, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                zzb(sb, i4, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                zzb(sb, i4, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            sb.append(' ');
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            sb.append(zzbhu.zza(zzbbw.zzo((String) obj)));
            sb.append(F.f52746b);
            return;
        }
        if (obj instanceof zzbbw) {
            sb.append(": \"");
            sb.append(zzbhu.zza((zzbbw) obj));
            sb.append(F.f52746b);
            return;
        }
        if (obj instanceof zzbff) {
            sb.append(" {");
            zzd((zzbff) obj, sb, i4 + 2);
            sb.append("\n");
            while (i5 < i4) {
                sb.append(' ');
                i5++;
            }
            sb.append("}");
            return;
        }
        if (obj instanceof Map.Entry) {
            sb.append(" {");
            Map.Entry entry = (Map.Entry) obj;
            int i7 = i4 + 2;
            zzb(sb, i7, "key", entry.getKey());
            zzb(sb, i7, "value", entry.getValue());
            sb.append("\n");
            while (i5 < i4) {
                sb.append(' ');
                i5++;
            }
            sb.append("}");
            return;
        }
        sb.append(": ");
        sb.append(obj);
    }

    private static final String zzc(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i4 = 0; i4 < str.length(); i4++) {
            char charAt = str.charAt(i4);
            if (Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }

    private static void zzd(zzbgs zzbgsVar, StringBuilder sb, int i4) {
        boolean equals;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet();
        for (Method method : zzbgsVar.getClass().getDeclaredMethods()) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (String str : treeSet) {
            String substring = str.startsWith("get") ? str.substring(3) : str;
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List")) {
                String concat = String.valueOf(substring.substring(0, 1).toLowerCase()).concat(String.valueOf(substring.substring(1, substring.length() - 4)));
                Method method2 = (Method) hashMap.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    zzb(sb, i4, zzc(concat), zzbff.zzal(method2, zzbgsVar, new Object[0]));
                }
            }
            if (substring.endsWith("Map") && !substring.equals("Map")) {
                String concat2 = String.valueOf(substring.substring(0, 1).toLowerCase()).concat(String.valueOf(substring.substring(1, substring.length() - 3)));
                Method method3 = (Method) hashMap.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    zzb(sb, i4, zzc(concat2), zzbff.zzal(method3, zzbgsVar, new Object[0]));
                }
            }
            if (((Method) hashMap2.get("set".concat(substring))) != null && (!substring.endsWith("Bytes") || !hashMap.containsKey("get".concat(String.valueOf(substring.substring(0, substring.length() - 5)))))) {
                String concat3 = String.valueOf(substring.substring(0, 1).toLowerCase()).concat(String.valueOf(substring.substring(1)));
                Method method4 = (Method) hashMap.get("get".concat(substring));
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object zzal = zzbff.zzal(method4, zzbgsVar, new Object[0]);
                    if (method5 == null) {
                        if (zzal instanceof Boolean) {
                            if (((Boolean) zzal).booleanValue()) {
                                zzb(sb, i4, zzc(concat3), zzal);
                            }
                        } else if (zzal instanceof Integer) {
                            if (((Integer) zzal).intValue() != 0) {
                                zzb(sb, i4, zzc(concat3), zzal);
                            }
                        } else if (zzal instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) zzal).floatValue()) != 0) {
                                zzb(sb, i4, zzc(concat3), zzal);
                            }
                        } else if (!(zzal instanceof Double)) {
                            if (zzal instanceof String) {
                                equals = zzal.equals("");
                            } else if (zzal instanceof zzbbw) {
                                equals = zzal.equals(zzbbw.zzb);
                            } else if (zzal instanceof zzbgs) {
                                if (zzal != ((zzbgs) zzal).zzav()) {
                                    zzb(sb, i4, zzc(concat3), zzal);
                                }
                            } else {
                                if ((zzal instanceof Enum) && ((Enum) zzal).ordinal() == 0) {
                                }
                                zzb(sb, i4, zzc(concat3), zzal);
                            }
                            if (!equals) {
                                zzb(sb, i4, zzc(concat3), zzal);
                            }
                        } else if (Double.doubleToRawLongBits(((Double) zzal).doubleValue()) != 0) {
                            zzb(sb, i4, zzc(concat3), zzal);
                        }
                    } else if (((Boolean) zzbff.zzal(method5, zzbgsVar, new Object[0])).booleanValue()) {
                        zzb(sb, i4, zzc(concat3), zzal);
                    }
                }
            }
        }
        if (zzbgsVar instanceof zzbfb) {
            Iterator zzg = ((zzbfb) zzbgsVar).zzb.zzg();
            while (zzg.hasNext()) {
                Map.Entry entry = (Map.Entry) zzg.next();
                zzb(sb, i4, "[" + ((zzbfc) entry.getKey()).zzb + "]", entry.getValue());
            }
        }
        zzbia zzbiaVar = ((zzbff) zzbgsVar).zzd;
        if (zzbiaVar != null) {
            zzbiaVar.zzg(sb, i4);
        }
    }
}
