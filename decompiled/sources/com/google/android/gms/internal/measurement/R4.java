package com.google.android.gms.internal.measurement;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class R4 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(P4 p4, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        d(p4, sb, 0);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void b(StringBuilder sb, int i4, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                b(sb, i4, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                b(sb, i4, str, (Map.Entry) it2.next());
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
            sb.append(C1481q5.a(zzjd.p((String) obj)));
            sb.append(kotlin.text.F.f52746b);
            return;
        }
        if (obj instanceof zzjd) {
            sb.append(": \"");
            sb.append(C1481q5.a((zzjd) obj));
            sb.append(kotlin.text.F.f52746b);
            return;
        }
        if (obj instanceof AbstractC1440l4) {
            sb.append(" {");
            d((AbstractC1440l4) obj, sb, i4 + 2);
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
            b(sb, i7, "key", entry.getKey());
            b(sb, i7, "value", entry.getValue());
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

    private static final String c(String str) {
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

    private static void d(P4 p4, StringBuilder sb, int i4) {
        String str;
        boolean equals;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet();
        for (Method method : p4.getClass().getDeclaredMethods()) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (String str2 : treeSet) {
            if (str2.startsWith("get")) {
                str = str2.substring(3);
            } else {
                str = str2;
            }
            if (str.endsWith("List") && !str.endsWith("OrBuilderList") && !str.equals("List")) {
                String concat = String.valueOf(str.substring(0, 1).toLowerCase()).concat(String.valueOf(str.substring(1, str.length() - 4)));
                Method method2 = (Method) hashMap.get(str2);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    b(sb, i4, c(concat), AbstractC1440l4.r(method2, p4, new Object[0]));
                }
            }
            if (str.endsWith("Map") && !str.equals("Map")) {
                String concat2 = String.valueOf(str.substring(0, 1).toLowerCase()).concat(String.valueOf(str.substring(1, str.length() - 3)));
                Method method3 = (Method) hashMap.get(str2);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    b(sb, i4, c(concat2), AbstractC1440l4.r(method3, p4, new Object[0]));
                }
            }
            if (((Method) hashMap2.get("set".concat(str))) != null && (!str.endsWith("Bytes") || !hashMap.containsKey("get".concat(String.valueOf(str.substring(0, str.length() - 5)))))) {
                String concat3 = String.valueOf(str.substring(0, 1).toLowerCase()).concat(String.valueOf(str.substring(1)));
                Method method4 = (Method) hashMap.get("get".concat(str));
                Method method5 = (Method) hashMap.get("has".concat(str));
                if (method4 != null) {
                    Object r4 = AbstractC1440l4.r(method4, p4, new Object[0]);
                    if (method5 == null) {
                        if (r4 instanceof Boolean) {
                            if (((Boolean) r4).booleanValue()) {
                                b(sb, i4, c(concat3), r4);
                            }
                        } else if (r4 instanceof Integer) {
                            if (((Integer) r4).intValue() != 0) {
                                b(sb, i4, c(concat3), r4);
                            }
                        } else if (r4 instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) r4).floatValue()) != 0) {
                                b(sb, i4, c(concat3), r4);
                            }
                        } else if (r4 instanceof Double) {
                            if (Double.doubleToRawLongBits(((Double) r4).doubleValue()) != 0) {
                                b(sb, i4, c(concat3), r4);
                            }
                        } else {
                            if (r4 instanceof String) {
                                equals = r4.equals("");
                            } else if (r4 instanceof zzjd) {
                                equals = r4.equals(zzjd.f29849F);
                            } else if (r4 instanceof P4) {
                                if (r4 != ((P4) r4).b()) {
                                    b(sb, i4, c(concat3), r4);
                                }
                            } else {
                                if ((r4 instanceof Enum) && ((Enum) r4).ordinal() == 0) {
                                }
                                b(sb, i4, c(concat3), r4);
                            }
                            if (!equals) {
                                b(sb, i4, c(concat3), r4);
                            }
                        }
                    } else if (((Boolean) AbstractC1440l4.r(method5, p4, new Object[0])).booleanValue()) {
                        b(sb, i4, c(concat3), r4);
                    }
                }
            }
        }
        if (!(p4 instanceof AbstractC1416i4)) {
            C1496s5 c1496s5 = ((AbstractC1440l4) p4).zzc;
            if (c1496s5 != null) {
                c1496s5.g(sb, i4);
                return;
            }
            return;
        }
        throw null;
    }
}
