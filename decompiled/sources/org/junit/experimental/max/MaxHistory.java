package org.junit.experimental.max;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import org.junit.runner.Description;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/* loaded from: classes2.dex */
public class MaxHistory implements Serializable {

    /* renamed from: H, reason: collision with root package name */
    private static final long f55501H = 1;

    /* renamed from: E, reason: collision with root package name */
    private final Map<String, Long> f55502E = new HashMap();

    /* renamed from: F, reason: collision with root package name */
    private final Map<String, Long> f55503F = new HashMap();

    /* renamed from: G, reason: collision with root package name */
    private final File f55504G;

    /* loaded from: classes2.dex */
    private final class b extends org.junit.runner.notification.a {

        /* renamed from: a, reason: collision with root package name */
        private long f55505a;

        /* renamed from: b, reason: collision with root package name */
        private Map<Description, Long> f55506b;

        private b() {
            this.f55505a = System.currentTimeMillis();
            this.f55506b = new HashMap();
        }

        @Override // org.junit.runner.notification.a
        public void b(Failure failure) throws Exception {
            MaxHistory.this.h(failure.a(), this.f55505a);
        }

        @Override // org.junit.runner.notification.a
        public void c(Description description) throws Exception {
            MaxHistory.this.g(description, System.nanoTime() - this.f55506b.get(description).longValue());
        }

        @Override // org.junit.runner.notification.a
        public void e(Result result) throws Exception {
            MaxHistory.this.j();
        }

        @Override // org.junit.runner.notification.a
        public void g(Description description) throws Exception {
            this.f55506b.put(description, Long.valueOf(System.nanoTime()));
        }
    }

    /* loaded from: classes2.dex */
    private class c implements Comparator<Description> {
        private c() {
        }

        private Long b(Description description) {
            Long c4 = MaxHistory.this.c(description);
            if (c4 == null) {
                return 0L;
            }
            return c4;
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Description description, Description description2) {
            if (MaxHistory.this.e(description)) {
                return -1;
            }
            if (MaxHistory.this.e(description2)) {
                return 1;
            }
            int compareTo = b(description2).compareTo(b(description));
            if (compareTo == 0) {
                return MaxHistory.this.d(description).compareTo(MaxHistory.this.d(description2));
            }
            return compareTo;
        }
    }

    private MaxHistory(File file) {
        this.f55504G = file;
    }

    public static MaxHistory b(File file) {
        if (file.exists()) {
            try {
                return i(file);
            } catch (CouldNotReadCoreException e4) {
                e4.printStackTrace();
                file.delete();
            }
        }
        return new MaxHistory(file);
    }

    private static MaxHistory i(File file) throws CouldNotReadCoreException {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                try {
                    return (MaxHistory) objectInputStream.readObject();
                } finally {
                    objectInputStream.close();
                }
            } finally {
                fileInputStream.close();
            }
        } catch (Exception e4) {
            throw new CouldNotReadCoreException(e4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() throws IOException {
        ObjectOutputStream objectOutputStream;
        Throwable th;
        try {
            objectOutputStream = new ObjectOutputStream(new FileOutputStream(this.f55504G));
            try {
                objectOutputStream.writeObject(this);
                objectOutputStream.close();
            } catch (Throwable th2) {
                th = th2;
                if (objectOutputStream != null) {
                    objectOutputStream.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            objectOutputStream = null;
            th = th3;
        }
    }

    Long c(Description description) {
        return this.f55503F.get(description.toString());
    }

    Long d(Description description) {
        return this.f55502E.get(description.toString());
    }

    boolean e(Description description) {
        return !this.f55502E.containsKey(description.toString());
    }

    public org.junit.runner.notification.a f() {
        return new b();
    }

    void g(Description description, long j4) {
        this.f55502E.put(description.toString(), Long.valueOf(j4));
    }

    void h(Description description, long j4) {
        this.f55503F.put(description.toString(), Long.valueOf(j4));
    }

    public Comparator<Description> k() {
        return new c();
    }
}
