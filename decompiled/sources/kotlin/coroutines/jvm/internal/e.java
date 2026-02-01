package kotlin.coroutines.jvm.internal;

import com.google.firebase.messaging.C1821f;
import java.lang.reflect.Field;
import java.util.ArrayList;
import kotlin.Y;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.U;

@U({"SMAP\nDebugMetadata.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugMetadata.kt\nkotlin/coroutines/jvm/internal/DebugMetadataKt\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,134:1\n37#2,2:135\n*S KotlinDebug\n*F\n+ 1 DebugMetadata.kt\nkotlin/coroutines/jvm/internal/DebugMetadataKt\n*L\n131#1:135,2\n*E\n"})
/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private static final int f52074a = 1;

    private static final void a(int i4, int i5) {
        if (i5 <= i4) {
            return;
        }
        throw new IllegalStateException(("Debug metadata version mismatch. Expected: " + i4 + ", got " + i5 + ". Please update the Kotlin standard library.").toString());
    }

    private static final d b(BaseContinuationImpl baseContinuationImpl) {
        return (d) baseContinuationImpl.getClass().getAnnotation(d.class);
    }

    private static final int c(BaseContinuationImpl baseContinuationImpl) {
        Integer num;
        int i4;
        try {
            Field declaredField = baseContinuationImpl.getClass().getDeclaredField(C1821f.C0339f.f36991d);
            declaredField.setAccessible(true);
            Object obj = declaredField.get(baseContinuationImpl);
            if (obj instanceof Integer) {
                num = (Integer) obj;
            } else {
                num = null;
            }
            if (num != null) {
                i4 = num.intValue();
            } else {
                i4 = 0;
            }
            return i4 - 1;
        } catch (Exception unused) {
            return -1;
        }
    }

    @l3.e
    @W2.i(name = "getSpilledVariableFieldMapping")
    @Y(version = "1.3")
    public static final String[] d(@l3.d BaseContinuationImpl baseContinuationImpl) {
        F.p(baseContinuationImpl, "<this>");
        d b4 = b(baseContinuationImpl);
        if (b4 == null) {
            return null;
        }
        a(1, b4.v());
        ArrayList arrayList = new ArrayList();
        int c4 = c(baseContinuationImpl);
        int[] i4 = b4.i();
        int length = i4.length;
        for (int i5 = 0; i5 < length; i5++) {
            if (i4[i5] == c4) {
                arrayList.add(b4.s()[i5]);
                arrayList.add(b4.n()[i5]);
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    @l3.e
    @W2.i(name = "getStackTraceElement")
    @Y(version = "1.3")
    public static final StackTraceElement e(@l3.d BaseContinuationImpl baseContinuationImpl) {
        int i4;
        String str;
        F.p(baseContinuationImpl, "<this>");
        d b4 = b(baseContinuationImpl);
        if (b4 == null) {
            return null;
        }
        a(1, b4.v());
        int c4 = c(baseContinuationImpl);
        if (c4 < 0) {
            i4 = -1;
        } else {
            i4 = b4.l()[c4];
        }
        String b5 = g.f52075a.b(baseContinuationImpl);
        if (b5 == null) {
            str = b4.c();
        } else {
            str = b5 + '/' + b4.c();
        }
        return new StackTraceElement(str, b4.m(), b4.f(), i4);
    }
}
