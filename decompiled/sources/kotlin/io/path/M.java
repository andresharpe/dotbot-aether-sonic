package kotlin.io.path;

import com.harman.jbl.partybox.ui.effectlab.a;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C2101p;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

@InterfaceC2160s
/* loaded from: classes2.dex */
public final class M implements kotlin.sequences.m<Path> {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private final Path f52208a;

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    private final PathWalkOption[] f52209b;

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "kotlin.io.path.PathTreeWalk$bfsIterator$1", f = "PathTreeWalk.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1}, l = {184, 190}, m = "invokeSuspend", n = {"$this$iterator", "queue", "entriesReader", "pathNode", "this_$iv", "path$iv", "$this$iterator", "queue", "entriesReader"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2"})
    @kotlin.jvm.internal.U({"SMAP\nPathTreeWalk.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathTreeWalk.kt\nkotlin/io/path/PathTreeWalk$bfsIterator$1\n+ 2 PathTreeWalk.kt\nkotlin/io/path/PathTreeWalk\n*L\n1#1,177:1\n45#2,15:178\n*S KotlinDebug\n*F\n+ 1 PathTreeWalk.kt\nkotlin/io/path/PathTreeWalk$bfsIterator$1\n*L\n98#1:178,15\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class a extends RestrictedSuspendLambda implements X2.p<kotlin.sequences.o<? super Path>, kotlin.coroutines.c<? super kotlin.H0>, Object> {

        /* renamed from: G, reason: collision with root package name */
        Object f52210G;

        /* renamed from: H, reason: collision with root package name */
        Object f52211H;

        /* renamed from: I, reason: collision with root package name */
        Object f52212I;

        /* renamed from: J, reason: collision with root package name */
        Object f52213J;

        /* renamed from: K, reason: collision with root package name */
        Object f52214K;

        /* renamed from: L, reason: collision with root package name */
        int f52215L;

        /* renamed from: M, reason: collision with root package name */
        private /* synthetic */ Object f52216M;

        a(kotlin.coroutines.c<? super a> cVar) {
            super(2, cVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:34:0x00f1  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0086  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x00ef -> B:6:0x007f). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00f1 -> B:6:0x007f). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object D(@l3.d java.lang.Object r13) {
            /*
                Method dump skipped, instructions count: 305
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.io.path.M.a.D(java.lang.Object):java.lang.Object");
        }

        @Override // X2.p
        @l3.e
        /* renamed from: J, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d kotlin.sequences.o<? super Path> oVar, @l3.e kotlin.coroutines.c<? super kotlin.H0> cVar) {
            return ((a) v(oVar, cVar)).D(kotlin.H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<kotlin.H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            a aVar = new a(cVar);
            aVar.f52216M = obj;
            return aVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "kotlin.io.path.PathTreeWalk$dfsIterator$1", f = "PathTreeWalk.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3}, l = {184, 190, 199, a.c.f43513f}, m = "invokeSuspend", n = {"$this$iterator", "stack", "entriesReader", "startNode", "this_$iv", "path$iv", "$this$iterator", "stack", "entriesReader", "$this$iterator", "stack", "entriesReader", "pathNode", "this_$iv", "path$iv", "$this$iterator", "stack", "entriesReader"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2"})
    @kotlin.jvm.internal.U({"SMAP\nPathTreeWalk.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathTreeWalk.kt\nkotlin/io/path/PathTreeWalk$dfsIterator$1\n+ 2 PathTreeWalk.kt\nkotlin/io/path/PathTreeWalk\n*L\n1#1,177:1\n45#2,15:178\n45#2,15:193\n*S KotlinDebug\n*F\n+ 1 PathTreeWalk.kt\nkotlin/io/path/PathTreeWalk$dfsIterator$1\n*L\n67#1:178,15\n78#1:193,15\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class b extends RestrictedSuspendLambda implements X2.p<kotlin.sequences.o<? super Path>, kotlin.coroutines.c<? super kotlin.H0>, Object> {

        /* renamed from: G, reason: collision with root package name */
        Object f52218G;

        /* renamed from: H, reason: collision with root package name */
        Object f52219H;

        /* renamed from: I, reason: collision with root package name */
        Object f52220I;

        /* renamed from: J, reason: collision with root package name */
        Object f52221J;

        /* renamed from: K, reason: collision with root package name */
        Object f52222K;

        /* renamed from: L, reason: collision with root package name */
        int f52223L;

        /* renamed from: M, reason: collision with root package name */
        private /* synthetic */ Object f52224M;

        b(kotlin.coroutines.c<? super b> cVar) {
            super(2, cVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x01c9  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x014b  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x0105  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x01c7 -> B:14:0x0144). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x01c9 -> B:14:0x0144). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object D(@l3.d java.lang.Object r15) {
            /*
                Method dump skipped, instructions count: 534
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.io.path.M.b.D(java.lang.Object):java.lang.Object");
        }

        @Override // X2.p
        @l3.e
        /* renamed from: J, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d kotlin.sequences.o<? super Path> oVar, @l3.e kotlin.coroutines.c<? super kotlin.H0> cVar) {
            return ((b) v(oVar, cVar)).D(kotlin.H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<kotlin.H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            b bVar = new b(cVar);
            bVar.f52224M = obj;
            return bVar;
        }
    }

    public M(@l3.d Path start, @l3.d PathWalkOption[] options) {
        kotlin.jvm.internal.F.p(start, "start");
        kotlin.jvm.internal.F.p(options, "options");
        this.f52208a = start;
        this.f52209b = options;
    }

    private final Iterator<Path> g() {
        Iterator<Path> a4;
        a4 = kotlin.sequences.q.a(new a(null));
        return a4;
    }

    private final Iterator<Path> h() {
        Iterator<Path> a4;
        a4 = kotlin.sequences.q.a(new b(null));
        return a4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean i() {
        boolean s8;
        s8 = C2101p.s8(this.f52209b, PathWalkOption.FOLLOW_LINKS);
        return s8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean j() {
        boolean s8;
        s8 = C2101p.s8(this.f52209b, PathWalkOption.INCLUDE_DIRECTORIES);
        return s8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LinkOption[] k() {
        return C2172y.f52243a.a(i());
    }

    private final boolean l() {
        boolean s8;
        s8 = C2101p.s8(this.f52209b, PathWalkOption.BREADTH_FIRST);
        return s8;
    }

    private final Object m(kotlin.sequences.o<? super Path> oVar, C2174z c2174z, C2143j c2143j, X2.l<? super List<C2174z>, kotlin.H0> lVar, kotlin.coroutines.c<? super kotlin.H0> cVar) {
        boolean isDirectory;
        LinkOption linkOption;
        boolean exists;
        boolean c4;
        boolean isDirectory2;
        Path d4 = c2174z.d();
        LinkOption[] k4 = k();
        LinkOption[] linkOptionArr = (LinkOption[]) Arrays.copyOf(k4, k4.length);
        isDirectory = Files.isDirectory(d4, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
        if (isDirectory) {
            c4 = Q.c(c2174z);
            if (!c4) {
                if (j()) {
                    kotlin.jvm.internal.C.e(0);
                    oVar.b(d4, cVar);
                    kotlin.jvm.internal.C.e(1);
                }
                LinkOption[] k5 = k();
                LinkOption[] linkOptionArr2 = (LinkOption[]) Arrays.copyOf(k5, k5.length);
                isDirectory2 = Files.isDirectory(d4, (LinkOption[]) Arrays.copyOf(linkOptionArr2, linkOptionArr2.length));
                if (isDirectory2) {
                    lVar.C(c2143j.c(c2174z));
                }
            } else {
                L.a();
                throw K.a(d4.toString());
            }
        } else {
            linkOption = LinkOption.NOFOLLOW_LINKS;
            exists = Files.exists(d4, (LinkOption[]) Arrays.copyOf(new LinkOption[]{linkOption}, 1));
            if (exists) {
                kotlin.jvm.internal.C.e(0);
                oVar.b(d4, cVar);
                kotlin.jvm.internal.C.e(1);
                return kotlin.H0.f51801a;
            }
        }
        return kotlin.H0.f51801a;
    }

    @Override // kotlin.sequences.m
    @l3.d
    public Iterator<Path> iterator() {
        if (l()) {
            return g();
        }
        return h();
    }
}
