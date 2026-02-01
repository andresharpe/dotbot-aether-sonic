package kotlin.io;

import java.io.BufferedReader;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.F;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class o implements kotlin.sequences.m<String> {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private final BufferedReader f52177a;

    /* loaded from: classes2.dex */
    public static final class a implements Iterator<String>, Y2.a {

        /* renamed from: E, reason: collision with root package name */
        @l3.e
        private String f52178E;

        /* renamed from: F, reason: collision with root package name */
        private boolean f52179F;

        a() {
        }

        @Override // java.util.Iterator
        @l3.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public String next() {
            if (hasNext()) {
                String str = this.f52178E;
                this.f52178E = null;
                F.m(str);
                return str;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f52178E == null && !this.f52179F) {
                String readLine = o.this.f52177a.readLine();
                this.f52178E = readLine;
                if (readLine == null) {
                    this.f52179F = true;
                }
            }
            if (this.f52178E != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public o(@l3.d BufferedReader reader) {
        F.p(reader, "reader");
        this.f52177a = reader;
    }

    @Override // kotlin.sequences.m
    @l3.d
    public Iterator<String> iterator() {
        return new a();
    }
}
