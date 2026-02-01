package okio;

import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;
import javax.annotation.Nullable;

/* loaded from: classes2.dex */
public interface e extends z, ReadableByteChannel {
    String A0() throws IOException;

    int C0() throws IOException;

    boolean D0(long j4, ByteString byteString, int i4, int i5) throws IOException;

    byte[] G0(long j4) throws IOException;

    String H0() throws IOException;

    byte[] I() throws IOException;

    long K(ByteString byteString) throws IOException;

    String K0(long j4, Charset charset) throws IOException;

    C2385c L();

    boolean N() throws IOException;

    short N0() throws IOException;

    long Q0() throws IOException;

    long R0(y yVar) throws IOException;

    long S(byte b4, long j4) throws IOException;

    void T(C2385c c2385c, long j4) throws IOException;

    long U(byte b4, long j4, long j5) throws IOException;

    long V0(ByteString byteString, long j4) throws IOException;

    long W(ByteString byteString) throws IOException;

    @Nullable
    String X() throws IOException;

    void X0(long j4) throws IOException;

    long Z() throws IOException;

    String b0(long j4) throws IOException;

    long c1(byte b4) throws IOException;

    long d1() throws IOException;

    InputStream e1();

    @Deprecated
    C2385c g();

    int g1(p pVar) throws IOException;

    boolean j0(long j4, ByteString byteString) throws IOException;

    String k0(Charset charset) throws IOException;

    int m0() throws IOException;

    e peek();

    String q(long j4) throws IOException;

    int read(byte[] bArr) throws IOException;

    int read(byte[] bArr, int i4, int i5) throws IOException;

    byte readByte() throws IOException;

    void readFully(byte[] bArr) throws IOException;

    int readInt() throws IOException;

    long readLong() throws IOException;

    short readShort() throws IOException;

    long s(ByteString byteString, long j4) throws IOException;

    ByteString s0() throws IOException;

    void skip(long j4) throws IOException;

    ByteString u(long j4) throws IOException;

    boolean v0(long j4) throws IOException;
}
