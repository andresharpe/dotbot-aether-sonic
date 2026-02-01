package kotlin.io;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C2109w;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.U;
import kotlin.text.A;

@U({"SMAP\nFilePathComponents.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FilePathComponents.kt\nkotlin/io/FilesKt__FilePathComponentsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,148:1\n1549#2:149\n1620#2,3:150\n*S KotlinDebug\n*F\n+ 1 FilePathComponents.kt\nkotlin/io/FilesKt__FilePathComponentsKt\n*L\n133#1:149\n133#1:150,3\n*E\n"})
/* loaded from: classes2.dex */
class j {
    @l3.d
    public static final File a(@l3.d File file) {
        F.p(file, "<this>");
        return new File(c(file));
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
    
        r0 = kotlin.text.A.o3(r8, r6, 2, false, 4, null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final int b(java.lang.String r8) {
        /*
            char r6 = java.io.File.separatorChar
            r2 = 0
            r3 = 0
            r4 = 4
            r5 = 0
            r0 = r8
            r1 = r6
            int r0 = kotlin.text.q.o3(r0, r1, r2, r3, r4, r5)
            r7 = 1
            if (r0 != 0) goto L3c
            int r0 = r8.length()
            if (r0 <= r7) goto L3b
            char r0 = r8.charAt(r7)
            if (r0 != r6) goto L3b
            r2 = 2
            r3 = 0
            r4 = 4
            r5 = 0
            r0 = r8
            r1 = r6
            int r0 = kotlin.text.q.o3(r0, r1, r2, r3, r4, r5)
            if (r0 < 0) goto L3b
            int r2 = r0 + 1
            r3 = 0
            r4 = 4
            r5 = 0
            r0 = r8
            r1 = r6
            int r0 = kotlin.text.q.o3(r0, r1, r2, r3, r4, r5)
            if (r0 < 0) goto L36
            int r0 = r0 + r7
            return r0
        L36:
            int r8 = r8.length()
            return r8
        L3b:
            return r7
        L3c:
            r1 = 58
            if (r0 <= 0) goto L4a
            int r2 = r0 + (-1)
            char r2 = r8.charAt(r2)
            if (r2 != r1) goto L4a
            int r0 = r0 + r7
            return r0
        L4a:
            r2 = -1
            r3 = 0
            if (r0 != r2) goto L5b
            r0 = 2
            r2 = 0
            boolean r0 = kotlin.text.q.Y2(r8, r1, r3, r0, r2)
            if (r0 == 0) goto L5b
            int r8 = r8.length()
            return r8
        L5b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.io.j.b(java.lang.String):int");
    }

    @l3.d
    public static final String c(@l3.d File file) {
        F.p(file, "<this>");
        String path = file.getPath();
        F.o(path, "getPath(...)");
        String path2 = file.getPath();
        F.o(path2, "getPath(...)");
        String substring = path.substring(0, b(path2));
        F.o(substring, "substring(...)");
        return substring;
    }

    public static final boolean d(@l3.d File file) {
        F.p(file, "<this>");
        String path = file.getPath();
        F.o(path, "getPath(...)");
        if (b(path) > 0) {
            return true;
        }
        return false;
    }

    @l3.d
    public static final File e(@l3.d File file, int i4, int i5) {
        F.p(file, "<this>");
        return f(file).j(i4, i5);
    }

    @l3.d
    public static final g f(@l3.d File file) {
        List Q4;
        int b02;
        List list;
        F.p(file, "<this>");
        String path = file.getPath();
        F.m(path);
        int b4 = b(path);
        String substring = path.substring(0, b4);
        F.o(substring, "substring(...)");
        String substring2 = path.substring(b4);
        F.o(substring2, "substring(...)");
        if (substring2.length() == 0) {
            list = CollectionsKt__CollectionsKt.H();
        } else {
            Q4 = A.Q4(substring2, new char[]{File.separatorChar}, false, 0, 6, null);
            b02 = C2109w.b0(Q4, 10);
            ArrayList arrayList = new ArrayList(b02);
            Iterator it = Q4.iterator();
            while (it.hasNext()) {
                arrayList.add(new File((String) it.next()));
            }
            list = arrayList;
        }
        return new g(new File(substring), list);
    }
}
