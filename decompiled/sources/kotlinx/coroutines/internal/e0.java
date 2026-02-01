package kotlinx.coroutines.internal;

import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes2.dex */
final class e0 extends AbstractC2305l {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    public static final e0 f54481a = new e0();

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    private static final ReentrantReadWriteLock f54482b = new ReentrantReadWriteLock();

    /* renamed from: c, reason: collision with root package name */
    @l3.d
    private static final WeakHashMap<Class<? extends Throwable>, X2.l<Throwable, Throwable>> f54483c = new WeakHashMap<>();

    private e0() {
    }

    @Override // kotlinx.coroutines.internal.AbstractC2305l
    @l3.d
    public X2.l<Throwable, Throwable> a(@l3.d Class<? extends Throwable> cls) {
        int i4;
        X2.l<Throwable, Throwable> b4;
        ReentrantReadWriteLock reentrantReadWriteLock = f54482b;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        readLock.lock();
        try {
            X2.l<Throwable, Throwable> lVar = f54483c.get(cls);
            if (lVar != null) {
                return lVar;
            }
            ReentrantReadWriteLock.ReadLock readLock2 = reentrantReadWriteLock.readLock();
            int i5 = 0;
            if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
                i4 = reentrantReadWriteLock.getReadHoldCount();
            } else {
                i4 = 0;
            }
            for (int i6 = 0; i6 < i4; i6++) {
                readLock2.unlock();
            }
            ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                WeakHashMap<Class<? extends Throwable>, X2.l<Throwable, Throwable>> weakHashMap = f54483c;
                X2.l<Throwable, Throwable> lVar2 = weakHashMap.get(cls);
                if (lVar2 == null) {
                    b4 = ExceptionsConstructorKt.b(cls);
                    weakHashMap.put(cls, b4);
                    while (i5 < i4) {
                        readLock2.lock();
                        i5++;
                    }
                    writeLock.unlock();
                    return b4;
                }
                return lVar2;
            } finally {
                while (i5 < i4) {
                    readLock2.lock();
                    i5++;
                }
                writeLock.unlock();
            }
        } finally {
            readLock.unlock();
        }
    }
}
