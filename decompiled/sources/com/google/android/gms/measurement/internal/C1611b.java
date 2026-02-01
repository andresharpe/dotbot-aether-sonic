package com.google.android.gms.measurement.internal;

import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1611b extends AbstractC1759z4 {

    /* renamed from: d, reason: collision with root package name */
    private String f30541d;

    /* renamed from: e, reason: collision with root package name */
    private Set f30542e;

    /* renamed from: f, reason: collision with root package name */
    private Map f30543f;

    /* renamed from: g, reason: collision with root package name */
    private Long f30544g;

    /* renamed from: h, reason: collision with root package name */
    private Long f30545h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1611b(L4 l4) {
        super(l4);
    }

    private final d5 l(Integer num) {
        if (this.f30543f.containsKey(num)) {
            return (d5) this.f30543f.get(num);
        }
        d5 d5Var = new d5(this, this.f30541d, null);
        this.f30543f.put(num, d5Var);
        return d5Var;
    }

    private final boolean m(int i4, int i5) {
        d5 d5Var = (d5) this.f30543f.get(Integer.valueOf(i4));
        if (d5Var == null) {
            return false;
        }
        return d5.b(d5Var).get(i5);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1759z4
    protected final boolean j() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't wrap try/catch for region: R(25:1|(2:2|(2:4|(2:6|7)(1:549))(2:550|551))|8|(3:10|11|12)|16|(6:19|20|21|22|23|(19:(7:25|26|27|28|(1:30)(3:524|(1:526)(1:528)|527)|31|(1:34)(1:33))|35|36|37|38|39|40|(2:42|43)(3:489|(6:490|491|492|493|494|(1:497)(1:496))|498)|44|(1:46)(6:295|(12:297|298|299|300|301|(6:473|310|311|(3:406|(6:409|(2:468|469)(2:413|(4:419|420|(7:422|(4:425|(2:427|428)(1:430)|429|423)|431|432|(4:435|(3:437|438|439)(1:441)|440|433)|442|443)(6:447|(4:450|(2:452|453)(1:455)|454|448)|456|457|(4:460|(2:462|463)(1:465)|464|458)|466)|444)(4:415|416|417|418))|445|446|418|407)|471)|313|314)|(4:303|(1:305)|306|307)|310|311|(0)|313|314)(1:488)|315|(10:318|(3:322|(4:325|(5:327|328|(1:330)(1:334)|331|332)(1:335)|333|323)|336)|337|(3:341|(4:344|(3:349|350|351)|352|342)|355)|356|(3:358|(6:361|(2:363|(3:365|366|367))(1:370)|368|369|367|359)|371)|372|(3:381|(8:384|(1:386)|387|(1:389)|390|(3:392|393|394)(1:396)|395|382)|397)|398|316)|404|405)|47|(3:180|(4:183|(10:185|186|(1:188)(1:292)|189|(13:191|192|193|194|195|196|197|198|199|200|201|(3:203|(11:204|205|206|207|208|209|210|(3:212|213|214)(1:263)|215|216|(1:219)(1:218))|220)(3:270|271|272)|221)(1:291)|222|(4:225|(3:243|244|245)(4:227|228|(2:229|(2:231|(1:233)(2:234|235))(1:242))|(3:237|238|239)(1:241))|240|223)|246|247|248)(1:293)|249|181)|294)|49|50|(3:52|(6:55|(14:57|58|59|60|61|62|63|64|65|66|(4:134|135|130|81)|(9:68|69|70|71|72|73|(1:75)|76|77)|80|81)(1:155)|82|(2:83|(2:85|(3:119|120|121)(8:87|(2:88|(4:90|(3:92|(1:94)(1:96)|95)|97|(1:1)(2:101|(1:103)(2:104|105)))(1:118))|112|(1:114)(1:116)|115|107|108|109))(0))|122|53)|156)|157|(9:160|161|162|163|164|165|(2:167|168)(1:170)|169|158)|178|179)(2:532|533))|548|36|37|38|39|40|(0)(0)|44|(0)(0)|47|(0)|49|50|(0)|157|(1:158)|178|179|(4:(0)|(0)|(0)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0a71, code lost:
    
        if (r8 != false) goto L496;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0954, code lost:
    
        if (r9 != null) goto L367;
     */
    /* JADX WARN: Code restructure failed: missing block: B:477:0x02eb, code lost:
    
        if (r5 == null) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:516:0x01c5, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:517:0x01c6, code lost:
    
        r20 = "audience_id";
     */
    /* JADX WARN: Code restructure failed: missing block: B:519:0x022a, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:520:0x022b, code lost:
    
        r20 = "audience_id";
     */
    /* JADX WARN: Code restructure failed: missing block: B:521:0x0231, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:522:0x0228, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:523:0x022e, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:537:0x0177, code lost:
    
        if (r5 == null) goto L45;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0a99  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0603  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x07da  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x07b6  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x07c0  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01b7 A[Catch: all -> 0x01c3, SQLiteException -> 0x01c5, TRY_LEAVE, TryCatch #19 {all -> 0x01c3, blocks: (B:40:0x01b1, B:42:0x01b7, B:489:0x01ca, B:490:0x01cf, B:492:0x01d9, B:493:0x01e9, B:494:0x0211, B:507:0x01f6, B:510:0x020a, B:501:0x0232), top: B:39:0x01b1 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:482:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:489:0x01ca A[Catch: all -> 0x01c3, SQLiteException -> 0x01c5, TRY_ENTER, TryCatch #19 {all -> 0x01c3, blocks: (B:40:0x01b1, B:42:0x01b7, B:489:0x01ca, B:490:0x01cf, B:492:0x01d9, B:493:0x01e9, B:494:0x0211, B:507:0x01f6, B:510:0x020a, B:501:0x0232), top: B:39:0x01b1 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x086d  */
    /* JADX WARN: Removed duplicated region for block: B:542:0x017c  */
    /* JADX WARN: Type inference failed for: r4v29, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v63, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v64 */
    /* JADX WARN: Type inference failed for: r5v65, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r5v68 */
    /* JADX WARN: Type inference failed for: r5v8, types: [android.database.Cursor] */
    @androidx.annotation.j0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List k(java.lang.String r64, java.util.List r65, java.util.List r66, java.lang.Long r67, java.lang.Long r68) {
        /*
            Method dump skipped, instructions count: 2866
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1611b.k(java.lang.String, java.util.List, java.util.List, java.lang.Long, java.lang.Long):java.util.List");
    }
}
