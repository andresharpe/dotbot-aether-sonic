package kotlin.collections.builders;

import java.io.Externalizable;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.E;
import kotlin.collections.C2108v;
import kotlin.collections.i0;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.U;

@E(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0000\u0018\u0000 \u00192\u00020\u0001:\u0001\u0003B\u001b\u0012\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0017B\t\b\u0016¢\u0006\u0004\b\u0016\u0010\u0018J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u001a"}, d2 = {"Lkotlin/collections/builders/SerializedCollection;", "Ljava/io/Externalizable;", "", "a", "()Ljava/lang/Object;", "Ljava/io/ObjectOutput;", "output", "Lkotlin/H0;", "writeExternal", "(Ljava/io/ObjectOutput;)V", "Ljava/io/ObjectInput;", "input", "readExternal", "(Ljava/io/ObjectInput;)V", "", androidx.exifinterface.media.a.U4, "Ljava/util/Collection;", "collection", "", "F", "I", "tag", "<init>", "(Ljava/util/Collection;I)V", "()V", "G", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
@U({"SMAP\nListBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListBuilder.kt\nkotlin/collections/builders/SerializedCollection\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,487:1\n1#2:488\n*E\n"})
/* loaded from: classes2.dex */
public final class SerializedCollection implements Externalizable {

    /* renamed from: G, reason: collision with root package name */
    @l3.d
    public static final a f51886G = new a(null);

    /* renamed from: H, reason: collision with root package name */
    private static final long f51887H = 0;

    /* renamed from: I, reason: collision with root package name */
    public static final int f51888I = 0;

    /* renamed from: J, reason: collision with root package name */
    public static final int f51889J = 1;

    /* renamed from: E, reason: collision with root package name */
    @l3.d
    private Collection<?> f51890E;

    /* renamed from: F, reason: collision with root package name */
    private final int f51891F;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private a() {
        }
    }

    public SerializedCollection(@l3.d Collection<?> collection, int i4) {
        F.p(collection, "collection");
        this.f51890E = collection;
        this.f51891F = i4;
    }

    private final Object a() {
        return this.f51890E;
    }

    @Override // java.io.Externalizable
    public void readExternal(@l3.d ObjectInput input) {
        List j4;
        Collection<?> a4;
        Set e4;
        F.p(input, "input");
        byte readByte = input.readByte();
        int i4 = readByte & 1;
        if ((readByte & (-2)) == 0) {
            int readInt = input.readInt();
            if (readInt >= 0) {
                int i5 = 0;
                if (i4 == 0) {
                    j4 = C2108v.j(readInt);
                    while (i5 < readInt) {
                        j4.add(input.readObject());
                        i5++;
                    }
                    a4 = C2108v.a(j4);
                } else if (i4 == 1) {
                    e4 = i0.e(readInt);
                    while (i5 < readInt) {
                        e4.add(input.readObject());
                        i5++;
                    }
                    a4 = i0.a(e4);
                } else {
                    throw new InvalidObjectException("Unsupported collection type tag: " + i4 + '.');
                }
                this.f51890E = a4;
                return;
            }
            throw new InvalidObjectException("Illegal size value: " + readInt + '.');
        }
        throw new InvalidObjectException("Unsupported flags value: " + ((int) readByte) + '.');
    }

    @Override // java.io.Externalizable
    public void writeExternal(@l3.d ObjectOutput output) {
        F.p(output, "output");
        output.writeByte(this.f51891F);
        output.writeInt(this.f51890E.size());
        Iterator<?> it = this.f51890E.iterator();
        while (it.hasNext()) {
            output.writeObject(it.next());
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SerializedCollection() {
        /*
            r2 = this;
            java.util.List r0 = kotlin.collections.C2107u.H()
            r1 = 0
            r2.<init>(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.builders.SerializedCollection.<init>():void");
    }
}
