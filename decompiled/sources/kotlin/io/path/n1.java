package kotlin.io.path;

import java.io.IOException;
import java.net.URI;
import java.nio.file.CopyOption;
import java.nio.file.DirectoryStream;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.FileVisitOption;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.FileAttributeView;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.UserPrincipal;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.DeprecationLevel;
import kotlin.InterfaceC2205l;
import kotlin.KotlinNothingValueException;

@kotlin.jvm.internal.U({"SMAP\nPathUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathUtils.kt\nkotlin/io/path/PathsKt__PathUtilsKt\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1174:1\n26#2:1175\n26#2:1179\n1#3:1176\n1855#4,2:1177\n*S KotlinDebug\n*F\n+ 1 PathUtils.kt\nkotlin/io/path/PathsKt__PathUtilsKt\n*L\n221#1:1175\n616#1:1179\n440#1:1177,2\n*E\n"})
/* loaded from: classes2.dex */
class n1 extends B0 {
    @kotlin.K0(markerClass = {InterfaceC2160s.class})
    @kotlin.Y(version = "1.5")
    @kotlin.internal.f
    private static final boolean A0(Path path, LinkOption... options) {
        boolean exists;
        kotlin.jvm.internal.F.p(path, "<this>");
        kotlin.jvm.internal.F.p(options, "options");
        exists = Files.exists(path, (LinkOption[]) Arrays.copyOf(options, options.length));
        return exists;
    }

    @kotlin.Y(version = "1.7")
    @InterfaceC2160s
    public static final void A1(@l3.d Path path, int i4, boolean z3, @l3.d X2.l<? super InterfaceC2162t, kotlin.H0> builderAction) {
        kotlin.jvm.internal.F.p(path, "<this>");
        kotlin.jvm.internal.F.p(builderAction, "builderAction");
        B1(path, G0(builderAction), i4, z3);
    }

    @l3.d
    @kotlin.U
    public static final Void B0(@l3.d Path path, @l3.d Class<?> attributeViewClass) {
        kotlin.jvm.internal.F.p(path, "path");
        kotlin.jvm.internal.F.p(attributeViewClass, "attributeViewClass");
        throw new UnsupportedOperationException("The desired attribute view type " + attributeViewClass + " is not available for the file " + path + '.');
    }

    @kotlin.Y(version = "1.7")
    @InterfaceC2160s
    public static final void B1(@l3.d Path path, @l3.d FileVisitor<Path> visitor, int i4, boolean z3) {
        Set k4;
        FileVisitOption fileVisitOption;
        kotlin.jvm.internal.F.p(path, "<this>");
        kotlin.jvm.internal.F.p(visitor, "visitor");
        if (z3) {
            fileVisitOption = FileVisitOption.FOLLOW_LINKS;
            k4 = kotlin.collections.i0.f(fileVisitOption);
        } else {
            k4 = kotlin.collections.j0.k();
        }
        Files.walkFileTree(path, k4, i4, visitor);
    }

    @kotlin.K0(markerClass = {InterfaceC2160s.class})
    @kotlin.Y(version = "1.5")
    @kotlin.internal.f
    private static final /* synthetic */ <V extends FileAttributeView> V C0(Path path, LinkOption... options) {
        FileAttributeView fileAttributeView;
        kotlin.jvm.internal.F.p(path, "<this>");
        kotlin.jvm.internal.F.p(options, "options");
        kotlin.jvm.internal.F.y(4, androidx.exifinterface.media.a.Z4);
        fileAttributeView = Files.getFileAttributeView(path, m1.a(), (LinkOption[]) Arrays.copyOf(options, options.length));
        if (fileAttributeView != null) {
            return (V) G0.a(fileAttributeView);
        }
        kotlin.jvm.internal.F.y(4, androidx.exifinterface.media.a.Z4);
        B0(path, m1.a());
        throw new KotlinNothingValueException();
    }

    public static /* synthetic */ void C1(Path path, int i4, boolean z3, X2.l lVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i4 = Integer.MAX_VALUE;
        }
        if ((i5 & 2) != 0) {
            z3 = false;
        }
        A1(path, i4, z3, lVar);
    }

    @kotlin.K0(markerClass = {InterfaceC2160s.class})
    @kotlin.Y(version = "1.5")
    @kotlin.internal.f
    private static final /* synthetic */ <V extends FileAttributeView> V D0(Path path, LinkOption... options) {
        FileAttributeView fileAttributeView;
        kotlin.jvm.internal.F.p(path, "<this>");
        kotlin.jvm.internal.F.p(options, "options");
        kotlin.jvm.internal.F.y(4, androidx.exifinterface.media.a.Z4);
        fileAttributeView = Files.getFileAttributeView(path, m1.a(), (LinkOption[]) Arrays.copyOf(options, options.length));
        return (V) fileAttributeView;
    }

    public static /* synthetic */ void D1(Path path, FileVisitor fileVisitor, int i4, boolean z3, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i4 = Integer.MAX_VALUE;
        }
        if ((i5 & 4) != 0) {
            z3 = false;
        }
        B1(path, fileVisitor, i4, z3);
    }

    @kotlin.K0(markerClass = {InterfaceC2160s.class})
    @kotlin.Y(version = "1.5")
    @kotlin.internal.f
    private static final long E0(Path path) throws IOException {
        long size;
        kotlin.jvm.internal.F.p(path, "<this>");
        size = Files.size(path);
        return size;
    }

    @l3.d
    @kotlin.Y(version = "1.7")
    @InterfaceC2160s
    public static final kotlin.sequences.m<Path> E1(@l3.d Path path, @l3.d PathWalkOption... options) {
        kotlin.jvm.internal.F.p(path, "<this>");
        kotlin.jvm.internal.F.p(options, "options");
        return new M(path, options);
    }

    @kotlin.K0(markerClass = {InterfaceC2160s.class})
    @kotlin.Y(version = "1.5")
    @kotlin.internal.f
    private static final FileStore F0(Path path) throws IOException {
        FileStore fileStore;
        kotlin.jvm.internal.F.p(path, "<this>");
        fileStore = Files.getFileStore(path);
        kotlin.jvm.internal.F.o(fileStore, "getFileStore(...)");
        return fileStore;
    }

    @l3.d
    @kotlin.Y(version = "1.7")
    @InterfaceC2160s
    public static final FileVisitor<Path> G0(@l3.d X2.l<? super InterfaceC2162t, kotlin.H0> builderAction) {
        kotlin.jvm.internal.F.p(builderAction, "builderAction");
        C2164u c2164u = new C2164u();
        builderAction.C(c2164u);
        return c2164u.e();
    }

    @kotlin.K0(markerClass = {InterfaceC2160s.class})
    @kotlin.Y(version = "1.5")
    @kotlin.internal.f
    private static final void H0(Path path, String glob, X2.l<? super Path, kotlin.H0> action) throws IOException {
        DirectoryStream newDirectoryStream;
        kotlin.jvm.internal.F.p(path, "<this>");
        kotlin.jvm.internal.F.p(glob, "glob");
        kotlin.jvm.internal.F.p(action, "action");
        newDirectoryStream = Files.newDirectoryStream(path, glob);
        try {
            DirectoryStream a4 = C2163t0.a(newDirectoryStream);
            kotlin.jvm.internal.F.m(a4);
            Iterator it = a4.iterator();
            while (it.hasNext()) {
                action.C(it.next());
            }
            kotlin.H0 h02 = kotlin.H0.f51801a;
            kotlin.jvm.internal.C.d(1);
            if (kotlin.internal.m.a(1, 1, 0)) {
                kotlin.io.b.a(newDirectoryStream, null);
            } else if (newDirectoryStream != null) {
                newDirectoryStream.close();
            }
            kotlin.jvm.internal.C.c(1);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                kotlin.jvm.internal.C.d(1);
                if (!kotlin.internal.m.a(1, 1, 0)) {
                    if (newDirectoryStream != null) {
                        try {
                            newDirectoryStream.close();
                        } catch (Throwable unused) {
                        }
                    }
                } else {
                    kotlin.io.b.a(newDirectoryStream, th);
                }
                kotlin.jvm.internal.C.c(1);
                throw th2;
            }
        }
    }

    static /* synthetic */ void I0(Path path, String glob, X2.l action, int i4, Object obj) throws IOException {
        DirectoryStream newDirectoryStream;
        if ((i4 & 1) != 0) {
            glob = "*";
        }
        kotlin.jvm.internal.F.p(path, "<this>");
        kotlin.jvm.internal.F.p(glob, "glob");
        kotlin.jvm.internal.F.p(action, "action");
        newDirectoryStream = Files.newDirectoryStream(path, glob);
        try {
            DirectoryStream a4 = C2163t0.a(newDirectoryStream);
            kotlin.jvm.internal.F.m(a4);
            Iterator it = a4.iterator();
            while (it.hasNext()) {
                action.C(it.next());
            }
            kotlin.H0 h02 = kotlin.H0.f51801a;
            kotlin.jvm.internal.C.d(1);
            if (kotlin.internal.m.a(1, 1, 0)) {
                kotlin.io.b.a(newDirectoryStream, null);
            } else if (newDirectoryStream != null) {
                newDirectoryStream.close();
            }
            kotlin.jvm.internal.C.c(1);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                kotlin.jvm.internal.C.d(1);
                if (!kotlin.internal.m.a(1, 1, 0)) {
                    if (newDirectoryStream != null) {
                        try {
                            newDirectoryStream.close();
                        } catch (Throwable unused) {
                        }
                    }
                } else {
                    kotlin.io.b.a(newDirectoryStream, th);
                }
                kotlin.jvm.internal.C.c(1);
                throw th2;
            }
        }
    }

    @kotlin.K0(markerClass = {InterfaceC2160s.class})
    @kotlin.Y(version = "1.5")
    @kotlin.internal.f
    private static final Object J0(Path path, String attribute, LinkOption... options) throws IOException {
        Object attribute2;
        kotlin.jvm.internal.F.p(path, "<this>");
        kotlin.jvm.internal.F.p(attribute, "attribute");
        kotlin.jvm.internal.F.p(options, "options");
        attribute2 = Files.getAttribute(path, attribute, (LinkOption[]) Arrays.copyOf(options, options.length));
        return attribute2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        r2 = kotlin.text.A.o5(r2, '.', "");
     */
    @l3.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String K0(@l3.d java.nio.file.Path r2) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.F.p(r2, r0)
            java.nio.file.Path r2 = kotlin.io.path.C2147l.a(r2)
            java.lang.String r0 = ""
            if (r2 == 0) goto L1d
            java.lang.String r2 = r2.toString()
            if (r2 == 0) goto L1d
            r1 = 46
            java.lang.String r2 = kotlin.text.q.o5(r2, r1, r0)
            if (r2 != 0) goto L1c
            goto L1d
        L1c:
            r0 = r2
        L1d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.io.path.n1.K0(java.nio.file.Path):java.lang.String");
    }

    @kotlin.K0(markerClass = {InterfaceC2160s.class})
    @kotlin.Y(version = "1.5")
    public static /* synthetic */ void L0(Path path) {
    }

    private static final String M0(Path path) {
        kotlin.jvm.internal.F.p(path, "<this>");
        return O0(path);
    }

    @InterfaceC2205l(level = DeprecationLevel.ERROR, message = "Use invariantSeparatorsPathString property instead.", replaceWith = @kotlin.V(expression = "invariantSeparatorsPathString", imports = {}))
    @InterfaceC2160s
    @kotlin.Y(version = "1.4")
    @kotlin.internal.f
    public static /* synthetic */ void N0(Path path) {
    }

    @l3.d
    public static final String O0(@l3.d Path path) {
        FileSystem fileSystem;
        String separator;
        String i22;
        kotlin.jvm.internal.F.p(path, "<this>");
        fileSystem = path.getFileSystem();
        separator = fileSystem.getSeparator();
        if (!kotlin.jvm.internal.F.g(separator, "/")) {
            String obj = path.toString();
            kotlin.jvm.internal.F.m(separator);
            i22 = kotlin.text.z.i2(obj, separator, "/", false, 4, null);
            return i22;
        }
        return path.toString();
    }

    @kotlin.K0(markerClass = {InterfaceC2160s.class})
    @kotlin.Y(version = "1.5")
    public static /* synthetic */ void P0(Path path) {
    }

    @kotlin.K0(markerClass = {InterfaceC2160s.class})
    @kotlin.Y(version = "1.5")
    @kotlin.internal.f
    private static final FileTime Q0(Path path, LinkOption... options) throws IOException {
        FileTime lastModifiedTime;
        kotlin.jvm.internal.F.p(path, "<this>");
        kotlin.jvm.internal.F.p(options, "options");
        lastModifiedTime = Files.getLastModifiedTime(path, (LinkOption[]) Arrays.copyOf(options, options.length));
        kotlin.jvm.internal.F.o(lastModifiedTime, "getLastModifiedTime(...)");
        return lastModifiedTime;
    }

    @l3.d
    public static final String R0(@l3.d Path path) {
        Path fileName;
        String str;
        kotlin.jvm.internal.F.p(path, "<this>");
        fileName = path.getFileName();
        if (fileName != null) {
            str = fileName.toString();
        } else {
            str = null;
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    @kotlin.K0(markerClass = {InterfaceC2160s.class})
    @kotlin.Y(version = "1.5")
    public static /* synthetic */ void S0(Path path) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0011, code lost:
    
        r3 = kotlin.text.A.z5(r3, ".", null, 2, null);
     */
    @l3.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String T0(@l3.d java.nio.file.Path r3) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.F.p(r3, r0)
            java.nio.file.Path r3 = kotlin.io.path.C2147l.a(r3)
            if (r3 == 0) goto L1b
            java.lang.String r3 = r3.toString()
            if (r3 == 0) goto L1b
            java.lang.String r0 = "."
            r1 = 2
            r2 = 0
            java.lang.String r3 = kotlin.text.q.z5(r3, r0, r2, r1, r2)
            if (r3 != 0) goto L1d
        L1b:
            java.lang.String r3 = ""
        L1d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.io.path.n1.T0(java.nio.file.Path):java.lang.String");
    }

    @kotlin.K0(markerClass = {InterfaceC2160s.class})
    @kotlin.Y(version = "1.5")
    public static /* synthetic */ void U0(Path path) {
    }

    @kotlin.K0(markerClass = {InterfaceC2160s.class})
    @kotlin.Y(version = "1.5")
    @kotlin.internal.f
    private static final UserPrincipal V0(Path path, LinkOption... options) throws IOException {
        UserPrincipal owner;
        kotlin.jvm.internal.F.p(path, "<this>");
        kotlin.jvm.internal.F.p(options, "options");
        owner = Files.getOwner(path, (LinkOption[]) Arrays.copyOf(options, options.length));
        return owner;
    }

    private static final String W0(Path path) {
        kotlin.jvm.internal.F.p(path, "<this>");
        return path.toString();
    }

    @kotlin.K0(markerClass = {InterfaceC2160s.class})
    @kotlin.Y(version = "1.5")
    @kotlin.internal.f
    public static /* synthetic */ void X0(Path path) {
    }

    @kotlin.K0(markerClass = {InterfaceC2160s.class})
    @kotlin.Y(version = "1.5")
    @kotlin.internal.f
    private static final Set<PosixFilePermission> Y0(Path path, LinkOption... options) throws IOException {
        Set<PosixFilePermission> posixFilePermissions;
        kotlin.jvm.internal.F.p(path, "<this>");
        kotlin.jvm.internal.F.p(options, "options");
        posixFilePermissions = Files.getPosixFilePermissions(path, (LinkOption[]) Arrays.copyOf(options, options.length));
        kotlin.jvm.internal.F.o(posixFilePermissions, "getPosixFilePermissions(...)");
        return posixFilePermissions;
    }

    @kotlin.K0(markerClass = {InterfaceC2160s.class})
    @kotlin.Y(version = "1.5")
    @kotlin.internal.f
    private static final boolean Z0(Path path, LinkOption... options) {
        boolean isDirectory;
        kotlin.jvm.internal.F.p(path, "<this>");
        kotlin.jvm.internal.F.p(options, "options");
        isDirectory = Files.isDirectory(path, (LinkOption[]) Arrays.copyOf(options, options.length));
        return isDirectory;
    }

    @kotlin.K0(markerClass = {InterfaceC2160s.class})
    @kotlin.Y(version = "1.5")
    @kotlin.internal.f
    private static final boolean a1(Path path) {
        boolean isExecutable;
        kotlin.jvm.internal.F.p(path, "<this>");
        isExecutable = Files.isExecutable(path);
        return isExecutable;
    }

    @kotlin.K0(markerClass = {InterfaceC2160s.class})
    @kotlin.Y(version = "1.5")
    @kotlin.internal.f
    private static final Path b0(String path) {
        Path path2;
        kotlin.jvm.internal.F.p(path, "path");
        path2 = Paths.get(path, new String[0]);
        kotlin.jvm.internal.F.o(path2, "get(...)");
        return path2;
    }

    @kotlin.K0(markerClass = {InterfaceC2160s.class})
    @kotlin.Y(version = "1.5")
    @kotlin.internal.f
    private static final boolean b1(Path path) throws IOException {
        boolean isHidden;
        kotlin.jvm.internal.F.p(path, "<this>");
        isHidden = Files.isHidden(path);
        return isHidden;
    }

    @kotlin.K0(markerClass = {InterfaceC2160s.class})
    @kotlin.Y(version = "1.5")
    @kotlin.internal.f
    private static final Path c0(String base, String... subpaths) {
        Path path;
        kotlin.jvm.internal.F.p(base, "base");
        kotlin.jvm.internal.F.p(subpaths, "subpaths");
        path = Paths.get(base, (String[]) Arrays.copyOf(subpaths, subpaths.length));
        kotlin.jvm.internal.F.o(path, "get(...)");
        return path;
    }

    @kotlin.K0(markerClass = {InterfaceC2160s.class})
    @kotlin.Y(version = "1.5")
    @kotlin.internal.f
    private static final boolean c1(Path path) {
        boolean isReadable;
        kotlin.jvm.internal.F.p(path, "<this>");
        isReadable = Files.isReadable(path);
        return isReadable;
    }

    @kotlin.K0(markerClass = {InterfaceC2160s.class})
    @kotlin.Y(version = "1.5")
    @kotlin.internal.f
    private static final Path d0(Path path) {
        Path absolutePath;
        kotlin.jvm.internal.F.p(path, "<this>");
        absolutePath = path.toAbsolutePath();
        kotlin.jvm.internal.F.o(absolutePath, "toAbsolutePath(...)");
        return absolutePath;
    }

    @kotlin.K0(markerClass = {InterfaceC2160s.class})
    @kotlin.Y(version = "1.5")
    @kotlin.internal.f
    private static final boolean d1(Path path, LinkOption... options) {
        boolean isRegularFile;
        kotlin.jvm.internal.F.p(path, "<this>");
        kotlin.jvm.internal.F.p(options, "options");
        isRegularFile = Files.isRegularFile(path, (LinkOption[]) Arrays.copyOf(options, options.length));
        return isRegularFile;
    }

    @kotlin.K0(markerClass = {InterfaceC2160s.class})
    @kotlin.Y(version = "1.5")
    @kotlin.internal.f
    private static final String e0(Path path) {
        Path absolutePath;
        kotlin.jvm.internal.F.p(path, "<this>");
        absolutePath = path.toAbsolutePath();
        return absolutePath.toString();
    }

    @kotlin.K0(markerClass = {InterfaceC2160s.class})
    @kotlin.Y(version = "1.5")
    @kotlin.internal.f
    private static final boolean e1(Path path, Path other) throws IOException {
        boolean isSameFile;
        kotlin.jvm.internal.F.p(path, "<this>");
        kotlin.jvm.internal.F.p(other, "other");
        isSameFile = Files.isSameFile(path, other);
        return isSameFile;
    }

    @kotlin.K0(markerClass = {InterfaceC2160s.class})
    @kotlin.Y(version = "1.5")
    @kotlin.internal.f
    private static final Path f0(Path path, Path target, boolean z3) throws IOException {
        CopyOption[] copyOptionArr;
        Path copy;
        StandardCopyOption standardCopyOption;
        kotlin.jvm.internal.F.p(path, "<this>");
        kotlin.jvm.internal.F.p(target, "target");
        if (z3) {
            standardCopyOption = StandardCopyOption.REPLACE_EXISTING;
            copyOptionArr = new CopyOption[]{standardCopyOption};
        } else {
            copyOptionArr = new CopyOption[0];
        }
        copy = Files.copy(path, target, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length));
        kotlin.jvm.internal.F.o(copy, "copy(...)");
        return copy;
    }

    @kotlin.K0(markerClass = {InterfaceC2160s.class})
    @kotlin.Y(version = "1.5")
    @kotlin.internal.f
    private static final boolean f1(Path path) {
        boolean isSymbolicLink;
        kotlin.jvm.internal.F.p(path, "<this>");
        isSymbolicLink = Files.isSymbolicLink(path);
        return isSymbolicLink;
    }

    @kotlin.K0(markerClass = {InterfaceC2160s.class})
    @kotlin.Y(version = "1.5")
    @kotlin.internal.f
    private static final Path g0(Path path, Path target, CopyOption... options) throws IOException {
        Path copy;
        kotlin.jvm.internal.F.p(path, "<this>");
        kotlin.jvm.internal.F.p(target, "target");
        kotlin.jvm.internal.F.p(options, "options");
        copy = Files.copy(path, target, (CopyOption[]) Arrays.copyOf(options, options.length));
        kotlin.jvm.internal.F.o(copy, "copy(...)");
        return copy;
    }

    @kotlin.K0(markerClass = {InterfaceC2160s.class})
    @kotlin.Y(version = "1.5")
    @kotlin.internal.f
    private static final boolean g1(Path path) {
        boolean isWritable;
        kotlin.jvm.internal.F.p(path, "<this>");
        isWritable = Files.isWritable(path);
        return isWritable;
    }

    static /* synthetic */ Path h0(Path path, Path target, boolean z3, int i4, Object obj) throws IOException {
        CopyOption[] copyOptionArr;
        Path copy;
        StandardCopyOption standardCopyOption;
        if ((i4 & 2) != 0) {
            z3 = false;
        }
        kotlin.jvm.internal.F.p(path, "<this>");
        kotlin.jvm.internal.F.p(target, "target");
        if (z3) {
            standardCopyOption = StandardCopyOption.REPLACE_EXISTING;
            copyOptionArr = new CopyOption[]{standardCopyOption};
        } else {
            copyOptionArr = new CopyOption[0];
        }
        copy = Files.copy(path, target, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length));
        kotlin.jvm.internal.F.o(copy, "copy(...)");
        return copy;
    }

    @l3.d
    @kotlin.K0(markerClass = {InterfaceC2160s.class})
    @kotlin.Y(version = "1.5")
    public static final List<Path> h1(@l3.d Path path, @l3.d String glob) throws IOException {
        DirectoryStream newDirectoryStream;
        List<Path> V5;
        kotlin.jvm.internal.F.p(path, "<this>");
        kotlin.jvm.internal.F.p(glob, "glob");
        newDirectoryStream = Files.newDirectoryStream(path, glob);
        try {
            DirectoryStream a4 = C2163t0.a(newDirectoryStream);
            kotlin.jvm.internal.F.m(a4);
            V5 = kotlin.collections.D.V5(a4);
            kotlin.io.b.a(newDirectoryStream, null);
            return V5;
        } finally {
        }
    }

    @kotlin.K0(markerClass = {InterfaceC2160s.class})
    @kotlin.Y(version = "1.5")
    @kotlin.internal.f
    private static final Path i0(Path path, FileAttribute<?>... attributes) throws IOException {
        Path createDirectories;
        kotlin.jvm.internal.F.p(path, "<this>");
        kotlin.jvm.internal.F.p(attributes, "attributes");
        createDirectories = Files.createDirectories(path, (FileAttribute[]) Arrays.copyOf(attributes, attributes.length));
        kotlin.jvm.internal.F.o(createDirectories, "createDirectories(...)");
        return createDirectories;
    }

    public static /* synthetic */ List i1(Path path, String str, int i4, Object obj) throws IOException {
        if ((i4 & 1) != 0) {
            str = "*";
        }
        return h1(path, str);
    }

    @kotlin.K0(markerClass = {InterfaceC2160s.class})
    @kotlin.Y(version = "1.5")
    @kotlin.internal.f
    private static final Path j0(Path path, FileAttribute<?>... attributes) throws IOException {
        Path createDirectory;
        kotlin.jvm.internal.F.p(path, "<this>");
        kotlin.jvm.internal.F.p(attributes, "attributes");
        createDirectory = Files.createDirectory(path, (FileAttribute[]) Arrays.copyOf(attributes, attributes.length));
        kotlin.jvm.internal.F.o(createDirectory, "createDirectory(...)");
        return createDirectory;
    }

    @kotlin.K0(markerClass = {InterfaceC2160s.class})
    @kotlin.Y(version = "1.5")
    @kotlin.internal.f
    private static final Path j1(Path path, Path target, boolean z3) throws IOException {
        CopyOption[] copyOptionArr;
        Path move;
        StandardCopyOption standardCopyOption;
        kotlin.jvm.internal.F.p(path, "<this>");
        kotlin.jvm.internal.F.p(target, "target");
        if (z3) {
            standardCopyOption = StandardCopyOption.REPLACE_EXISTING;
            copyOptionArr = new CopyOption[]{standardCopyOption};
        } else {
            copyOptionArr = new CopyOption[0];
        }
        move = Files.move(path, target, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length));
        kotlin.jvm.internal.F.o(move, "move(...)");
        return move;
    }

    @kotlin.K0(markerClass = {InterfaceC2160s.class})
    @kotlin.Y(version = "1.5")
    @kotlin.internal.f
    private static final Path k0(Path path, FileAttribute<?>... attributes) throws IOException {
        Path createFile;
        kotlin.jvm.internal.F.p(path, "<this>");
        kotlin.jvm.internal.F.p(attributes, "attributes");
        createFile = Files.createFile(path, (FileAttribute[]) Arrays.copyOf(attributes, attributes.length));
        kotlin.jvm.internal.F.o(createFile, "createFile(...)");
        return createFile;
    }

    @kotlin.K0(markerClass = {InterfaceC2160s.class})
    @kotlin.Y(version = "1.5")
    @kotlin.internal.f
    private static final Path k1(Path path, Path target, CopyOption... options) throws IOException {
        Path move;
        kotlin.jvm.internal.F.p(path, "<this>");
        kotlin.jvm.internal.F.p(target, "target");
        kotlin.jvm.internal.F.p(options, "options");
        move = Files.move(path, target, (CopyOption[]) Arrays.copyOf(options, options.length));
        kotlin.jvm.internal.F.o(move, "move(...)");
        return move;
    }

    @kotlin.K0(markerClass = {InterfaceC2160s.class})
    @kotlin.Y(version = "1.5")
    @kotlin.internal.f
    private static final Path l0(Path path, Path target) throws IOException {
        Path createLink;
        kotlin.jvm.internal.F.p(path, "<this>");
        kotlin.jvm.internal.F.p(target, "target");
        createLink = Files.createLink(path, target);
        kotlin.jvm.internal.F.o(createLink, "createLink(...)");
        return createLink;
    }

    static /* synthetic */ Path l1(Path path, Path target, boolean z3, int i4, Object obj) throws IOException {
        CopyOption[] copyOptionArr;
        Path move;
        StandardCopyOption standardCopyOption;
        if ((i4 & 2) != 0) {
            z3 = false;
        }
        kotlin.jvm.internal.F.p(path, "<this>");
        kotlin.jvm.internal.F.p(target, "target");
        if (z3) {
            standardCopyOption = StandardCopyOption.REPLACE_EXISTING;
            copyOptionArr = new CopyOption[]{standardCopyOption};
        } else {
            copyOptionArr = new CopyOption[0];
        }
        move = Files.move(path, target, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length));
        kotlin.jvm.internal.F.o(move, "move(...)");
        return move;
    }

    @l3.d
    @kotlin.Y(version = "1.9")
    public static final Path m0(@l3.d Path path, @l3.d FileAttribute<?>... attributes) throws IOException {
        Path parent;
        boolean isDirectory;
        boolean isDirectory2;
        Path createDirectories;
        kotlin.jvm.internal.F.p(path, "<this>");
        kotlin.jvm.internal.F.p(attributes, "attributes");
        parent = path.getParent();
        if (parent != null) {
            isDirectory = Files.isDirectory(parent, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0));
            if (!isDirectory) {
                try {
                    FileAttribute[] fileAttributeArr = (FileAttribute[]) Arrays.copyOf(attributes, attributes.length);
                    createDirectories = Files.createDirectories(parent, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
                    kotlin.jvm.internal.F.o(createDirectories, "createDirectories(...)");
                } catch (FileAlreadyExistsException e4) {
                    isDirectory2 = Files.isDirectory(parent, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0));
                    if (!isDirectory2) {
                        throw e4;
                    }
                }
            }
        }
        return path;
    }

    @kotlin.K0(markerClass = {InterfaceC2160s.class})
    @kotlin.Y(version = "1.5")
    @kotlin.internal.f
    private static final boolean m1(Path path, LinkOption... options) {
        boolean notExists;
        kotlin.jvm.internal.F.p(path, "<this>");
        kotlin.jvm.internal.F.p(options, "options");
        notExists = Files.notExists(path, (LinkOption[]) Arrays.copyOf(options, options.length));
        return notExists;
    }

    @kotlin.K0(markerClass = {InterfaceC2160s.class})
    @kotlin.Y(version = "1.5")
    @kotlin.internal.f
    private static final Path n0(Path path, Path target, FileAttribute<?>... attributes) throws IOException {
        Path createSymbolicLink;
        kotlin.jvm.internal.F.p(path, "<this>");
        kotlin.jvm.internal.F.p(target, "target");
        kotlin.jvm.internal.F.p(attributes, "attributes");
        createSymbolicLink = Files.createSymbolicLink(path, target, (FileAttribute[]) Arrays.copyOf(attributes, attributes.length));
        kotlin.jvm.internal.F.o(createSymbolicLink, "createSymbolicLink(...)");
        return createSymbolicLink;
    }

    @kotlin.K0(markerClass = {InterfaceC2160s.class})
    @kotlin.Y(version = "1.5")
    @kotlin.internal.f
    private static final /* synthetic */ <A extends BasicFileAttributes> A n1(Path path, LinkOption... options) throws IOException {
        BasicFileAttributes readAttributes;
        kotlin.jvm.internal.F.p(path, "<this>");
        kotlin.jvm.internal.F.p(options, "options");
        kotlin.jvm.internal.F.y(4, androidx.exifinterface.media.a.Y4);
        readAttributes = Files.readAttributes(path, (Class<BasicFileAttributes>) N.a(), (LinkOption[]) Arrays.copyOf(options, options.length));
        kotlin.jvm.internal.F.o(readAttributes, "readAttributes(...)");
        return (A) D0.a(readAttributes);
    }

    @kotlin.K0(markerClass = {InterfaceC2160s.class})
    @kotlin.Y(version = "1.5")
    @kotlin.internal.f
    private static final Path o0(String str, FileAttribute<?>... attributes) throws IOException {
        Path createTempDirectory;
        kotlin.jvm.internal.F.p(attributes, "attributes");
        createTempDirectory = Files.createTempDirectory(str, (FileAttribute[]) Arrays.copyOf(attributes, attributes.length));
        kotlin.jvm.internal.F.o(createTempDirectory, "createTempDirectory(...)");
        return createTempDirectory;
    }

    @kotlin.K0(markerClass = {InterfaceC2160s.class})
    @kotlin.Y(version = "1.5")
    @kotlin.internal.f
    private static final Map<String, Object> o1(Path path, String attributes, LinkOption... options) throws IOException {
        Map<String, Object> readAttributes;
        kotlin.jvm.internal.F.p(path, "<this>");
        kotlin.jvm.internal.F.p(attributes, "attributes");
        kotlin.jvm.internal.F.p(options, "options");
        readAttributes = Files.readAttributes(path, attributes, (LinkOption[]) Arrays.copyOf(options, options.length));
        kotlin.jvm.internal.F.o(readAttributes, "readAttributes(...)");
        return readAttributes;
    }

    @l3.d
    @kotlin.K0(markerClass = {InterfaceC2160s.class})
    @kotlin.Y(version = "1.5")
    public static final Path p0(@l3.e Path path, @l3.e String str, @l3.d FileAttribute<?>... attributes) throws IOException {
        Path createTempDirectory;
        Path createTempDirectory2;
        kotlin.jvm.internal.F.p(attributes, "attributes");
        if (path != null) {
            createTempDirectory2 = Files.createTempDirectory(path, str, (FileAttribute[]) Arrays.copyOf(attributes, attributes.length));
            kotlin.jvm.internal.F.o(createTempDirectory2, "createTempDirectory(...)");
            return createTempDirectory2;
        }
        createTempDirectory = Files.createTempDirectory(str, (FileAttribute[]) Arrays.copyOf(attributes, attributes.length));
        kotlin.jvm.internal.F.o(createTempDirectory, "createTempDirectory(...)");
        return createTempDirectory;
    }

    @kotlin.K0(markerClass = {InterfaceC2160s.class})
    @kotlin.Y(version = "1.5")
    @kotlin.internal.f
    private static final Path p1(Path path) throws IOException {
        Path readSymbolicLink;
        kotlin.jvm.internal.F.p(path, "<this>");
        readSymbolicLink = Files.readSymbolicLink(path);
        kotlin.jvm.internal.F.o(readSymbolicLink, "readSymbolicLink(...)");
        return readSymbolicLink;
    }

    static /* synthetic */ Path q0(String str, FileAttribute[] attributes, int i4, Object obj) throws IOException {
        Path createTempDirectory;
        if ((i4 & 1) != 0) {
            str = null;
        }
        kotlin.jvm.internal.F.p(attributes, "attributes");
        createTempDirectory = Files.createTempDirectory(str, (FileAttribute[]) Arrays.copyOf(attributes, attributes.length));
        kotlin.jvm.internal.F.o(createTempDirectory, "createTempDirectory(...)");
        return createTempDirectory;
    }

    @l3.d
    @kotlin.K0(markerClass = {InterfaceC2160s.class})
    @kotlin.Y(version = "1.5")
    public static final Path q1(@l3.d Path path, @l3.d Path base) {
        kotlin.jvm.internal.F.p(path, "<this>");
        kotlin.jvm.internal.F.p(base, "base");
        try {
            return I.f52205a.a(path, base);
        } catch (IllegalArgumentException e4) {
            throw new IllegalArgumentException(e4.getMessage() + "\nthis path: " + path + "\nbase path: " + base, e4);
        }
    }

    public static /* synthetic */ Path r0(Path path, String str, FileAttribute[] fileAttributeArr, int i4, Object obj) throws IOException {
        if ((i4 & 2) != 0) {
            str = null;
        }
        return p0(path, str, fileAttributeArr);
    }

    @l3.e
    @kotlin.K0(markerClass = {InterfaceC2160s.class})
    @kotlin.Y(version = "1.5")
    public static final Path r1(@l3.d Path path, @l3.d Path base) {
        kotlin.jvm.internal.F.p(path, "<this>");
        kotlin.jvm.internal.F.p(base, "base");
        try {
            return I.f52205a.a(path, base);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @kotlin.K0(markerClass = {InterfaceC2160s.class})
    @kotlin.Y(version = "1.5")
    @kotlin.internal.f
    private static final Path s0(String str, String str2, FileAttribute<?>... attributes) throws IOException {
        Path createTempFile;
        kotlin.jvm.internal.F.p(attributes, "attributes");
        createTempFile = Files.createTempFile(str, str2, (FileAttribute[]) Arrays.copyOf(attributes, attributes.length));
        kotlin.jvm.internal.F.o(createTempFile, "createTempFile(...)");
        return createTempFile;
    }

    @l3.d
    @kotlin.K0(markerClass = {InterfaceC2160s.class})
    @kotlin.Y(version = "1.5")
    public static final Path s1(@l3.d Path path, @l3.d Path base) {
        kotlin.jvm.internal.F.p(path, "<this>");
        kotlin.jvm.internal.F.p(base, "base");
        Path r12 = r1(path, base);
        if (r12 != null) {
            return r12;
        }
        return path;
    }

    @l3.d
    @kotlin.K0(markerClass = {InterfaceC2160s.class})
    @kotlin.Y(version = "1.5")
    public static final Path t0(@l3.e Path path, @l3.e String str, @l3.e String str2, @l3.d FileAttribute<?>... attributes) throws IOException {
        Path createTempFile;
        Path createTempFile2;
        kotlin.jvm.internal.F.p(attributes, "attributes");
        if (path != null) {
            createTempFile2 = Files.createTempFile(path, str, str2, (FileAttribute[]) Arrays.copyOf(attributes, attributes.length));
            kotlin.jvm.internal.F.o(createTempFile2, "createTempFile(...)");
            return createTempFile2;
        }
        createTempFile = Files.createTempFile(str, str2, (FileAttribute[]) Arrays.copyOf(attributes, attributes.length));
        kotlin.jvm.internal.F.o(createTempFile, "createTempFile(...)");
        return createTempFile;
    }

    @kotlin.K0(markerClass = {InterfaceC2160s.class})
    @kotlin.Y(version = "1.5")
    @kotlin.internal.f
    private static final Path t1(Path path, String attribute, Object obj, LinkOption... options) throws IOException {
        Path attribute2;
        kotlin.jvm.internal.F.p(path, "<this>");
        kotlin.jvm.internal.F.p(attribute, "attribute");
        kotlin.jvm.internal.F.p(options, "options");
        attribute2 = Files.setAttribute(path, attribute, obj, (LinkOption[]) Arrays.copyOf(options, options.length));
        kotlin.jvm.internal.F.o(attribute2, "setAttribute(...)");
        return attribute2;
    }

    static /* synthetic */ Path u0(String str, String str2, FileAttribute[] attributes, int i4, Object obj) throws IOException {
        Path createTempFile;
        if ((i4 & 1) != 0) {
            str = null;
        }
        if ((i4 & 2) != 0) {
            str2 = null;
        }
        kotlin.jvm.internal.F.p(attributes, "attributes");
        createTempFile = Files.createTempFile(str, str2, (FileAttribute[]) Arrays.copyOf(attributes, attributes.length));
        kotlin.jvm.internal.F.o(createTempFile, "createTempFile(...)");
        return createTempFile;
    }

    @kotlin.K0(markerClass = {InterfaceC2160s.class})
    @kotlin.Y(version = "1.5")
    @kotlin.internal.f
    private static final Path u1(Path path, FileTime value) throws IOException {
        Path lastModifiedTime;
        kotlin.jvm.internal.F.p(path, "<this>");
        kotlin.jvm.internal.F.p(value, "value");
        lastModifiedTime = Files.setLastModifiedTime(path, value);
        kotlin.jvm.internal.F.o(lastModifiedTime, "setLastModifiedTime(...)");
        return lastModifiedTime;
    }

    public static /* synthetic */ Path v0(Path path, String str, String str2, FileAttribute[] fileAttributeArr, int i4, Object obj) throws IOException {
        if ((i4 & 2) != 0) {
            str = null;
        }
        if ((i4 & 4) != 0) {
            str2 = null;
        }
        return t0(path, str, str2, fileAttributeArr);
    }

    @kotlin.K0(markerClass = {InterfaceC2160s.class})
    @kotlin.Y(version = "1.5")
    @kotlin.internal.f
    private static final Path v1(Path path, UserPrincipal value) throws IOException {
        Path owner;
        kotlin.jvm.internal.F.p(path, "<this>");
        kotlin.jvm.internal.F.p(value, "value");
        owner = Files.setOwner(path, value);
        kotlin.jvm.internal.F.o(owner, "setOwner(...)");
        return owner;
    }

    @kotlin.K0(markerClass = {InterfaceC2160s.class})
    @kotlin.Y(version = "1.5")
    @kotlin.internal.f
    private static final void w0(Path path) throws IOException {
        kotlin.jvm.internal.F.p(path, "<this>");
        Files.delete(path);
    }

    @kotlin.K0(markerClass = {InterfaceC2160s.class})
    @kotlin.Y(version = "1.5")
    @kotlin.internal.f
    private static final Path w1(Path path, Set<? extends PosixFilePermission> value) throws IOException {
        Path posixFilePermissions;
        kotlin.jvm.internal.F.p(path, "<this>");
        kotlin.jvm.internal.F.p(value, "value");
        posixFilePermissions = Files.setPosixFilePermissions(path, value);
        kotlin.jvm.internal.F.o(posixFilePermissions, "setPosixFilePermissions(...)");
        return posixFilePermissions;
    }

    @kotlin.K0(markerClass = {InterfaceC2160s.class})
    @kotlin.Y(version = "1.5")
    @kotlin.internal.f
    private static final boolean x0(Path path) throws IOException {
        boolean deleteIfExists;
        kotlin.jvm.internal.F.p(path, "<this>");
        deleteIfExists = Files.deleteIfExists(path);
        return deleteIfExists;
    }

    @kotlin.K0(markerClass = {InterfaceC2160s.class})
    @kotlin.Y(version = "1.5")
    @kotlin.internal.f
    private static final Path x1(URI uri) {
        Path path;
        kotlin.jvm.internal.F.p(uri, "<this>");
        path = Paths.get(uri);
        kotlin.jvm.internal.F.o(path, "get(...)");
        return path;
    }

    @kotlin.K0(markerClass = {InterfaceC2160s.class})
    @kotlin.Y(version = "1.5")
    @kotlin.internal.f
    private static final Path y0(Path path, String other) {
        Path resolve;
        kotlin.jvm.internal.F.p(path, "<this>");
        kotlin.jvm.internal.F.p(other, "other");
        resolve = path.resolve(other);
        kotlin.jvm.internal.F.o(resolve, "resolve(...)");
        return resolve;
    }

    @kotlin.K0(markerClass = {InterfaceC2160s.class})
    @kotlin.Y(version = "1.5")
    @kotlin.internal.f
    private static final <T> T y1(Path path, String glob, X2.l<? super kotlin.sequences.m<? extends Path>, ? extends T> block) throws IOException {
        DirectoryStream newDirectoryStream;
        kotlin.sequences.m A12;
        kotlin.jvm.internal.F.p(path, "<this>");
        kotlin.jvm.internal.F.p(glob, "glob");
        kotlin.jvm.internal.F.p(block, "block");
        newDirectoryStream = Files.newDirectoryStream(path, glob);
        try {
            DirectoryStream a4 = C2163t0.a(newDirectoryStream);
            kotlin.jvm.internal.F.m(a4);
            A12 = kotlin.collections.D.A1(a4);
            T C3 = block.C(A12);
            kotlin.jvm.internal.C.d(1);
            if (kotlin.internal.m.a(1, 1, 0)) {
                kotlin.io.b.a(newDirectoryStream, null);
            } else if (newDirectoryStream != null) {
                newDirectoryStream.close();
            }
            kotlin.jvm.internal.C.c(1);
            return C3;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                kotlin.jvm.internal.C.d(1);
                if (!kotlin.internal.m.a(1, 1, 0)) {
                    if (newDirectoryStream != null) {
                        try {
                            newDirectoryStream.close();
                        } catch (Throwable unused) {
                        }
                    }
                } else {
                    kotlin.io.b.a(newDirectoryStream, th);
                }
                kotlin.jvm.internal.C.c(1);
                throw th2;
            }
        }
    }

    @kotlin.K0(markerClass = {InterfaceC2160s.class})
    @kotlin.Y(version = "1.5")
    @kotlin.internal.f
    private static final Path z0(Path path, Path other) {
        Path resolve;
        kotlin.jvm.internal.F.p(path, "<this>");
        kotlin.jvm.internal.F.p(other, "other");
        resolve = path.resolve(other);
        kotlin.jvm.internal.F.o(resolve, "resolve(...)");
        return resolve;
    }

    static /* synthetic */ Object z1(Path path, String glob, X2.l block, int i4, Object obj) throws IOException {
        DirectoryStream newDirectoryStream;
        kotlin.sequences.m A12;
        if ((i4 & 1) != 0) {
            glob = "*";
        }
        kotlin.jvm.internal.F.p(path, "<this>");
        kotlin.jvm.internal.F.p(glob, "glob");
        kotlin.jvm.internal.F.p(block, "block");
        newDirectoryStream = Files.newDirectoryStream(path, glob);
        try {
            DirectoryStream a4 = C2163t0.a(newDirectoryStream);
            kotlin.jvm.internal.F.m(a4);
            A12 = kotlin.collections.D.A1(a4);
            Object C3 = block.C(A12);
            kotlin.jvm.internal.C.d(1);
            if (kotlin.internal.m.a(1, 1, 0)) {
                kotlin.io.b.a(newDirectoryStream, null);
            } else if (newDirectoryStream != null) {
                newDirectoryStream.close();
            }
            kotlin.jvm.internal.C.c(1);
            return C3;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                kotlin.jvm.internal.C.d(1);
                if (!kotlin.internal.m.a(1, 1, 0)) {
                    if (newDirectoryStream != null) {
                        try {
                            newDirectoryStream.close();
                        } catch (Throwable unused) {
                        }
                    }
                } else {
                    kotlin.io.b.a(newDirectoryStream, th);
                }
                kotlin.jvm.internal.C.c(1);
                throw th2;
            }
        }
    }
}
