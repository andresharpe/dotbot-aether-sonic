package kotlin.concurrent;

import W2.i;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.internal.f;
import kotlin.jvm.internal.C;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.U;

@i(name = "LocksKt")
@U({"SMAP\nLocks.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Locks.kt\nkotlin/concurrent/LocksKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,74:1\n1#2:75\n*E\n"})
/* loaded from: classes2.dex */
public final class a {
    @f
    private static final <T> T a(ReentrantReadWriteLock reentrantReadWriteLock, X2.a<? extends T> action) {
        F.p(reentrantReadWriteLock, "<this>");
        F.p(action, "action");
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        readLock.lock();
        try {
            return action.n();
        } finally {
            C.d(1);
            readLock.unlock();
            C.c(1);
        }
    }

    @f
    private static final <T> T b(Lock lock, X2.a<? extends T> action) {
        F.p(lock, "<this>");
        F.p(action, "action");
        lock.lock();
        try {
            return action.n();
        } finally {
            C.d(1);
            lock.unlock();
            C.c(1);
        }
    }

    @f
    private static final <T> T c(ReentrantReadWriteLock reentrantReadWriteLock, X2.a<? extends T> action) {
        int i4;
        F.p(reentrantReadWriteLock, "<this>");
        F.p(action, "action");
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i5 = 0;
        if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
            i4 = reentrantReadWriteLock.getReadHoldCount();
        } else {
            i4 = 0;
        }
        for (int i6 = 0; i6 < i4; i6++) {
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            return action.n();
        } finally {
            C.d(1);
            while (i5 < i4) {
                readLock.lock();
                i5++;
            }
            writeLock.unlock();
            C.c(1);
        }
    }
}
