package kotlin.collections.builders;

import java.io.Externalizable;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Map;
import kotlin.collections.X;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
final class f implements Externalizable {

    /* renamed from: F, reason: collision with root package name */
    @l3.d
    public static final a f51898F = new a(null);

    /* renamed from: G, reason: collision with root package name */
    private static final long f51899G = 0;

    /* renamed from: E, reason: collision with root package name */
    @l3.d
    private Map<?, ?> f51900E;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private a() {
        }
    }

    public f(@l3.d Map<?, ?> map) {
        F.p(map, "map");
        this.f51900E = map;
    }

    private final Object a() {
        return this.f51900E;
    }

    @Override // java.io.Externalizable
    public void readExternal(@l3.d ObjectInput input) {
        Map h4;
        Map<?, ?> d4;
        F.p(input, "input");
        byte readByte = input.readByte();
        if (readByte == 0) {
            int readInt = input.readInt();
            if (readInt >= 0) {
                h4 = X.h(readInt);
                for (int i4 = 0; i4 < readInt; i4++) {
                    h4.put(input.readObject(), input.readObject());
                }
                d4 = X.d(h4);
                this.f51900E = d4;
                return;
            }
            throw new InvalidObjectException("Illegal size value: " + readInt + '.');
        }
        throw new InvalidObjectException("Unsupported flags value: " + ((int) readByte));
    }

    @Override // java.io.Externalizable
    public void writeExternal(@l3.d ObjectOutput output) {
        F.p(output, "output");
        output.writeByte(0);
        output.writeInt(this.f51900E.size());
        for (Map.Entry<?, ?> entry : this.f51900E.entrySet()) {
            output.writeObject(entry.getKey());
            output.writeObject(entry.getValue());
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public f() {
        /*
            r1 = this;
            java.util.Map r0 = kotlin.collections.V.z()
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.builders.f.<init>():void");
    }
}
