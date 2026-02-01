package kotlin.io.path;

import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystemException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.SecureDirectoryStream;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileAttributeView;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.C2210p;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.jvm.internal.U({"SMAP\nPathRecursiveFunctions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathRecursiveFunctions.kt\nkotlin/io/path/PathsKt__PathRecursiveFunctionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,430:1\n346#1,2:434\n354#1:436\n354#1:437\n348#1,4:438\n346#1,2:442\n354#1:444\n348#1,4:445\n354#1:449\n346#1,6:450\n346#1,2:456\n354#1:458\n348#1,4:459\n1#2:431\n1855#3,2:432\n*S KotlinDebug\n*F\n+ 1 PathRecursiveFunctions.kt\nkotlin/io/path/PathsKt__PathRecursiveFunctionsKt\n*L\n362#1:434,2\n371#1:436\n374#1:437\n362#1:438,4\n382#1:442,2\n383#1:444\n382#1:445,4\n394#1:449\n402#1:450,6\n420#1:456,2\n421#1:458\n420#1:459,4\n284#1:432,2\n*E\n"})
/* loaded from: classes2.dex */
public class B0 extends C2128b0 {

    /* loaded from: classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f52181a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f52182b;

        static {
            int[] iArr = new int[CopyActionResult.values().length];
            try {
                iArr[CopyActionResult.CONTINUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CopyActionResult.TERMINATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CopyActionResult.SKIP_SUBTREE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f52181a = iArr;
            int[] iArr2 = new int[OnErrorResult.values().length];
            try {
                iArr2[OnErrorResult.TERMINATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[OnErrorResult.SKIP_SUBTREE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            f52182b = iArr2;
        }
    }

    /* loaded from: classes2.dex */
    static final class b extends Lambda implements X2.q {

        /* renamed from: F, reason: collision with root package name */
        public static final b f52183F = new b();

        b() {
            super(3);
        }

        @l3.d
        public final Void c(@l3.d Path path, @l3.d Path path2, @l3.d Exception exception) {
            kotlin.jvm.internal.F.p(path, "<anonymous parameter 0>");
            kotlin.jvm.internal.F.p(path2, "<anonymous parameter 1>");
            kotlin.jvm.internal.F.p(exception, "exception");
            throw exception;
        }

        @Override // X2.q
        public /* bridge */ /* synthetic */ Object z(Object obj, Object obj2, Object obj3) {
            return c(C2137g.a(obj), C2137g.a(obj2), (Exception) obj3);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class c extends Lambda implements X2.q<InterfaceC2125a, Path, Path, CopyActionResult> {

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ boolean f52184F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(boolean z3) {
            super(3);
            this.f52184F = z3;
        }

        @l3.d
        public final CopyActionResult c(@l3.d InterfaceC2125a copyToRecursively, @l3.d Path src, @l3.d Path dst) {
            LinkOption linkOption;
            boolean isDirectory;
            boolean isDirectory2;
            StandardCopyOption standardCopyOption;
            Path copy;
            kotlin.jvm.internal.F.p(copyToRecursively, "$this$copyToRecursively");
            kotlin.jvm.internal.F.p(src, "src");
            kotlin.jvm.internal.F.p(dst, "dst");
            LinkOption[] a4 = C2172y.f52243a.a(this.f52184F);
            linkOption = LinkOption.NOFOLLOW_LINKS;
            isDirectory = Files.isDirectory(dst, (LinkOption[]) Arrays.copyOf(new LinkOption[]{linkOption}, 1));
            LinkOption[] linkOptionArr = (LinkOption[]) Arrays.copyOf(a4, a4.length);
            isDirectory2 = Files.isDirectory(src, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
            if (!isDirectory2 || !isDirectory) {
                if (isDirectory) {
                    B0.R(dst);
                }
                kotlin.jvm.internal.V v3 = new kotlin.jvm.internal.V(2);
                v3.b(a4);
                standardCopyOption = StandardCopyOption.REPLACE_EXISTING;
                v3.a(standardCopyOption);
                CopyOption[] copyOptionArr = (CopyOption[]) v3.d(new CopyOption[v3.c()]);
                copy = Files.copy(src, dst, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length));
                kotlin.jvm.internal.F.o(copy, "copy(...)");
            }
            return CopyActionResult.CONTINUE;
        }

        @Override // X2.q
        public /* bridge */ /* synthetic */ CopyActionResult z(InterfaceC2125a interfaceC2125a, Path path, Path path2) {
            return c(interfaceC2125a, C2137g.a(path), C2137g.a(path2));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class d extends Lambda implements X2.q {

        /* renamed from: F, reason: collision with root package name */
        public static final d f52185F = new d();

        d() {
            super(3);
        }

        @l3.d
        public final Void c(@l3.d Path path, @l3.d Path path2, @l3.d Exception exception) {
            kotlin.jvm.internal.F.p(path, "<anonymous parameter 0>");
            kotlin.jvm.internal.F.p(path2, "<anonymous parameter 1>");
            kotlin.jvm.internal.F.p(exception, "exception");
            throw exception;
        }

        @Override // X2.q
        public /* bridge */ /* synthetic */ Object z(Object obj, Object obj2, Object obj3) {
            return c(C2137g.a(obj), C2137g.a(obj2), (Exception) obj3);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class e extends Lambda implements X2.q<InterfaceC2125a, Path, Path, CopyActionResult> {

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ boolean f52186F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(boolean z3) {
            super(3);
            this.f52186F = z3;
        }

        @l3.d
        public final CopyActionResult c(@l3.d InterfaceC2125a interfaceC2125a, @l3.d Path src, @l3.d Path dst) {
            kotlin.jvm.internal.F.p(interfaceC2125a, "$this$null");
            kotlin.jvm.internal.F.p(src, "src");
            kotlin.jvm.internal.F.p(dst, "dst");
            return interfaceC2125a.a(src, dst, this.f52186F);
        }

        @Override // X2.q
        public /* bridge */ /* synthetic */ CopyActionResult z(InterfaceC2125a interfaceC2125a, Path path, Path path2) {
            return c(interfaceC2125a, C2137g.a(path), C2137g.a(path2));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class f extends Lambda implements X2.l<InterfaceC2162t, kotlin.H0> {

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ X2.q<InterfaceC2125a, Path, Path, CopyActionResult> f52187F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ Path f52188G;

        /* renamed from: H, reason: collision with root package name */
        final /* synthetic */ Path f52189H;

        /* renamed from: I, reason: collision with root package name */
        final /* synthetic */ X2.q<Path, Path, Exception, OnErrorResult> f52190I;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes2.dex */
        public /* synthetic */ class a extends FunctionReferenceImpl implements X2.p<Path, BasicFileAttributes, FileVisitResult> {

            /* renamed from: N, reason: collision with root package name */
            final /* synthetic */ X2.q<InterfaceC2125a, Path, Path, CopyActionResult> f52191N;

            /* renamed from: O, reason: collision with root package name */
            final /* synthetic */ Path f52192O;

            /* renamed from: P, reason: collision with root package name */
            final /* synthetic */ Path f52193P;

            /* renamed from: Q, reason: collision with root package name */
            final /* synthetic */ X2.q<Path, Path, Exception, OnErrorResult> f52194Q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(X2.q<? super InterfaceC2125a, ? super Path, ? super Path, ? extends CopyActionResult> qVar, Path path, Path path2, X2.q<? super Path, ? super Path, ? super Exception, ? extends OnErrorResult> qVar2) {
                super(2, F.a.class, "copy", "copyToRecursively$copy$PathsKt__PathRecursiveFunctionsKt(Lkotlin/jvm/functions/Function3;Ljava/nio/file/Path;Ljava/nio/file/Path;Lkotlin/jvm/functions/Function3;Ljava/nio/file/Path;Ljava/nio/file/attribute/BasicFileAttributes;)Ljava/nio/file/FileVisitResult;", 0);
                this.f52191N = qVar;
                this.f52192O = path;
                this.f52193P = path2;
                this.f52194Q = qVar2;
            }

            @l3.d
            public final FileVisitResult C0(@l3.d Path p02, @l3.d BasicFileAttributes p12) {
                kotlin.jvm.internal.F.p(p02, "p0");
                kotlin.jvm.internal.F.p(p12, "p1");
                return B0.M(this.f52191N, this.f52192O, this.f52193P, this.f52194Q, p02, p12);
            }

            @Override // X2.p
            public /* bridge */ /* synthetic */ FileVisitResult c0(Path path, BasicFileAttributes basicFileAttributes) {
                return C0(C2137g.a(path), D0.a(basicFileAttributes));
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes2.dex */
        public /* synthetic */ class b extends FunctionReferenceImpl implements X2.p<Path, BasicFileAttributes, FileVisitResult> {

            /* renamed from: N, reason: collision with root package name */
            final /* synthetic */ X2.q<InterfaceC2125a, Path, Path, CopyActionResult> f52195N;

            /* renamed from: O, reason: collision with root package name */
            final /* synthetic */ Path f52196O;

            /* renamed from: P, reason: collision with root package name */
            final /* synthetic */ Path f52197P;

            /* renamed from: Q, reason: collision with root package name */
            final /* synthetic */ X2.q<Path, Path, Exception, OnErrorResult> f52198Q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(X2.q<? super InterfaceC2125a, ? super Path, ? super Path, ? extends CopyActionResult> qVar, Path path, Path path2, X2.q<? super Path, ? super Path, ? super Exception, ? extends OnErrorResult> qVar2) {
                super(2, F.a.class, "copy", "copyToRecursively$copy$PathsKt__PathRecursiveFunctionsKt(Lkotlin/jvm/functions/Function3;Ljava/nio/file/Path;Ljava/nio/file/Path;Lkotlin/jvm/functions/Function3;Ljava/nio/file/Path;Ljava/nio/file/attribute/BasicFileAttributes;)Ljava/nio/file/FileVisitResult;", 0);
                this.f52195N = qVar;
                this.f52196O = path;
                this.f52197P = path2;
                this.f52198Q = qVar2;
            }

            @l3.d
            public final FileVisitResult C0(@l3.d Path p02, @l3.d BasicFileAttributes p12) {
                kotlin.jvm.internal.F.p(p02, "p0");
                kotlin.jvm.internal.F.p(p12, "p1");
                return B0.M(this.f52195N, this.f52196O, this.f52197P, this.f52198Q, p02, p12);
            }

            @Override // X2.p
            public /* bridge */ /* synthetic */ FileVisitResult c0(Path path, BasicFileAttributes basicFileAttributes) {
                return C0(C2137g.a(path), D0.a(basicFileAttributes));
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes2.dex */
        public /* synthetic */ class c extends FunctionReferenceImpl implements X2.p<Path, Exception, FileVisitResult> {

            /* renamed from: N, reason: collision with root package name */
            final /* synthetic */ X2.q<Path, Path, Exception, OnErrorResult> f52199N;

            /* renamed from: O, reason: collision with root package name */
            final /* synthetic */ Path f52200O;

            /* renamed from: P, reason: collision with root package name */
            final /* synthetic */ Path f52201P;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            c(X2.q<? super Path, ? super Path, ? super Exception, ? extends OnErrorResult> qVar, Path path, Path path2) {
                super(2, F.a.class, "error", "copyToRecursively$error$PathsKt__PathRecursiveFunctionsKt(Lkotlin/jvm/functions/Function3;Ljava/nio/file/Path;Ljava/nio/file/Path;Ljava/nio/file/Path;Ljava/lang/Exception;)Ljava/nio/file/FileVisitResult;", 0);
                this.f52199N = qVar;
                this.f52200O = path;
                this.f52201P = path2;
            }

            @l3.d
            public final FileVisitResult C0(@l3.d Path p02, @l3.d Exception p12) {
                kotlin.jvm.internal.F.p(p02, "p0");
                kotlin.jvm.internal.F.p(p12, "p1");
                return B0.Q(this.f52199N, this.f52200O, this.f52201P, p02, p12);
            }

            @Override // X2.p
            public /* bridge */ /* synthetic */ FileVisitResult c0(Path path, Exception exc) {
                return C0(C2137g.a(path), exc);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes2.dex */
        public static final class d extends Lambda implements X2.p<Path, IOException, FileVisitResult> {

            /* renamed from: F, reason: collision with root package name */
            final /* synthetic */ X2.q<Path, Path, Exception, OnErrorResult> f52202F;

            /* renamed from: G, reason: collision with root package name */
            final /* synthetic */ Path f52203G;

            /* renamed from: H, reason: collision with root package name */
            final /* synthetic */ Path f52204H;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            d(X2.q<? super Path, ? super Path, ? super Exception, ? extends OnErrorResult> qVar, Path path, Path path2) {
                super(2);
                this.f52202F = qVar;
                this.f52203G = path;
                this.f52204H = path2;
            }

            @l3.d
            public final FileVisitResult c(@l3.d Path directory, @l3.e IOException iOException) {
                FileVisitResult fileVisitResult;
                kotlin.jvm.internal.F.p(directory, "directory");
                if (iOException == null) {
                    fileVisitResult = FileVisitResult.CONTINUE;
                    return fileVisitResult;
                }
                return B0.Q(this.f52202F, this.f52203G, this.f52204H, directory, iOException);
            }

            @Override // X2.p
            public /* bridge */ /* synthetic */ FileVisitResult c0(Path path, IOException iOException) {
                return c(C2137g.a(path), iOException);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(X2.q<? super InterfaceC2125a, ? super Path, ? super Path, ? extends CopyActionResult> qVar, Path path, Path path2, X2.q<? super Path, ? super Path, ? super Exception, ? extends OnErrorResult> qVar2) {
            super(1);
            this.f52187F = qVar;
            this.f52188G = path;
            this.f52189H = path2;
            this.f52190I = qVar2;
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ kotlin.H0 C(InterfaceC2162t interfaceC2162t) {
            c(interfaceC2162t);
            return kotlin.H0.f51801a;
        }

        public final void c(@l3.d InterfaceC2162t visitFileTree) {
            kotlin.jvm.internal.F.p(visitFileTree, "$this$visitFileTree");
            visitFileTree.b(new a(this.f52187F, this.f52188G, this.f52189H, this.f52190I));
            visitFileTree.a(new b(this.f52187F, this.f52188G, this.f52189H, this.f52190I));
            visitFileTree.c(new c(this.f52190I, this.f52188G, this.f52189H));
            visitFileTree.d(new d(this.f52190I, this.f52188G, this.f52189H));
        }
    }

    private static final void J(r rVar, X2.a<kotlin.H0> aVar) {
        try {
            aVar.n();
        } catch (Exception e4) {
            rVar.a(e4);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0062, code lost:
    
        if (r2 == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0085, code lost:
    
        if (r0 == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00af, code lost:
    
        kotlin.io.path.C2157q.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00c0, code lost:
    
        throw kotlin.io.path.C2159r0.a(r6.toString(), r7.toString(), "Recursively copying a directory into its subdirectory is prohibited.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ac, code lost:
    
        if (r0 == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0043, code lost:
    
        if (r1 == false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0073  */
    @l3.d
    @kotlin.Y(version = "1.8")
    @kotlin.io.path.InterfaceC2160s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.nio.file.Path K(@l3.d java.nio.file.Path r6, @l3.d java.nio.file.Path r7, @l3.d X2.q<? super java.nio.file.Path, ? super java.nio.file.Path, ? super java.lang.Exception, ? extends kotlin.io.path.OnErrorResult> r8, boolean r9, @l3.d X2.q<? super kotlin.io.path.InterfaceC2125a, ? super java.nio.file.Path, ? super java.nio.file.Path, ? extends kotlin.io.path.CopyActionResult> r10) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.F.p(r6, r0)
            java.lang.String r0 = "target"
            kotlin.jvm.internal.F.p(r7, r0)
            java.lang.String r0 = "onError"
            kotlin.jvm.internal.F.p(r8, r0)
            java.lang.String r0 = "copyAction"
            kotlin.jvm.internal.F.p(r10, r0)
            kotlin.io.path.y r0 = kotlin.io.path.C2172y.f52243a
            java.nio.file.LinkOption[] r0 = r0.a(r9)
            int r1 = r0.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            java.nio.file.LinkOption[] r0 = (java.nio.file.LinkOption[]) r0
            int r1 = r0.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            java.nio.file.LinkOption[] r0 = (java.nio.file.LinkOption[]) r0
            boolean r0 = kotlin.io.path.J.a(r6, r0)
            if (r0 == 0) goto Lcf
            r0 = 0
            java.nio.file.LinkOption[] r1 = new java.nio.file.LinkOption[r0]
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r0)
            java.nio.file.LinkOption[] r1 = (java.nio.file.LinkOption[]) r1
            boolean r1 = kotlin.io.path.J.a(r6, r1)
            if (r1 == 0) goto Lc1
            if (r9 != 0) goto L45
            boolean r1 = kotlin.io.path.C2175z0.a(r6)
            if (r1 != 0) goto Lc1
        L45:
            java.nio.file.LinkOption[] r1 = new java.nio.file.LinkOption[r0]
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r0)
            java.nio.file.LinkOption[] r1 = (java.nio.file.LinkOption[]) r1
            boolean r1 = kotlin.io.path.J.a(r7, r1)
            if (r1 == 0) goto L5b
            boolean r1 = kotlin.io.path.C2175z0.a(r7)
            if (r1 != 0) goto L5b
            r1 = 1
            goto L5c
        L5b:
            r1 = r0
        L5c:
            if (r1 == 0) goto L64
            boolean r2 = kotlin.io.path.P.a(r6, r7)
            if (r2 != 0) goto Lc1
        L64:
            java.nio.file.FileSystem r2 = kotlin.io.path.B.a(r6)
            java.nio.file.FileSystem r3 = kotlin.io.path.B.a(r7)
            boolean r2 = kotlin.jvm.internal.F.g(r2, r3)
            if (r2 != 0) goto L73
            goto Lc1
        L73:
            if (r1 == 0) goto L88
            java.nio.file.LinkOption[] r1 = new java.nio.file.LinkOption[r0]
            java.nio.file.Path r1 = kotlin.io.path.C2173y0.a(r7, r1)
            java.nio.file.LinkOption[] r0 = new java.nio.file.LinkOption[r0]
            java.nio.file.Path r0 = kotlin.io.path.C2173y0.a(r6, r0)
            boolean r0 = kotlin.io.path.C2171x0.a(r1, r0)
            if (r0 != 0) goto Laf
            goto Lc1
        L88:
            java.nio.file.Path r1 = kotlin.io.path.C2149m.a(r7)
            if (r1 == 0) goto Lc1
            java.nio.file.LinkOption[] r2 = new java.nio.file.LinkOption[r0]
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r0)
            java.nio.file.LinkOption[] r2 = (java.nio.file.LinkOption[]) r2
            boolean r2 = kotlin.io.path.J.a(r1, r2)
            if (r2 == 0) goto Lc1
            java.nio.file.LinkOption[] r2 = new java.nio.file.LinkOption[r0]
            java.nio.file.Path r1 = kotlin.io.path.C2173y0.a(r1, r2)
            java.nio.file.LinkOption[] r0 = new java.nio.file.LinkOption[r0]
            java.nio.file.Path r0 = kotlin.io.path.C2173y0.a(r6, r0)
            boolean r0 = kotlin.io.path.C2171x0.a(r1, r0)
            if (r0 != 0) goto Laf
            goto Lc1
        Laf:
            kotlin.io.path.C2157q.a()
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = "Recursively copying a directory into its subdirectory is prohibited."
            java.nio.file.FileSystemException r6 = kotlin.io.path.C2159r0.a(r6, r7, r8)
            throw r6
        Lc1:
            r1 = 0
            kotlin.io.path.B0$f r3 = new kotlin.io.path.B0$f
            r3.<init>(r10, r6, r7, r8)
            r4 = 1
            r5 = 0
            r0 = r6
            r2 = r9
            kotlin.io.path.n1.C1(r0, r1, r2, r3, r4, r5)
            return r7
        Lcf:
            kotlin.io.path.C2161s0.a()
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = "The source file doesn't exist."
            java.nio.file.NoSuchFileException r6 = kotlin.io.path.C2158q0.a(r6, r7, r8)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.io.path.B0.K(java.nio.file.Path, java.nio.file.Path, X2.q, boolean, X2.q):java.nio.file.Path");
    }

    @l3.d
    @kotlin.Y(version = "1.8")
    @InterfaceC2160s
    public static final Path L(@l3.d Path path, @l3.d Path target, @l3.d X2.q<? super Path, ? super Path, ? super Exception, ? extends OnErrorResult> onError, boolean z3, boolean z4) {
        kotlin.jvm.internal.F.p(path, "<this>");
        kotlin.jvm.internal.F.p(target, "target");
        kotlin.jvm.internal.F.p(onError, "onError");
        if (z4) {
            return K(path, target, onError, z3, new c(z3));
        }
        return N(path, target, onError, z3, null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FileVisitResult M(X2.q<? super InterfaceC2125a, ? super Path, ? super Path, ? extends CopyActionResult> qVar, Path path, Path path2, X2.q<? super Path, ? super Path, ? super Exception, ? extends OnErrorResult> qVar2, Path path3, BasicFileAttributes basicFileAttributes) {
        try {
            return Y(qVar.z(C2133e.f52226a, path3, P(path, path2, path3)));
        } catch (Exception e4) {
            return Q(qVar2, path, path2, path3, e4);
        }
    }

    public static /* synthetic */ Path N(Path path, Path path2, X2.q qVar, boolean z3, X2.q qVar2, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            qVar = d.f52185F;
        }
        if ((i4 & 8) != 0) {
            qVar2 = new e(z3);
        }
        return K(path, path2, qVar, z3, qVar2);
    }

    public static /* synthetic */ Path O(Path path, Path path2, X2.q qVar, boolean z3, boolean z4, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            qVar = b.f52183F;
        }
        return L(path, path2, qVar, z3, z4);
    }

    private static final Path P(Path path, Path path2, Path path3) {
        Path resolve;
        resolve = path2.resolve(n1.q1(path3, path).toString());
        kotlin.jvm.internal.F.o(resolve, "resolve(...)");
        return resolve;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FileVisitResult Q(X2.q<? super Path, ? super Path, ? super Exception, ? extends OnErrorResult> qVar, Path path, Path path2, Path path3, Exception exc) {
        return Z(qVar.z(path3, P(path, path2, path3), exc));
    }

    @kotlin.Y(version = "1.8")
    @InterfaceC2160s
    public static final void R(@l3.d Path path) {
        kotlin.jvm.internal.F.p(path, "<this>");
        List<Exception> S3 = S(path);
        if (!S3.isEmpty()) {
            FileSystemException a4 = C2155p.a("Failed to delete one or more files. See suppressed exceptions for details.");
            Iterator<T> it = S3.iterator();
            while (it.hasNext()) {
                C2210p.a(a4, (Exception) it.next());
            }
            throw a4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
    
        if (r1 != false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final java.util.List<java.lang.Exception> S(java.nio.file.Path r8) {
        /*
            kotlin.io.path.r r0 = new kotlin.io.path.r
            r1 = 0
            r2 = 1
            r3 = 0
            r0.<init>(r1, r2, r3)
            java.nio.file.Path r4 = kotlin.io.path.C2149m.a(r8)
            if (r4 == 0) goto L45
            java.nio.file.DirectoryStream r5 = kotlin.io.path.C2152n0.a(r4)     // Catch: java.lang.Throwable -> L13
            goto L14
        L13:
            r5 = r3
        L14:
            if (r5 == 0) goto L45
            java.nio.file.DirectoryStream r6 = kotlin.io.path.C2163t0.a(r5)     // Catch: java.lang.Throwable -> L34
            boolean r7 = kotlin.io.path.C2165u0.a(r6)     // Catch: java.lang.Throwable -> L34
            if (r7 == 0) goto L36
            r0.g(r4)     // Catch: java.lang.Throwable -> L34
            java.nio.file.SecureDirectoryStream r2 = kotlin.io.path.C2167v0.a(r6)     // Catch: java.lang.Throwable -> L34
            java.nio.file.Path r4 = kotlin.io.path.C2147l.a(r8)     // Catch: java.lang.Throwable -> L34
            java.lang.String r6 = "getFileName(...)"
            kotlin.jvm.internal.F.o(r4, r6)     // Catch: java.lang.Throwable -> L34
            U(r2, r4, r0)     // Catch: java.lang.Throwable -> L34
            goto L37
        L34:
            r8 = move-exception
            goto L3f
        L36:
            r1 = r2
        L37:
            kotlin.H0 r2 = kotlin.H0.f51801a     // Catch: java.lang.Throwable -> L34
            kotlin.io.b.a(r5, r3)
            if (r1 == 0) goto L48
            goto L45
        L3f:
            throw r8     // Catch: java.lang.Throwable -> L40
        L40:
            r0 = move-exception
            kotlin.io.b.a(r5, r8)
            throw r0
        L45:
            W(r8, r0)
        L48:
            java.util.List r8 = r0.d()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.io.path.B0.S(java.nio.file.Path):java.util.List");
    }

    private static final void T(SecureDirectoryStream<Path> secureDirectoryStream, Path path, r rVar) {
        SecureDirectoryStream secureDirectoryStream2;
        Iterator it;
        Path fileName;
        LinkOption linkOption;
        try {
            try {
                linkOption = LinkOption.NOFOLLOW_LINKS;
                secureDirectoryStream2 = secureDirectoryStream.newDirectoryStream(path, linkOption);
            } catch (Exception e4) {
                rVar.a(e4);
                return;
            }
        } catch (NoSuchFileException unused) {
            secureDirectoryStream2 = null;
        }
        if (secureDirectoryStream2 != null) {
            try {
                SecureDirectoryStream a4 = C2167v0.a(secureDirectoryStream2);
                it = a4.iterator();
                while (it.hasNext()) {
                    fileName = C2137g.a(it.next()).getFileName();
                    kotlin.jvm.internal.F.o(fileName, "getFileName(...)");
                    U(a4, fileName, rVar);
                }
                kotlin.H0 h02 = kotlin.H0.f51801a;
                kotlin.io.b.a(secureDirectoryStream2, null);
            } finally {
            }
        }
    }

    private static final void U(SecureDirectoryStream<Path> secureDirectoryStream, Path path, r rVar) {
        LinkOption linkOption;
        rVar.b(path);
        try {
            linkOption = LinkOption.NOFOLLOW_LINKS;
        } catch (Exception e4) {
            rVar.a(e4);
        }
        if (!X(secureDirectoryStream, path, linkOption)) {
            secureDirectoryStream.deleteFile(path);
            kotlin.H0 h02 = kotlin.H0.f51801a;
        } else {
            int f4 = rVar.f();
            T(secureDirectoryStream, path, rVar);
            if (f4 == rVar.f()) {
                secureDirectoryStream.deleteDirectory(path);
                kotlin.H0 h03 = kotlin.H0.f51801a;
            }
            rVar.c(path);
        }
        rVar.c(path);
    }

    private static final void V(Path path, r rVar) {
        DirectoryStream directoryStream;
        Iterator it;
        try {
            try {
                directoryStream = Files.newDirectoryStream(path);
            } catch (Exception e4) {
                rVar.a(e4);
                return;
            }
        } catch (NoSuchFileException unused) {
            directoryStream = null;
        }
        if (directoryStream != null) {
            try {
                it = C2163t0.a(directoryStream).iterator();
                while (it.hasNext()) {
                    Path a4 = C2137g.a(it.next());
                    kotlin.jvm.internal.F.m(a4);
                    W(a4, rVar);
                }
                kotlin.H0 h02 = kotlin.H0.f51801a;
                kotlin.io.b.a(directoryStream, null);
            } finally {
            }
        }
    }

    private static final void W(Path path, r rVar) {
        LinkOption linkOption;
        boolean isDirectory;
        try {
            linkOption = LinkOption.NOFOLLOW_LINKS;
            isDirectory = Files.isDirectory(path, (LinkOption[]) Arrays.copyOf(new LinkOption[]{linkOption}, 1));
            if (!isDirectory) {
                Files.deleteIfExists(path);
            } else {
                int f4 = rVar.f();
                V(path, rVar);
                if (f4 == rVar.f()) {
                    Files.deleteIfExists(path);
                }
            }
        } catch (Exception e4) {
            rVar.a(e4);
        }
    }

    private static final boolean X(SecureDirectoryStream<Path> secureDirectoryStream, Path path, LinkOption... linkOptionArr) {
        Boolean bool;
        FileAttributeView fileAttributeView;
        BasicFileAttributes readAttributes;
        boolean isDirectory;
        try {
            fileAttributeView = secureDirectoryStream.getFileAttributeView(path, C2140h0.a(), (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
            readAttributes = C2144j0.a(fileAttributeView).readAttributes();
            isDirectory = readAttributes.isDirectory();
            bool = Boolean.valueOf(isDirectory);
        } catch (NoSuchFileException unused) {
            bool = null;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @InterfaceC2160s
    private static final FileVisitResult Y(CopyActionResult copyActionResult) {
        FileVisitResult fileVisitResult;
        FileVisitResult fileVisitResult2;
        FileVisitResult fileVisitResult3;
        int i4 = a.f52181a[copyActionResult.ordinal()];
        if (i4 == 1) {
            fileVisitResult = FileVisitResult.CONTINUE;
            return fileVisitResult;
        }
        if (i4 == 2) {
            fileVisitResult2 = FileVisitResult.TERMINATE;
            return fileVisitResult2;
        }
        if (i4 == 3) {
            fileVisitResult3 = FileVisitResult.SKIP_SUBTREE;
            return fileVisitResult3;
        }
        throw new NoWhenBranchMatchedException();
    }

    @InterfaceC2160s
    private static final FileVisitResult Z(OnErrorResult onErrorResult) {
        FileVisitResult fileVisitResult;
        FileVisitResult fileVisitResult2;
        int i4 = a.f52182b[onErrorResult.ordinal()];
        if (i4 == 1) {
            fileVisitResult = FileVisitResult.TERMINATE;
            return fileVisitResult;
        }
        if (i4 == 2) {
            fileVisitResult2 = FileVisitResult.SKIP_SUBTREE;
            return fileVisitResult2;
        }
        throw new NoWhenBranchMatchedException();
    }

    private static final <R> R a0(X2.a<? extends R> aVar) {
        try {
            return aVar.n();
        } catch (NoSuchFileException unused) {
            return null;
        }
    }
}
