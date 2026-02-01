package kotlin.io.path;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

/* renamed from: kotlin.io.path.w, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2168w extends SimpleFileVisitor<Path> {

    /* renamed from: a, reason: collision with root package name */
    @l3.e
    private final X2.p<Path, BasicFileAttributes, FileVisitResult> f52239a;

    /* renamed from: b, reason: collision with root package name */
    @l3.e
    private final X2.p<Path, BasicFileAttributes, FileVisitResult> f52240b;

    /* renamed from: c, reason: collision with root package name */
    @l3.e
    private final X2.p<Path, IOException, FileVisitResult> f52241c;

    /* renamed from: d, reason: collision with root package name */
    @l3.e
    private final X2.p<Path, IOException, FileVisitResult> f52242d;

    /* JADX WARN: Multi-variable type inference failed */
    public C2168w(@l3.e X2.p<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> pVar, @l3.e X2.p<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> pVar2, @l3.e X2.p<? super Path, ? super IOException, ? extends FileVisitResult> pVar3, @l3.e X2.p<? super Path, ? super IOException, ? extends FileVisitResult> pVar4) {
        this.f52239a = pVar;
        this.f52240b = pVar2;
        this.f52241c = pVar3;
        this.f52242d = pVar4;
    }

    @l3.d
    public FileVisitResult a(@l3.d Path dir, @l3.e IOException iOException) {
        FileVisitResult a4;
        kotlin.jvm.internal.F.p(dir, "dir");
        X2.p<Path, IOException, FileVisitResult> pVar = this.f52242d;
        if (pVar == null || (a4 = C2166v.a(pVar.c0(dir, iOException))) == null) {
            FileVisitResult postVisitDirectory = super.postVisitDirectory(dir, iOException);
            kotlin.jvm.internal.F.o(postVisitDirectory, "postVisitDirectory(...)");
            return postVisitDirectory;
        }
        return a4;
    }

    @l3.d
    public FileVisitResult b(@l3.d Path dir, @l3.d BasicFileAttributes attrs) {
        FileVisitResult a4;
        kotlin.jvm.internal.F.p(dir, "dir");
        kotlin.jvm.internal.F.p(attrs, "attrs");
        X2.p<Path, BasicFileAttributes, FileVisitResult> pVar = this.f52239a;
        if (pVar == null || (a4 = C2166v.a(pVar.c0(dir, attrs))) == null) {
            FileVisitResult preVisitDirectory = super.preVisitDirectory(dir, attrs);
            kotlin.jvm.internal.F.o(preVisitDirectory, "preVisitDirectory(...)");
            return preVisitDirectory;
        }
        return a4;
    }

    @l3.d
    public FileVisitResult c(@l3.d Path file, @l3.d BasicFileAttributes attrs) {
        FileVisitResult a4;
        kotlin.jvm.internal.F.p(file, "file");
        kotlin.jvm.internal.F.p(attrs, "attrs");
        X2.p<Path, BasicFileAttributes, FileVisitResult> pVar = this.f52240b;
        if (pVar == null || (a4 = C2166v.a(pVar.c0(file, attrs))) == null) {
            FileVisitResult visitFile = super.visitFile(file, attrs);
            kotlin.jvm.internal.F.o(visitFile, "visitFile(...)");
            return visitFile;
        }
        return a4;
    }

    @l3.d
    public FileVisitResult d(@l3.d Path file, @l3.d IOException exc) {
        FileVisitResult a4;
        kotlin.jvm.internal.F.p(file, "file");
        kotlin.jvm.internal.F.p(exc, "exc");
        X2.p<Path, IOException, FileVisitResult> pVar = this.f52241c;
        if (pVar == null || (a4 = C2166v.a(pVar.c0(file, exc))) == null) {
            FileVisitResult visitFileFailed = super.visitFileFailed(file, exc);
            kotlin.jvm.internal.F.o(visitFileFailed, "visitFileFailed(...)");
            return visitFileFailed;
        }
        return a4;
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult postVisitDirectory(Object obj, IOException iOException) {
        return a(C2137g.a(obj), iOException);
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult preVisitDirectory(Object obj, BasicFileAttributes basicFileAttributes) {
        return b(C2137g.a(obj), basicFileAttributes);
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult visitFile(Object obj, BasicFileAttributes basicFileAttributes) {
        return c(C2137g.a(obj), basicFileAttributes);
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult visitFileFailed(Object obj, IOException iOException) {
        return d(C2137g.a(obj), iOException);
    }
}
