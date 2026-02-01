package com.blankj.utilcode.util;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

/* loaded from: classes.dex */
public class z0 {

    /* renamed from: a, reason: collision with root package name */
    private static final String f25353a = System.getProperty("line.separator");

    private z0() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static String a(Throwable th) {
        List<String> list;
        ArrayList arrayList = new ArrayList();
        while (th != null && !arrayList.contains(th)) {
            arrayList.add(th);
            th = th.getCause();
        }
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList();
        int i4 = size - 1;
        List<String> b4 = b((Throwable) arrayList.get(i4));
        while (true) {
            int i5 = size - 1;
            if (i5 < 0) {
                break;
            }
            if (i5 != 0) {
                list = b((Throwable) arrayList.get(size - 2));
                c(b4, list);
            } else {
                list = b4;
            }
            if (i5 == i4) {
                arrayList2.add(((Throwable) arrayList.get(i5)).toString());
            } else {
                arrayList2.add(" Caused by: " + ((Throwable) arrayList.get(i5)).toString());
            }
            arrayList2.addAll(b4);
            b4 = list;
            size = i5;
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            sb.append(f25353a);
        }
        return sb.toString();
    }

    private static List<String> b(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter((Writer) stringWriter, true));
        StringTokenizer stringTokenizer = new StringTokenizer(stringWriter.toString(), f25353a);
        ArrayList arrayList = new ArrayList();
        boolean z3 = false;
        while (stringTokenizer.hasMoreTokens()) {
            String nextToken = stringTokenizer.nextToken();
            int indexOf = nextToken.indexOf("at");
            if (indexOf != -1 && nextToken.substring(0, indexOf).trim().isEmpty()) {
                arrayList.add(nextToken);
                z3 = true;
            } else if (z3) {
                break;
            }
        }
        return arrayList;
    }

    private static void c(List<String> list, List<String> list2) {
        int size = list.size() - 1;
        for (int size2 = list2.size() - 1; size >= 0 && size2 >= 0; size2--) {
            if (list.get(size).equals(list2.get(size2))) {
                list.remove(size);
            }
            size--;
        }
    }
}
