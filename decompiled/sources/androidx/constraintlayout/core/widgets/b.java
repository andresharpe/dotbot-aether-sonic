package androidx.constraintlayout.core.widgets;

import java.util.ArrayList;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static final boolean f8136a = false;

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f8137b = false;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0031, code lost:
    
        if (r7 == 2) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x0035, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x004b, code lost:
    
        if (r7 == 2) goto L16;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0261 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x04df A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x04eb  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0507  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0517  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x051b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:169:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0503  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02bf A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x03a9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x03b2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:254:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01b4  */
    /* JADX WARN: Type inference failed for: r1v40, types: [androidx.constraintlayout.core.widgets.ConstraintWidget] */
    /* JADX WARN: Type inference failed for: r8v37 */
    /* JADX WARN: Type inference failed for: r8v38 */
    /* JADX WARN: Type inference failed for: r8v43 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [androidx.constraintlayout.core.widgets.ConstraintWidget] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static void a(androidx.constraintlayout.core.widgets.d r37, androidx.constraintlayout.core.e r38, int r39, int r40, androidx.constraintlayout.core.widgets.c r41) {
        /*
            Method dump skipped, instructions count: 1340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.b.a(androidx.constraintlayout.core.widgets.d, androidx.constraintlayout.core.e, int, int, androidx.constraintlayout.core.widgets.c):void");
    }

    public static void b(d dVar, androidx.constraintlayout.core.e eVar, ArrayList<ConstraintWidget> arrayList, int i4) {
        int i5;
        c[] cVarArr;
        int i6;
        if (i4 == 0) {
            i5 = dVar.f8176N1;
            cVarArr = dVar.f8179Q1;
            i6 = 0;
        } else {
            i5 = dVar.f8177O1;
            cVarArr = dVar.f8178P1;
            i6 = 2;
        }
        for (int i7 = 0; i7 < i5; i7++) {
            c cVar = cVarArr[i7];
            cVar.a();
            if (arrayList == null || arrayList.contains(cVar.f8138a)) {
                a(dVar, eVar, i4, i6, cVar);
            }
        }
    }
}
