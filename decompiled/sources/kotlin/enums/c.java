package kotlin.enums;

import kotlin.Y;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.U;
import kotlin.r;

@U({"SMAP\nEnumEntries.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EnumEntries.kt\nkotlin/enums/EnumEntriesKt\n+ 2 EnumEntriesJVM.kt\nkotlin/enums/EnumEntriesJVMKt\n*L\n1#1,91:1\n16#2:92\n*S KotlinDebug\n*F\n+ 1 EnumEntries.kt\nkotlin/enums/EnumEntriesKt\n*L\n31#1:92\n*E\n"})
/* loaded from: classes2.dex */
public final class c {
    @r
    @Y(version = "1.9")
    public static final /* synthetic */ <T extends Enum<T>> a<T> a() {
        F.y(5, androidx.exifinterface.media.a.f5);
        return c(new Enum[0]);
    }

    @l3.d
    @kotlin.U
    @Y(version = "1.8")
    public static final <E extends Enum<E>> a<E> b(@l3.d X2.a<E[]> entriesProvider) {
        F.p(entriesProvider, "entriesProvider");
        return new d(entriesProvider.n());
    }

    @l3.d
    @kotlin.U
    @Y(version = "1.8")
    public static final <E extends Enum<E>> a<E> c(@l3.d E[] entries) {
        F.p(entries, "entries");
        return new d(entries);
    }
}
