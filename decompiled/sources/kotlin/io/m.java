package kotlin.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.H0;
import kotlin.InterfaceC2205l;
import kotlin.collections.D;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.U;
import kotlin.text.A;
import kotlin.text.z;

@U({"SMAP\nUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Utils.kt\nkotlin/io/FilesKt__UtilsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,473:1\n1#2:474\n1284#3,3:475\n*S KotlinDebug\n*F\n+ 1 Utils.kt\nkotlin/io/FilesKt__UtilsKt\n*L\n347#1:475,3\n*E\n"})
/* loaded from: classes2.dex */
class m extends l {

    /* loaded from: classes2.dex */
    static final class a extends Lambda implements X2.p {

        /* renamed from: F, reason: collision with root package name */
        public static final a f52166F = new a();

        a() {
            super(2);
        }

        @Override // X2.p
        @l3.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Void c0(@l3.d File file, @l3.d IOException exception) {
            F.p(file, "<anonymous parameter 0>");
            F.p(exception, "exception");
            throw exception;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class b extends Lambda implements X2.p<File, IOException, H0> {

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ X2.p<File, IOException, OnErrorAction> f52167F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(X2.p<? super File, ? super IOException, ? extends OnErrorAction> pVar) {
            super(2);
            this.f52167F = pVar;
        }

        public final void c(@l3.d File f4, @l3.d IOException e4) {
            F.p(f4, "f");
            F.p(e4, "e");
            if (this.f52167F.c0(f4, e4) != OnErrorAction.TERMINATE) {
            } else {
                throw new q(f4);
            }
        }

        @Override // X2.p
        public /* bridge */ /* synthetic */ H0 c0(File file, IOException iOException) {
            c(file, iOException);
            return H0.f51801a;
        }
    }

    public static final boolean N(@l3.d File file, @l3.d File target, boolean z3, @l3.d X2.p<? super File, ? super IOException, ? extends OnErrorAction> onError) {
        F.p(file, "<this>");
        F.p(target, "target");
        F.p(onError, "onError");
        if (!file.exists()) {
            if (onError.c0(file, new NoSuchFileException(file, null, "The source file doesn't exist.", 2, null)) != OnErrorAction.TERMINATE) {
                return true;
            }
            return false;
        }
        try {
            Iterator<File> it = l.M(file).k(new b(onError)).iterator();
            while (it.hasNext()) {
                File next = it.next();
                if (!next.exists()) {
                    if (onError.c0(next, new NoSuchFileException(next, null, "The source file doesn't exist.", 2, null)) == OnErrorAction.TERMINATE) {
                        return false;
                    }
                } else {
                    File file2 = new File(target, n0(next, file));
                    if (file2.exists() && (!next.isDirectory() || !file2.isDirectory())) {
                        if (z3) {
                            if (file2.isDirectory()) {
                                if (!V(file2)) {
                                }
                            } else if (!file2.delete()) {
                            }
                        }
                        if (onError.c0(file2, new FileAlreadyExistsException(next, file2, "The destination file already exists.")) == OnErrorAction.TERMINATE) {
                            return false;
                        }
                    }
                    if (next.isDirectory()) {
                        file2.mkdirs();
                    } else if (Q(next, file2, z3, 0, 4, null).length() != next.length() && onError.c0(next, new IOException("Source file wasn't copied completely, length of destination file differs.")) == OnErrorAction.TERMINATE) {
                        return false;
                    }
                }
            }
            return true;
        } catch (q unused) {
            return false;
        }
    }

    public static /* synthetic */ boolean O(File file, File file2, boolean z3, X2.p pVar, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z3 = false;
        }
        if ((i4 & 4) != 0) {
            pVar = a.f52166F;
        }
        return N(file, file2, z3, pVar);
    }

    @l3.d
    public static final File P(@l3.d File file, @l3.d File target, boolean z3, int i4) {
        F.p(file, "<this>");
        F.p(target, "target");
        if (file.exists()) {
            if (target.exists()) {
                if (z3) {
                    if (!target.delete()) {
                        throw new FileAlreadyExistsException(file, target, "Tried to overwrite the destination, but failed to delete it.");
                    }
                } else {
                    throw new FileAlreadyExistsException(file, target, "The destination file already exists.");
                }
            }
            if (file.isDirectory()) {
                if (!target.mkdirs()) {
                    throw new FileSystemException(file, target, "Failed to create target directory.");
                }
            } else {
                File parentFile = target.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(target);
                    try {
                        kotlin.io.a.k(fileInputStream, fileOutputStream, i4);
                        kotlin.io.b.a(fileOutputStream, null);
                        kotlin.io.b.a(fileInputStream, null);
                    } finally {
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        kotlin.io.b.a(fileInputStream, th);
                        throw th2;
                    }
                }
            }
            return target;
        }
        throw new NoSuchFileException(file, null, "The source file doesn't exist.", 2, null);
    }

    public static /* synthetic */ File Q(File file, File file2, boolean z3, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            z3 = false;
        }
        if ((i5 & 4) != 0) {
            i4 = 8192;
        }
        return P(file, file2, z3, i4);
    }

    @l3.d
    @InterfaceC2205l(message = "Avoid creating temporary directories in the default temp location with this function due to too wide permissions on the newly created directory. Use kotlin.io.path.createTempDirectory instead.")
    public static final File R(@l3.d String prefix, @l3.e String str, @l3.e File file) {
        F.p(prefix, "prefix");
        File createTempFile = File.createTempFile(prefix, str, file);
        createTempFile.delete();
        if (createTempFile.mkdir()) {
            F.m(createTempFile);
            return createTempFile;
        }
        throw new IOException("Unable to create temporary directory " + createTempFile + '.');
    }

    public static /* synthetic */ File S(String str, String str2, File file, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = "tmp";
        }
        if ((i4 & 2) != 0) {
            str2 = null;
        }
        if ((i4 & 4) != 0) {
            file = null;
        }
        return R(str, str2, file);
    }

    @l3.d
    @InterfaceC2205l(message = "Avoid creating temporary files in the default temp location with this function due to too wide permissions on the newly created file. Use kotlin.io.path.createTempFile instead or resort to java.io.File.createTempFile.")
    public static final File T(@l3.d String prefix, @l3.e String str, @l3.e File file) {
        F.p(prefix, "prefix");
        File createTempFile = File.createTempFile(prefix, str, file);
        F.o(createTempFile, "createTempFile(...)");
        return createTempFile;
    }

    public static /* synthetic */ File U(String str, String str2, File file, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = "tmp";
        }
        if ((i4 & 2) != 0) {
            str2 = null;
        }
        if ((i4 & 4) != 0) {
            file = null;
        }
        return T(str, str2, file);
    }

    public static final boolean V(@l3.d File file) {
        F.p(file, "<this>");
        while (true) {
            boolean z3 = true;
            for (File file2 : l.L(file)) {
                if (file2.delete() || !file2.exists()) {
                    if (z3) {
                        break;
                    }
                }
                z3 = false;
            }
            return z3;
        }
    }

    public static final boolean W(@l3.d File file, @l3.d File other) {
        F.p(file, "<this>");
        F.p(other, "other");
        g f4 = j.f(file);
        g f5 = j.f(other);
        if (f5.i()) {
            return F.g(file, other);
        }
        int h4 = f4.h() - f5.h();
        if (h4 < 0) {
            return false;
        }
        return f4.g().subList(h4, f4.h()).equals(f5.g());
    }

    public static final boolean X(@l3.d File file, @l3.d String other) {
        F.p(file, "<this>");
        F.p(other, "other");
        return W(file, new File(other));
    }

    @l3.d
    public static final String Y(@l3.d File file) {
        String o5;
        F.p(file, "<this>");
        String name = file.getName();
        F.o(name, "getName(...)");
        o5 = A.o5(name, '.', "");
        return o5;
    }

    @l3.d
    public static final String Z(@l3.d File file) {
        String h22;
        F.p(file, "<this>");
        char c4 = File.separatorChar;
        String path = file.getPath();
        F.o(path, "getPath(...)");
        if (c4 != '/') {
            h22 = z.h2(path, c4, '/', false, 4, null);
            return h22;
        }
        return path;
    }

    @l3.d
    public static final String a0(@l3.d File file) {
        String z5;
        F.p(file, "<this>");
        String name = file.getName();
        F.o(name, "getName(...)");
        z5 = A.z5(name, ".", null, 2, null);
        return z5;
    }

    @l3.d
    public static final File b0(@l3.d File file) {
        String m32;
        F.p(file, "<this>");
        g f4 = j.f(file);
        File e4 = f4.e();
        List<File> c02 = c0(f4.g());
        String separator = File.separator;
        F.o(separator, "separator");
        m32 = D.m3(c02, separator, null, null, 0, null, null, 62, null);
        return i0(e4, m32);
    }

    private static final List<File> c0(List<? extends File> list) {
        Object p32;
        ArrayList arrayList = new ArrayList(list.size());
        for (File file : list) {
            String name = file.getName();
            if (!F.g(name, ".")) {
                if (F.g(name, "..")) {
                    if (!arrayList.isEmpty()) {
                        p32 = D.p3(arrayList);
                        if (!F.g(((File) p32).getName(), "..")) {
                            arrayList.remove(arrayList.size() - 1);
                        }
                    }
                    arrayList.add(file);
                } else {
                    arrayList.add(file);
                }
            }
        }
        return arrayList;
    }

    private static final g d0(g gVar) {
        return new g(gVar.e(), c0(gVar.g()));
    }

    @l3.d
    public static final File e0(@l3.d File file, @l3.d File base) {
        F.p(file, "<this>");
        F.p(base, "base");
        return new File(n0(file, base));
    }

    @l3.e
    public static final File f0(@l3.d File file, @l3.d File base) {
        F.p(file, "<this>");
        F.p(base, "base");
        String o02 = o0(file, base);
        if (o02 != null) {
            return new File(o02);
        }
        return null;
    }

    @l3.d
    public static final File g0(@l3.d File file, @l3.d File base) {
        F.p(file, "<this>");
        F.p(base, "base");
        String o02 = o0(file, base);
        if (o02 != null) {
            return new File(o02);
        }
        return file;
    }

    @l3.d
    public static final File h0(@l3.d File file, @l3.d File relative) {
        boolean Y22;
        F.p(file, "<this>");
        F.p(relative, "relative");
        if (j.d(relative)) {
            return relative;
        }
        String file2 = file.toString();
        F.o(file2, "toString(...)");
        if (file2.length() != 0) {
            char c4 = File.separatorChar;
            Y22 = A.Y2(file2, c4, false, 2, null);
            if (!Y22) {
                return new File(file2 + c4 + relative);
            }
        }
        return new File(file2 + relative);
    }

    @l3.d
    public static final File i0(@l3.d File file, @l3.d String relative) {
        F.p(file, "<this>");
        F.p(relative, "relative");
        return h0(file, new File(relative));
    }

    @l3.d
    public static final File j0(@l3.d File file, @l3.d File relative) {
        File j4;
        F.p(file, "<this>");
        F.p(relative, "relative");
        g f4 = j.f(file);
        if (f4.h() == 0) {
            j4 = new File("..");
        } else {
            j4 = f4.j(0, f4.h() - 1);
        }
        return h0(h0(f4.e(), j4), relative);
    }

    @l3.d
    public static final File k0(@l3.d File file, @l3.d String relative) {
        F.p(file, "<this>");
        F.p(relative, "relative");
        return j0(file, new File(relative));
    }

    public static final boolean l0(@l3.d File file, @l3.d File other) {
        F.p(file, "<this>");
        F.p(other, "other");
        g f4 = j.f(file);
        g f5 = j.f(other);
        if (!F.g(f4.e(), f5.e()) || f4.h() < f5.h()) {
            return false;
        }
        return f4.g().subList(0, f5.h()).equals(f5.g());
    }

    public static final boolean m0(@l3.d File file, @l3.d String other) {
        F.p(file, "<this>");
        F.p(other, "other");
        return l0(file, new File(other));
    }

    @l3.d
    public static final String n0(@l3.d File file, @l3.d File base) {
        F.p(file, "<this>");
        F.p(base, "base");
        String o02 = o0(file, base);
        if (o02 != null) {
            return o02;
        }
        throw new IllegalArgumentException("this and base files have different roots: " + file + " and " + base + '.');
    }

    private static final String o0(File file, File file2) {
        List c22;
        g d02 = d0(j.f(file));
        g d03 = d0(j.f(file2));
        if (!F.g(d02.e(), d03.e())) {
            return null;
        }
        int h4 = d03.h();
        int h5 = d02.h();
        int min = Math.min(h5, h4);
        int i4 = 0;
        while (i4 < min && F.g(d02.g().get(i4), d03.g().get(i4))) {
            i4++;
        }
        StringBuilder sb = new StringBuilder();
        int i5 = h4 - 1;
        if (i4 <= i5) {
            while (!F.g(d03.g().get(i5).getName(), "..")) {
                sb.append("..");
                if (i5 != i4) {
                    sb.append(File.separatorChar);
                }
                if (i5 != i4) {
                    i5--;
                }
            }
            return null;
        }
        if (i4 < h5) {
            if (i4 < h4) {
                sb.append(File.separatorChar);
            }
            c22 = D.c2(d02.g(), i4);
            String separator = File.separator;
            F.o(separator, "separator");
            D.k3(c22, sb, separator, null, null, 0, null, null, 124, null);
        }
        return sb.toString();
    }
}
