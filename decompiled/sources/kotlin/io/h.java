package kotlin.io;

import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.H0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.AbstractC2087b;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.U;

/* loaded from: classes2.dex */
public final class h implements kotlin.sequences.m<File> {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private final File f52144a;

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    private final FileWalkDirection f52145b;

    /* renamed from: c, reason: collision with root package name */
    @l3.e
    private final X2.l<File, Boolean> f52146c;

    /* renamed from: d, reason: collision with root package name */
    @l3.e
    private final X2.l<File, H0> f52147d;

    /* renamed from: e, reason: collision with root package name */
    @l3.e
    private final X2.p<File, IOException, H0> f52148e;

    /* renamed from: f, reason: collision with root package name */
    private final int f52149f;

    /* JADX INFO: Access modifiers changed from: private */
    @U({"SMAP\nFileTreeWalk.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileTreeWalk.kt\nkotlin/io/FileTreeWalk$DirectoryState\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,273:1\n1#2:274\n*E\n"})
    /* loaded from: classes2.dex */
    public static abstract class a extends c {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@l3.d File rootDir) {
            super(rootDir);
            F.p(rootDir, "rootDir");
        }
    }

    /* loaded from: classes2.dex */
    private final class b extends AbstractC2087b<File> {

        /* renamed from: G, reason: collision with root package name */
        @l3.d
        private final ArrayDeque<c> f52150G;

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes2.dex */
        public final class a extends a {

            /* renamed from: b, reason: collision with root package name */
            private boolean f52152b;

            /* renamed from: c, reason: collision with root package name */
            @l3.e
            private File[] f52153c;

            /* renamed from: d, reason: collision with root package name */
            private int f52154d;

            /* renamed from: e, reason: collision with root package name */
            private boolean f52155e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ b f52156f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(@l3.d b bVar, File rootDir) {
                super(rootDir);
                F.p(rootDir, "rootDir");
                this.f52156f = bVar;
            }

            @Override // kotlin.io.h.c
            @l3.e
            public File b() {
                if (!this.f52155e && this.f52153c == null) {
                    X2.l lVar = h.this.f52146c;
                    if (lVar != null && !((Boolean) lVar.C(a())).booleanValue()) {
                        return null;
                    }
                    File[] listFiles = a().listFiles();
                    this.f52153c = listFiles;
                    if (listFiles == null) {
                        X2.p pVar = h.this.f52148e;
                        if (pVar != null) {
                            pVar.c0(a(), new AccessDeniedException(a(), null, "Cannot list files in a directory", 2, null));
                        }
                        this.f52155e = true;
                    }
                }
                File[] fileArr = this.f52153c;
                if (fileArr != null) {
                    int i4 = this.f52154d;
                    F.m(fileArr);
                    if (i4 < fileArr.length) {
                        File[] fileArr2 = this.f52153c;
                        F.m(fileArr2);
                        int i5 = this.f52154d;
                        this.f52154d = i5 + 1;
                        return fileArr2[i5];
                    }
                }
                if (this.f52152b) {
                    X2.l lVar2 = h.this.f52147d;
                    if (lVar2 != null) {
                        lVar2.C(a());
                    }
                    return null;
                }
                this.f52152b = true;
                return a();
            }
        }

        @U({"SMAP\nFileTreeWalk.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileTreeWalk.kt\nkotlin/io/FileTreeWalk$FileTreeWalkIterator$SingleFileState\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,273:1\n1#2:274\n*E\n"})
        /* renamed from: kotlin.io.h$b$b, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        private final class C0466b extends c {

            /* renamed from: b, reason: collision with root package name */
            private boolean f52157b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ b f52158c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0466b(@l3.d b bVar, File rootFile) {
                super(rootFile);
                F.p(rootFile, "rootFile");
                this.f52158c = bVar;
            }

            @Override // kotlin.io.h.c
            @l3.e
            public File b() {
                if (this.f52157b) {
                    return null;
                }
                this.f52157b = true;
                return a();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes2.dex */
        public final class c extends a {

            /* renamed from: b, reason: collision with root package name */
            private boolean f52159b;

            /* renamed from: c, reason: collision with root package name */
            @l3.e
            private File[] f52160c;

            /* renamed from: d, reason: collision with root package name */
            private int f52161d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ b f52162e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(@l3.d b bVar, File rootDir) {
                super(rootDir);
                F.p(rootDir, "rootDir");
                this.f52162e = bVar;
            }

            /* JADX WARN: Code restructure failed: missing block: B:29:0x007f, code lost:
            
                if (r0.length == 0) goto L31;
             */
            @Override // kotlin.io.h.c
            @l3.e
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public java.io.File b() {
                /*
                    r10 = this;
                    boolean r0 = r10.f52159b
                    r1 = 0
                    if (r0 != 0) goto L28
                    kotlin.io.h$b r0 = r10.f52162e
                    kotlin.io.h r0 = kotlin.io.h.this
                    X2.l r0 = kotlin.io.h.e(r0)
                    if (r0 == 0) goto L20
                    java.io.File r2 = r10.a()
                    java.lang.Object r0 = r0.C(r2)
                    java.lang.Boolean r0 = (java.lang.Boolean) r0
                    boolean r0 = r0.booleanValue()
                    if (r0 != 0) goto L20
                    return r1
                L20:
                    r0 = 1
                    r10.f52159b = r0
                    java.io.File r0 = r10.a()
                    return r0
                L28:
                    java.io.File[] r0 = r10.f52160c
                    if (r0 == 0) goto L47
                    int r2 = r10.f52161d
                    kotlin.jvm.internal.F.m(r0)
                    int r0 = r0.length
                    if (r2 >= r0) goto L35
                    goto L47
                L35:
                    kotlin.io.h$b r0 = r10.f52162e
                    kotlin.io.h r0 = kotlin.io.h.this
                    X2.l r0 = kotlin.io.h.g(r0)
                    if (r0 == 0) goto L46
                    java.io.File r2 = r10.a()
                    r0.C(r2)
                L46:
                    return r1
                L47:
                    java.io.File[] r0 = r10.f52160c
                    if (r0 != 0) goto L93
                    java.io.File r0 = r10.a()
                    java.io.File[] r0 = r0.listFiles()
                    r10.f52160c = r0
                    if (r0 != 0) goto L77
                    kotlin.io.h$b r0 = r10.f52162e
                    kotlin.io.h r0 = kotlin.io.h.this
                    X2.p r0 = kotlin.io.h.f(r0)
                    if (r0 == 0) goto L77
                    java.io.File r2 = r10.a()
                    kotlin.io.AccessDeniedException r9 = new kotlin.io.AccessDeniedException
                    java.io.File r4 = r10.a()
                    r5 = 0
                    java.lang.String r6 = "Cannot list files in a directory"
                    r7 = 2
                    r8 = 0
                    r3 = r9
                    r3.<init>(r4, r5, r6, r7, r8)
                    r0.c0(r2, r9)
                L77:
                    java.io.File[] r0 = r10.f52160c
                    if (r0 == 0) goto L81
                    kotlin.jvm.internal.F.m(r0)
                    int r0 = r0.length
                    if (r0 != 0) goto L93
                L81:
                    kotlin.io.h$b r0 = r10.f52162e
                    kotlin.io.h r0 = kotlin.io.h.this
                    X2.l r0 = kotlin.io.h.g(r0)
                    if (r0 == 0) goto L92
                    java.io.File r2 = r10.a()
                    r0.C(r2)
                L92:
                    return r1
                L93:
                    java.io.File[] r0 = r10.f52160c
                    kotlin.jvm.internal.F.m(r0)
                    int r1 = r10.f52161d
                    int r2 = r1 + 1
                    r10.f52161d = r2
                    r0 = r0[r1]
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.io.h.b.c.b():java.io.File");
            }
        }

        /* loaded from: classes2.dex */
        public /* synthetic */ class d {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f52163a;

            static {
                int[] iArr = new int[FileWalkDirection.values().length];
                try {
                    iArr[FileWalkDirection.TOP_DOWN.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[FileWalkDirection.BOTTOM_UP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f52163a = iArr;
            }
        }

        public b() {
            ArrayDeque<c> arrayDeque = new ArrayDeque<>();
            this.f52150G = arrayDeque;
            if (h.this.f52144a.isDirectory()) {
                arrayDeque.push(h(h.this.f52144a));
            } else if (h.this.f52144a.isFile()) {
                arrayDeque.push(new C0466b(this, h.this.f52144a));
            } else {
                c();
            }
        }

        private final a h(File file) {
            int i4 = d.f52163a[h.this.f52145b.ordinal()];
            if (i4 != 1) {
                if (i4 == 2) {
                    return new a(this, file);
                }
                throw new NoWhenBranchMatchedException();
            }
            return new c(this, file);
        }

        private final File i() {
            File b4;
            while (true) {
                c peek = this.f52150G.peek();
                if (peek == null) {
                    return null;
                }
                b4 = peek.b();
                if (b4 == null) {
                    this.f52150G.pop();
                } else {
                    if (F.g(b4, peek.a()) || !b4.isDirectory() || this.f52150G.size() >= h.this.f52149f) {
                        break;
                    }
                    this.f52150G.push(h(b4));
                }
            }
            return b4;
        }

        @Override // kotlin.collections.AbstractC2087b
        protected void b() {
            File i4 = i();
            if (i4 != null) {
                d(i4);
            } else {
                c();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static abstract class c {

        /* renamed from: a, reason: collision with root package name */
        @l3.d
        private final File f52164a;

        public c(@l3.d File root) {
            F.p(root, "root");
            this.f52164a = root;
        }

        @l3.d
        public final File a() {
            return this.f52164a;
        }

        @l3.e
        public abstract File b();
    }

    /* synthetic */ h(File file, FileWalkDirection fileWalkDirection, X2.l lVar, X2.l lVar2, X2.p pVar, int i4, int i5, C2197u c2197u) {
        this(file, (i5 & 2) != 0 ? FileWalkDirection.TOP_DOWN : fileWalkDirection, lVar, lVar2, pVar, (i5 & 32) != 0 ? Integer.MAX_VALUE : i4);
    }

    @l3.d
    public final h i(int i4) {
        if (i4 > 0) {
            return new h(this.f52144a, this.f52145b, this.f52146c, this.f52147d, this.f52148e, i4);
        }
        throw new IllegalArgumentException("depth must be positive, but was " + i4 + '.');
    }

    @Override // kotlin.sequences.m
    @l3.d
    public Iterator<File> iterator() {
        return new b();
    }

    @l3.d
    public final h j(@l3.d X2.l<? super File, Boolean> function) {
        F.p(function, "function");
        return new h(this.f52144a, this.f52145b, function, this.f52147d, this.f52148e, this.f52149f);
    }

    @l3.d
    public final h k(@l3.d X2.p<? super File, ? super IOException, H0> function) {
        F.p(function, "function");
        return new h(this.f52144a, this.f52145b, this.f52146c, this.f52147d, function, this.f52149f);
    }

    @l3.d
    public final h l(@l3.d X2.l<? super File, H0> function) {
        F.p(function, "function");
        return new h(this.f52144a, this.f52145b, this.f52146c, function, this.f52148e, this.f52149f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private h(File file, FileWalkDirection fileWalkDirection, X2.l<? super File, Boolean> lVar, X2.l<? super File, H0> lVar2, X2.p<? super File, ? super IOException, H0> pVar, int i4) {
        this.f52144a = file;
        this.f52145b = fileWalkDirection;
        this.f52146c = lVar;
        this.f52147d = lVar2;
        this.f52148e = pVar;
        this.f52149f = i4;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(@l3.d File start, @l3.d FileWalkDirection direction) {
        this(start, direction, null, null, null, 0, 32, null);
        F.p(start, "start");
        F.p(direction, "direction");
    }

    public /* synthetic */ h(File file, FileWalkDirection fileWalkDirection, int i4, C2197u c2197u) {
        this(file, (i4 & 2) != 0 ? FileWalkDirection.TOP_DOWN : fileWalkDirection);
    }
}
