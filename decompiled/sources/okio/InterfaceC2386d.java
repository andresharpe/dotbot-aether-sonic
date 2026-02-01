package okio;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.channels.WritableByteChannel;
import java.nio.charset.Charset;

/* renamed from: okio.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC2386d extends y, WritableByteChannel {
    InterfaceC2386d B(int i4) throws IOException;

    InterfaceC2386d E(long j4) throws IOException;

    InterfaceC2386d J0(byte[] bArr) throws IOException;

    InterfaceC2386d L0(ByteString byteString) throws IOException;

    InterfaceC2386d M(int i4) throws IOException;

    InterfaceC2386d O(int i4) throws IOException;

    InterfaceC2386d U0(String str, int i4, int i5, Charset charset) throws IOException;

    InterfaceC2386d W0(long j4) throws IOException;

    InterfaceC2386d Y() throws IOException;

    InterfaceC2386d Z0(long j4) throws IOException;

    OutputStream b1();

    InterfaceC2386d d0(int i4) throws IOException;

    @Override // okio.y, java.io.Flushable
    void flush() throws IOException;

    C2385c g();

    InterfaceC2386d g0(String str) throws IOException;

    InterfaceC2386d l0(byte[] bArr, int i4, int i5) throws IOException;

    InterfaceC2386d p0(String str, int i4, int i5) throws IOException;

    long q0(z zVar) throws IOException;

    InterfaceC2386d r0(long j4) throws IOException;

    InterfaceC2386d t0(String str, Charset charset) throws IOException;

    InterfaceC2386d w() throws IOException;

    InterfaceC2386d w0(z zVar, long j4) throws IOException;

    InterfaceC2386d x(int i4) throws IOException;

    InterfaceC2386d y(int i4) throws IOException;
}
