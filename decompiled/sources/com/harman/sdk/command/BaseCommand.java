package com.harman.sdk.command;

import com.harman.log.b;
import com.harman.sdk.a;
import com.harman.sdk.device.HmDevice;
import com.harman.sdk.message.BaseMessage;
import com.harman.sdk.utils.MessageID;
import com.harman.sdk.utils.g;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Objects;
import kotlin.E;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.U;
import kotlin.ranges.u;
import l3.d;
import l3.e;

@E(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0005\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b\u001f\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0016¢\u0006\u0004\bY\u0010ZB\u0011\b\u0016\u0012\u0006\u0010[\u001a\u00020\u0006¢\u0006\u0004\bY\u0010MB\u0011\b\u0016\u0012\u0006\u0010\\\u001a\u00020\u0003¢\u0006\u0004\bY\u0010]J\u0011\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0014\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\t2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\"\u0010\u0005R$\u0010&\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00150#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\"\u0010.\u001a\u00020'8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R(\u00107\u001a\b\u0012\u0004\u0012\u0002000/8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010>\u001a\u0002008\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\"\u0010E\u001a\u00020?8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\b\u0016\u0010DR\"\u0010H\u001a\u0002008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u00109\u001a\u0004\bF\u0010;\"\u0004\bG\u0010=R$\u0010N\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010\b\"\u0004\bL\u0010MR\u0014\u0010P\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bO\u0010\u000bR\u0014\u0010R\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010\u000bR\u0014\u0010T\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bS\u0010\u000bR\u0014\u0010V\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bU\u0010\u000bR\u0014\u0010X\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bW\u0010\u000b¨\u0006^"}, d2 = {"Lcom/harman/sdk/command/BaseCommand;", "Lcom/harman/sdk/a;", "Ljava/io/Serializable;", "", "a", "()Ljava/lang/String;", "", b.f47574c, "()[B", "", "hasNext", "()Z", L1.a.f1577e0, "()Lcom/harman/sdk/a;", "Lcom/harman/sdk/device/HmDevice;", "device", "receivedCommand", "Lcom/harman/sdk/message/BaseMessage;", "q", "(Lcom/harman/sdk/device/HmDevice;Lcom/harman/sdk/a;)Lcom/harman/sdk/message/BaseMessage;", "key", "", "o", "Lkotlin/H0;", "i", "(Ljava/lang/String;Ljava/lang/Object;)V", "r", "(Ljava/lang/String;)Ljava/lang/Object;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/util/HashMap;", androidx.exifinterface.media.a.U4, "Ljava/util/HashMap;", "extraInfo", "Lcom/harman/sdk/command/a;", "F", "Lcom/harman/sdk/command/a;", "u", "()Lcom/harman/sdk/command/a;", "w", "(Lcom/harman/sdk/command/a;)V", "commandProcessor", "Ljava/util/LinkedList;", "", "G", "Ljava/util/LinkedList;", "v", "()Ljava/util/LinkedList;", "x", "(Ljava/util/LinkedList;)V", "responseCommands", "H", "B", "g", "()B", "m", "(B)V", "identifier", "", "I", "J", "t", "()J", "(J)V", "commandTimeOut", "k", "p", "command", "K", "[B", "n", "j", "([B)V", "payload", "f", "isFinished", "d", "isChangeCommand", "c", "isDfuCommand", "s", "withResponse", "h", "needReWrite", "<init>", "()V", "buffer", "hexString", "(Ljava/lang/String;)V", "2_hm_partybox_sdk_mgr_release"}, k = 1, mv = {1, 9, 0})
@U({"SMAP\nBaseCommand.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseCommand.kt\ncom/harman/sdk/command/BaseCommand\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,147:1\n1#2:148\n37#3,2:149\n*S KotlinDebug\n*F\n+ 1 BaseCommand.kt\ncom/harman/sdk/command/BaseCommand\n*L\n143#1:149,2\n*E\n"})
/* loaded from: classes2.dex */
public class BaseCommand implements com.harman.sdk.a, Serializable {

    /* renamed from: E, reason: collision with root package name */
    @d
    private final HashMap<String, Object> f47619E;

    /* renamed from: F, reason: collision with root package name */
    @d
    private a f47620F;

    /* renamed from: G, reason: collision with root package name */
    @d
    private LinkedList<Byte> f47621G;

    /* renamed from: H, reason: collision with root package name */
    private byte f47622H;

    /* renamed from: I, reason: collision with root package name */
    private long f47623I;

    /* renamed from: J, reason: collision with root package name */
    private byte f47624J;

    /* renamed from: K, reason: collision with root package name */
    @e
    private byte[] f47625K;

    public BaseCommand() {
        this.f47619E = new HashMap<>();
        this.f47620F = new a();
        this.f47621G = new LinkedList<>();
        this.f47622H = (byte) -86;
        this.f47623I = 50L;
        this.f47624J = (byte) 17;
    }

    @Override // com.harman.sdk.a
    @e
    public String a() {
        return g.g(b());
    }

    @Override // com.harman.sdk.a
    @e
    public byte[] b() {
        byte[] bArr = {g(), this.f47624J, (byte) l()};
        byte[] bArr2 = this.f47625K;
        if (bArr2 != null) {
            byte[] bArr3 = new byte[bArr2.length + 3];
            System.arraycopy(bArr, 0, bArr3, 0, 3);
            System.arraycopy(bArr2, 0, bArr3, 3, bArr2.length);
            return bArr3;
        }
        return bArr;
    }

    @Override // com.harman.sdk.a
    public boolean c() {
        return false;
    }

    @Override // com.harman.sdk.a
    public boolean d() {
        return false;
    }

    @Override // com.harman.sdk.a
    public void e(int i4) {
        a.C0426a.b(this, i4);
    }

    public boolean equals(@e Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !F.g(getClass(), obj.getClass())) {
            return false;
        }
        BaseCommand baseCommand = (BaseCommand) obj;
        if (g() == baseCommand.g() && this.f47624J == baseCommand.f47624J && l() == baseCommand.l() && Arrays.equals(this.f47625K, baseCommand.f47625K)) {
            return true;
        }
        return false;
    }

    @Override // com.harman.sdk.a
    public boolean f() {
        if (this.f47621G.size() == 0) {
            return true;
        }
        return false;
    }

    @Override // com.harman.sdk.a
    public byte g() {
        return this.f47622H;
    }

    @Override // com.harman.sdk.a
    public boolean h() {
        return true;
    }

    @Override // com.harman.sdk.a
    public boolean hasNext() {
        return false;
    }

    public int hashCode() {
        return (Objects.hash(Byte.valueOf(g()), Byte.valueOf(this.f47624J), Integer.valueOf(l())) * 31) + Arrays.hashCode(this.f47625K);
    }

    @Override // com.harman.sdk.a
    public void i(@d String key, @e Object obj) {
        F.p(key, "key");
        if (obj != null) {
            this.f47619E.put(key, obj);
        } else {
            this.f47619E.remove(key);
        }
    }

    @Override // com.harman.sdk.a
    public final void j(@e byte[] bArr) {
        this.f47625K = bArr;
    }

    @Override // com.harman.sdk.a
    public final byte k() {
        return this.f47624J;
    }

    @Override // com.harman.sdk.a
    public int l() {
        return a.C0426a.a(this);
    }

    @Override // com.harman.sdk.a
    public void m(byte b4) {
        this.f47622H = b4;
    }

    @Override // com.harman.sdk.a
    @e
    public final byte[] n() {
        return this.f47625K;
    }

    @Override // com.harman.sdk.a
    @e
    public com.harman.sdk.a next() {
        return null;
    }

    @Override // com.harman.sdk.a
    public void o(long j4) {
        this.f47623I = j4;
    }

    @Override // com.harman.sdk.a
    public final void p(byte b4) {
        this.f47624J = b4;
    }

    @Override // com.harman.sdk.a
    @d
    public BaseMessage q(@d HmDevice device, @d com.harman.sdk.a receivedCommand) {
        boolean z3;
        F.p(device, "device");
        F.p(receivedCommand, "receivedCommand");
        Iterator<Byte> it = this.f47621G.iterator();
        while (true) {
            if (it.hasNext()) {
                Byte next = it.next();
                if (next.byteValue() == receivedCommand.k()) {
                    this.f47621G.remove(next);
                    z3 = true;
                    break;
                }
            } else {
                z3 = false;
                break;
            }
        }
        BaseMessage baseMessage = new BaseMessage();
        baseMessage.d(MessageID.DEVICE_INFO);
        if (!z3) {
            baseMessage.d(MessageID.UNKNOWN);
            return baseMessage;
        }
        return this.f47620F.f(device, receivedCommand, this);
    }

    @Override // com.harman.sdk.a
    @e
    public Object r(@d String key) {
        F.p(key, "key");
        return this.f47619E.get(key);
    }

    @Override // com.harman.sdk.a
    public boolean s() {
        return true;
    }

    @Override // com.harman.sdk.a
    public long t() {
        return this.f47623I;
    }

    @d
    public String toString() {
        return "BaseCommand{identifier=" + g.g(new byte[]{g()}) + ", command=" + g.g(new byte[]{this.f47624J}) + ", payloadLen=" + l() + ", payload=" + g.g(this.f47625K) + ", responseCommands=" + g.j((Byte[]) this.f47621G.toArray(new Byte[0])) + "}";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @d
    public final a u() {
        return this.f47620F;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @d
    public final LinkedList<Byte> v() {
        return this.f47621G;
    }

    protected final void w(@d a aVar) {
        F.p(aVar, "<set-?>");
        this.f47620F = aVar;
    }

    protected final void x(@d LinkedList<Byte> linkedList) {
        F.p(linkedList, "<set-?>");
        this.f47621G = linkedList;
    }

    public BaseCommand(@d byte[] buffer) {
        byte[] bArr;
        int B3;
        F.p(buffer, "buffer");
        this.f47619E = new HashMap<>();
        this.f47620F = new a();
        this.f47621G = new LinkedList<>();
        this.f47622H = (byte) -86;
        this.f47623I = 50L;
        this.f47624J = (byte) 17;
        if (buffer.length > 2) {
            this.f47624J = buffer[1];
            int parseInt = Integer.parseInt(g.g(new byte[]{buffer[2]}), 16);
            if (parseInt <= 0 || buffer.length <= 3) {
                bArr = null;
            } else {
                B3 = u.B(buffer.length - 3, parseInt);
                bArr = new byte[B3];
                System.arraycopy(buffer, 3, bArr, 0, parseInt);
            }
            this.f47625K = bArr;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public BaseCommand(@l3.d java.lang.String r2) {
        /*
            r1 = this;
            java.lang.String r0 = "hexString"
            kotlin.jvm.internal.F.p(r2, r0)
            char[] r2 = r2.toCharArray()
            java.lang.String r0 = "toCharArray(...)"
            kotlin.jvm.internal.F.o(r2, r0)
            byte[] r2 = com.harman.sdk.utils.g.f(r2)
            java.lang.String r0 = "decodeHex(...)"
            kotlin.jvm.internal.F.o(r2, r0)
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.harman.sdk.command.BaseCommand.<init>(java.lang.String):void");
    }
}
