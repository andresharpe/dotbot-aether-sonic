package androidx.exifinterface.media;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.location.Location;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.constraintlayout.core.motion.utils.v;
import androidx.core.view.D;
import com.google.firebase.remoteconfig.l;
import com.harman.sdk.message.GestureInfo;
import com.harman.sdk.utils.k;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.CRC32;

/* loaded from: classes.dex */
public class a {

    /* renamed from: A, reason: collision with root package name */
    public static final String f14596A = "ImageLength";

    /* renamed from: A0, reason: collision with root package name */
    @Deprecated
    public static final String f14597A0 = "ISOSpeedRatings";

    /* renamed from: A1, reason: collision with root package name */
    public static final String f14598A1 = "GPSLatitudeRef";

    /* renamed from: A2, reason: collision with root package name */
    private static final String f14599A2 = "InteroperabilityIFDPointer";
    public static final short A3 = 3;
    public static final short A4 = 0;
    public static final int A5 = 0;
    private static final int A6 = 6;
    private static final byte A7 = -54;

    /* renamed from: B, reason: collision with root package name */
    public static final String f14600B = "BitsPerSample";

    /* renamed from: B0, reason: collision with root package name */
    public static final String f14601B0 = "PhotographicSensitivity";

    /* renamed from: B1, reason: collision with root package name */
    public static final String f14602B1 = "GPSLatitude";

    /* renamed from: B2, reason: collision with root package name */
    private static final String f14603B2 = "SubIFDPointer";
    public static final short B3 = 4;
    public static final short B4 = 1;
    public static final int B5 = 1;
    private static final int B6 = 7;
    private static final byte B7 = -53;

    /* renamed from: C, reason: collision with root package name */
    public static final String f14604C = "Compression";

    /* renamed from: C0, reason: collision with root package name */
    public static final String f14605C0 = "OECF";

    /* renamed from: C1, reason: collision with root package name */
    public static final String f14606C1 = "GPSLongitudeRef";

    /* renamed from: C2, reason: collision with root package name */
    private static final String f14607C2 = "CameraSettingsIFDPointer";
    public static final short C3 = 9;
    public static final short C4 = 2;
    public static final int C5 = 0;
    private static final int C6 = 8;
    private static final byte C7 = -51;

    /* renamed from: D, reason: collision with root package name */
    public static final String f14608D = "PhotometricInterpretation";

    /* renamed from: D0, reason: collision with root package name */
    public static final String f14609D0 = "SensitivityType";

    /* renamed from: D1, reason: collision with root package name */
    public static final String f14610D1 = "GPSLongitude";

    /* renamed from: D2, reason: collision with root package name */
    private static final String f14611D2 = "ImageProcessingIFDPointer";
    public static final short D3 = 10;
    public static final short D4 = 3;
    public static final int D5 = 1;
    private static final int D6 = 9;
    private static final byte D7 = -50;

    /* renamed from: E, reason: collision with root package name */
    public static final String f14612E = "Orientation";

    /* renamed from: E0, reason: collision with root package name */
    public static final String f14613E0 = "StandardOutputSensitivity";

    /* renamed from: E1, reason: collision with root package name */
    public static final String f14614E1 = "GPSAltitudeRef";

    /* renamed from: E2, reason: collision with root package name */
    private static final int f14615E2 = 512;
    public static final short E3 = 11;
    public static final short E4 = 4;
    private static final int E5 = 5000;
    private static final int E6 = 10;
    private static final byte E7 = -49;

    /* renamed from: F, reason: collision with root package name */
    public static final String f14616F = "SamplesPerPixel";

    /* renamed from: F0, reason: collision with root package name */
    public static final String f14617F0 = "RecommendedExposureIndex";

    /* renamed from: F1, reason: collision with root package name */
    public static final String f14618F1 = "GPSAltitude";

    /* renamed from: F2, reason: collision with root package name */
    public static final int f14619F2 = 0;
    public static final short F3 = 12;
    public static final short F4 = 0;
    private static final int F6 = 11;
    private static final byte F7 = -38;

    /* renamed from: G, reason: collision with root package name */
    public static final String f14620G = "PlanarConfiguration";

    /* renamed from: G0, reason: collision with root package name */
    public static final String f14621G0 = "ISOSpeed";

    /* renamed from: G1, reason: collision with root package name */
    public static final String f14622G1 = "GPSTimeStamp";

    /* renamed from: G2, reason: collision with root package name */
    public static final int f14623G2 = 1;
    public static final short G3 = 13;
    public static final short G4 = 1;
    private static final String G5 = "FUJIFILMCCD-RAW";
    private static final int G6 = 12;
    static final byte G7 = -31;

    /* renamed from: H, reason: collision with root package name */
    public static final String f14624H = "YCbCrSubSampling";

    /* renamed from: H0, reason: collision with root package name */
    public static final String f14625H0 = "ISOSpeedLatitudeyyy";

    /* renamed from: H1, reason: collision with root package name */
    public static final String f14626H1 = "GPSSatellites";

    /* renamed from: H2, reason: collision with root package name */
    public static final int f14627H2 = 2;
    public static final short H3 = 14;
    public static final short H4 = 2;
    private static final int H5 = 84;
    private static final int H6 = 13;
    private static final byte H7 = -2;

    /* renamed from: I, reason: collision with root package name */
    public static final String f14628I = "YCbCrPositioning";

    /* renamed from: I0, reason: collision with root package name */
    public static final String f14629I0 = "ISOSpeedLatitudezzz";

    /* renamed from: I1, reason: collision with root package name */
    public static final String f14630I1 = "GPSStatus";

    /* renamed from: I2, reason: collision with root package name */
    public static final int f14631I2 = 3;
    public static final short I3 = 15;
    public static final short I4 = 0;
    private static final int I5 = 4;
    static final byte I7 = -39;

    /* renamed from: J, reason: collision with root package name */
    public static final String f14632J = "XResolution";

    /* renamed from: J0, reason: collision with root package name */
    public static final String f14633J0 = "ShutterSpeedValue";

    /* renamed from: J1, reason: collision with root package name */
    public static final String f14634J1 = "GPSMeasureMode";

    /* renamed from: J2, reason: collision with root package name */
    public static final int f14635J2 = 4;
    public static final short J3 = 16;
    public static final short J4 = 0;
    private static final int J7 = 0;

    /* renamed from: K, reason: collision with root package name */
    public static final String f14636K = "YResolution";

    /* renamed from: K0, reason: collision with root package name */
    public static final String f14637K0 = "ApertureValue";

    /* renamed from: K1, reason: collision with root package name */
    public static final String f14638K1 = "GPSDOP";

    /* renamed from: K2, reason: collision with root package name */
    public static final int f14639K2 = 5;
    public static final short K3 = 17;
    public static final short K4 = 0;
    private static final int K7 = 1;

    /* renamed from: L, reason: collision with root package name */
    public static final String f14640L = "ResolutionUnit";

    /* renamed from: L0, reason: collision with root package name */
    public static final String f14641L0 = "BrightnessValue";

    /* renamed from: L1, reason: collision with root package name */
    public static final String f14642L1 = "GPSSpeedRef";

    /* renamed from: L2, reason: collision with root package name */
    public static final int f14643L2 = 6;
    public static final short L3 = 18;
    public static final short L4 = 0;
    private static final f[] L6;
    private static final int L7 = 2;

    /* renamed from: M, reason: collision with root package name */
    public static final String f14644M = "StripOffsets";

    /* renamed from: M0, reason: collision with root package name */
    public static final String f14645M0 = "ExposureBiasValue";

    /* renamed from: M1, reason: collision with root package name */
    public static final String f14646M1 = "GPSSpeed";

    /* renamed from: M2, reason: collision with root package name */
    public static final int f14647M2 = 7;
    public static final short M3 = 19;
    public static final short M4 = 1;
    private static final short M5 = 20306;
    private static final f[] M6;
    private static final int M7 = 3;

    /* renamed from: N, reason: collision with root package name */
    public static final String f14648N = "RowsPerStrip";

    /* renamed from: N0, reason: collision with root package name */
    public static final String f14649N0 = "MaxApertureValue";

    /* renamed from: N1, reason: collision with root package name */
    public static final String f14650N1 = "GPSTrackRef";

    /* renamed from: N2, reason: collision with root package name */
    public static final int f14651N2 = 8;
    public static final short N3 = 20;
    public static final short N4 = 2;
    private static final short N5 = 21330;
    private static final f[] N6;
    private static final int N7 = 4;

    /* renamed from: O, reason: collision with root package name */
    public static final String f14652O = "StripByteCounts";

    /* renamed from: O0, reason: collision with root package name */
    public static final String f14653O0 = "SubjectDistance";

    /* renamed from: O1, reason: collision with root package name */
    public static final String f14654O1 = "GPSTrack";
    public static final short O3 = 21;
    public static final short O4 = 0;
    private static final f[] O6;
    private static final int O7 = 5;

    /* renamed from: P, reason: collision with root package name */
    public static final String f14656P = "JPEGInterchangeFormat";

    /* renamed from: P0, reason: collision with root package name */
    public static final String f14657P0 = "MeteringMode";

    /* renamed from: P1, reason: collision with root package name */
    public static final String f14658P1 = "GPSImgDirectionRef";
    public static final short P3 = 22;
    public static final short P4 = 1;
    private static final f[] P6;
    private static final int P7 = 6;

    /* renamed from: Q, reason: collision with root package name */
    public static final String f14660Q = "JPEGInterchangeFormatLength";

    /* renamed from: Q0, reason: collision with root package name */
    public static final String f14661Q0 = "LightSource";

    /* renamed from: Q1, reason: collision with root package name */
    public static final String f14662Q1 = "GPSImgDirection";

    /* renamed from: Q2, reason: collision with root package name */
    public static final short f14663Q2 = 1;
    public static final short Q3 = 23;
    public static final short Q4 = 2;
    private static final int Q5 = 8;
    private static final f Q6;
    private static final int Q7 = 7;

    /* renamed from: R, reason: collision with root package name */
    public static final String f14664R = "TransferFunction";

    /* renamed from: R0, reason: collision with root package name */
    public static final String f14665R0 = "Flash";

    /* renamed from: R1, reason: collision with root package name */
    public static final String f14666R1 = "GPSMapDatum";

    /* renamed from: R2, reason: collision with root package name */
    public static final short f14667R2 = 2;
    public static final short R3 = 24;
    public static final short R4 = 3;
    private static final int R5 = 12;
    private static final f[] R6;
    private static final int R7 = 8;

    /* renamed from: S, reason: collision with root package name */
    public static final String f14668S = "WhitePoint";

    /* renamed from: S0, reason: collision with root package name */
    public static final String f14669S0 = "SubjectArea";

    /* renamed from: S1, reason: collision with root package name */
    public static final String f14670S1 = "GPSDestLatitudeRef";

    /* renamed from: S2, reason: collision with root package name */
    public static final short f14671S2 = 1;
    public static final short S3 = 255;
    public static final String S4 = "N";
    private static final short S5 = 85;
    private static final f[] S6;
    private static final int S7 = 9;

    /* renamed from: T, reason: collision with root package name */
    public static final String f14672T = "PrimaryChromaticities";

    /* renamed from: T0, reason: collision with root package name */
    public static final String f14673T0 = "FocalLength";

    /* renamed from: T1, reason: collision with root package name */
    public static final String f14674T1 = "GPSDestLatitude";

    /* renamed from: T2, reason: collision with root package name */
    public static final short f14675T2 = 2;
    public static final short T3 = 1;
    public static final String T4 = "S";
    private static final String T5 = "PENTAX";
    private static final f[] T6;
    private static final int T7 = 10;

    /* renamed from: U, reason: collision with root package name */
    public static final String f14676U = "YCbCrCoefficients";

    /* renamed from: U0, reason: collision with root package name */
    public static final String f14677U0 = "FlashEnergy";

    /* renamed from: U1, reason: collision with root package name */
    public static final String f14678U1 = "GPSDestLongitudeRef";

    /* renamed from: U2, reason: collision with root package name */
    public static final short f14679U2 = 2;
    public static final short U3 = 4;
    public static final String U4 = "E";
    private static final int U5 = 6;
    private static final f[] U6;
    private static final int U7 = 11;

    /* renamed from: V, reason: collision with root package name */
    public static final String f14680V = "ReferenceBlackWhite";

    /* renamed from: V0, reason: collision with root package name */
    public static final String f14681V0 = "SpatialFrequencyResponse";

    /* renamed from: V1, reason: collision with root package name */
    public static final String f14682V1 = "GPSDestLongitude";

    /* renamed from: V2, reason: collision with root package name */
    public static final short f14683V2 = 3;
    public static final short V3 = 6;
    public static final String V4 = "W";
    static final int V6 = 0;
    private static final int V7 = 12;

    /* renamed from: W, reason: collision with root package name */
    public static final String f14684W = "DateTime";

    /* renamed from: W0, reason: collision with root package name */
    public static final String f14685W0 = "FocalPlaneXResolution";

    /* renamed from: W1, reason: collision with root package name */
    public static final String f14686W1 = "GPSDestBearingRef";

    /* renamed from: W2, reason: collision with root package name */
    public static final int f14687W2 = 1;
    public static final short W3 = 8;
    public static final short W4 = 0;
    private static final int W6 = 1;
    private static final int W7 = 13;

    /* renamed from: X, reason: collision with root package name */
    public static final String f14688X = "ImageDescription";

    /* renamed from: X0, reason: collision with root package name */
    public static final String f14689X0 = "FocalPlaneYResolution";

    /* renamed from: X1, reason: collision with root package name */
    public static final String f14690X1 = "GPSDestBearing";

    /* renamed from: X2, reason: collision with root package name */
    public static final int f14691X2 = 65535;
    public static final short X3 = 16;
    public static final short X4 = 1;
    private static final int X6 = 2;
    private static final int X7 = 14;

    /* renamed from: Y, reason: collision with root package name */
    public static final String f14692Y = "Make";

    /* renamed from: Y0, reason: collision with root package name */
    public static final String f14693Y0 = "FocalPlaneResolutionUnit";

    /* renamed from: Y1, reason: collision with root package name */
    public static final String f14694Y1 = "GPSDestDistanceRef";

    /* renamed from: Y2, reason: collision with root package name */
    public static final short f14695Y2 = 0;
    public static final short Y3 = 24;
    public static final String Y4 = "A";
    private static final int Y6 = 3;
    private static final Pattern Y7;

    /* renamed from: Z, reason: collision with root package name */
    public static final String f14696Z = "Model";

    /* renamed from: Z0, reason: collision with root package name */
    public static final String f14697Z0 = "SubjectLocation";

    /* renamed from: Z1, reason: collision with root package name */
    public static final String f14698Z1 = "GPSDestDistance";

    /* renamed from: Z2, reason: collision with root package name */
    public static final short f14699Z2 = 1;
    public static final short Z3 = 32;
    public static final String Z4 = "V";
    private static final int Z5 = 4;
    static final int Z6 = 4;
    private static final Pattern Z7;

    /* renamed from: a0, reason: collision with root package name */
    public static final String f14700a0 = "Software";

    /* renamed from: a1, reason: collision with root package name */
    public static final String f14701a1 = "ExposureIndex";

    /* renamed from: a2, reason: collision with root package name */
    public static final String f14702a2 = "GPSProcessingMethod";

    /* renamed from: a3, reason: collision with root package name */
    public static final short f14703a3 = 2;
    public static final short a4 = 64;
    public static final String a5 = "2";
    private static final int a6 = 4;
    static final int a7 = 5;

    /* renamed from: b0, reason: collision with root package name */
    public static final String f14704b0 = "Artist";

    /* renamed from: b1, reason: collision with root package name */
    public static final String f14705b1 = "SensingMethod";

    /* renamed from: b2, reason: collision with root package name */
    public static final String f14706b2 = "GPSAreaInformation";

    /* renamed from: b3, reason: collision with root package name */
    public static final short f14707b3 = 3;
    public static final short b4 = 1;
    public static final String b5 = "3";
    private static final int b7 = 6;

    /* renamed from: c0, reason: collision with root package name */
    public static final String f14708c0 = "Copyright";

    /* renamed from: c1, reason: collision with root package name */
    public static final String f14709c1 = "FileSource";

    /* renamed from: c2, reason: collision with root package name */
    public static final String f14710c2 = "GPSDateStamp";

    /* renamed from: c3, reason: collision with root package name */
    public static final short f14711c3 = 4;
    public static final short c4 = 2;
    public static final String c5 = "K";
    private static final int c7 = 7;

    /* renamed from: d0, reason: collision with root package name */
    public static final String f14712d0 = "ExifVersion";

    /* renamed from: d1, reason: collision with root package name */
    public static final String f14713d1 = "SceneType";

    /* renamed from: d2, reason: collision with root package name */
    public static final String f14714d2 = "GPSDifferential";

    /* renamed from: d3, reason: collision with root package name */
    public static final short f14715d3 = 5;
    public static final short d4 = 3;
    public static final String d5 = "M";
    private static final int d6 = 4;
    private static final int d7 = 8;

    /* renamed from: e0, reason: collision with root package name */
    public static final String f14716e0 = "FlashpixVersion";

    /* renamed from: e1, reason: collision with root package name */
    public static final String f14717e1 = "CFAPattern";

    /* renamed from: e2, reason: collision with root package name */
    public static final String f14718e2 = "GPSHPositioningError";

    /* renamed from: e3, reason: collision with root package name */
    public static final short f14719e3 = 6;
    public static final short e4 = 4;
    public static final String e5 = "N";
    private static final int e7 = 9;

    /* renamed from: f0, reason: collision with root package name */
    public static final String f14720f0 = "ColorSpace";

    /* renamed from: f1, reason: collision with root package name */
    public static final String f14721f1 = "CustomRendered";

    /* renamed from: f2, reason: collision with root package name */
    public static final String f14722f2 = "InteroperabilityIndex";

    /* renamed from: f3, reason: collision with root package name */
    public static final short f14723f3 = 7;
    public static final short f4 = 5;
    public static final String f5 = "T";
    static final f[][] f7;

    /* renamed from: g0, reason: collision with root package name */
    public static final String f14724g0 = "Gamma";

    /* renamed from: g1, reason: collision with root package name */
    public static final String f14725g1 = "ExposureMode";

    /* renamed from: g2, reason: collision with root package name */
    public static final String f14726g2 = "ThumbnailImageLength";

    /* renamed from: g3, reason: collision with root package name */
    public static final short f14727g3 = 8;
    public static final short g4 = 7;
    public static final String g5 = "M";
    private static final byte g6 = 47;
    private static final f[] g7;

    /* renamed from: h0, reason: collision with root package name */
    public static final String f14728h0 = "PixelXDimension";

    /* renamed from: h1, reason: collision with root package name */
    public static final String f14729h1 = "WhiteBalance";

    /* renamed from: h2, reason: collision with root package name */
    public static final String f14730h2 = "ThumbnailImageWidth";

    /* renamed from: h3, reason: collision with root package name */
    public static final short f14731h3 = 0;
    public static final short h4 = 8;
    public static final String h5 = "K";
    private static final f h7;

    /* renamed from: i0, reason: collision with root package name */
    public static final String f14732i0 = "PixelYDimension";

    /* renamed from: i1, reason: collision with root package name */
    public static final String f14733i1 = "DigitalZoomRatio";

    /* renamed from: i2, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String f14734i2 = "ThumbnailOrientation";

    /* renamed from: i3, reason: collision with root package name */
    public static final short f14735i3 = 1;
    public static final short i4 = 0;
    public static final String i5 = "M";
    private static final f i7;

    /* renamed from: j0, reason: collision with root package name */
    public static final String f14736j0 = "ComponentsConfiguration";

    /* renamed from: j1, reason: collision with root package name */
    public static final String f14737j1 = "FocalLengthIn35mmFilm";

    /* renamed from: j2, reason: collision with root package name */
    public static final String f14738j2 = "DNGVersion";

    /* renamed from: j3, reason: collision with root package name */
    public static final short f14739j3 = 2;
    public static final short j4 = 1;
    public static final String j5 = "N";
    private static final HashMap<Integer, f>[] j7;

    /* renamed from: k0, reason: collision with root package name */
    public static final String f14740k0 = "CompressedBitsPerPixel";

    /* renamed from: k1, reason: collision with root package name */
    public static final String f14741k1 = "SceneCaptureType";

    /* renamed from: k2, reason: collision with root package name */
    public static final String f14742k2 = "DefaultCropSize";

    /* renamed from: k3, reason: collision with root package name */
    public static final short f14743k3 = 3;
    public static final short k4 = 2;
    public static final short k5 = 0;
    private static final HashMap<String, f>[] k7;

    /* renamed from: l0, reason: collision with root package name */
    public static final String f14744l0 = "MakerNote";

    /* renamed from: l1, reason: collision with root package name */
    public static final String f14745l1 = "GainControl";

    /* renamed from: l2, reason: collision with root package name */
    public static final String f14746l2 = "ThumbnailImage";

    /* renamed from: l3, reason: collision with root package name */
    public static final short f14747l3 = 4;
    public static final short l4 = 3;
    public static final short l5 = 1;
    private static final HashSet<String> l7;

    /* renamed from: m0, reason: collision with root package name */
    public static final String f14748m0 = "UserComment";

    /* renamed from: m1, reason: collision with root package name */
    public static final String f14749m1 = "Contrast";

    /* renamed from: m2, reason: collision with root package name */
    public static final String f14750m2 = "PreviewImageStart";

    /* renamed from: m3, reason: collision with root package name */
    public static final short f14751m3 = 5;
    public static final short m4 = 1;
    public static final int m5 = 1;
    private static final HashMap<Integer, Integer> m7;

    /* renamed from: n0, reason: collision with root package name */
    public static final String f14752n0 = "RelatedSoundFile";

    /* renamed from: n1, reason: collision with root package name */
    public static final String f14753n1 = "Saturation";

    /* renamed from: n2, reason: collision with root package name */
    public static final String f14754n2 = "PreviewImageLength";

    /* renamed from: n3, reason: collision with root package name */
    public static final short f14755n3 = 6;
    public static final short n4 = 0;
    public static final int n5 = 2;
    private static final int n6 = 10;
    static final Charset n7;

    /* renamed from: o0, reason: collision with root package name */
    public static final String f14756o0 = "DateTimeOriginal";

    /* renamed from: o1, reason: collision with root package name */
    public static final String f14757o1 = "Sharpness";

    /* renamed from: o2, reason: collision with root package name */
    public static final String f14758o2 = "AspectFrame";

    /* renamed from: o3, reason: collision with root package name */
    public static final short f14759o3 = 7;
    public static final short o4 = 1;
    public static final int o5 = 6;
    private static final int o6 = 4;
    static final byte[] o7;

    /* renamed from: p0, reason: collision with root package name */
    public static final String f14760p0 = "DateTimeDigitized";

    /* renamed from: p1, reason: collision with root package name */
    public static final String f14761p1 = "DeviceSettingDescription";

    /* renamed from: p2, reason: collision with root package name */
    public static final String f14762p2 = "SensorBottomBorder";

    /* renamed from: p3, reason: collision with root package name */
    public static final short f14763p3 = 0;
    public static final short p4 = 0;
    public static final int p5 = 7;
    private static final int p6 = 4;
    private static final byte[] p7;

    /* renamed from: q0, reason: collision with root package name */
    public static final String f14764q0 = "OffsetTime";

    /* renamed from: q1, reason: collision with root package name */
    public static final String f14765q1 = "SubjectDistanceRange";

    /* renamed from: q2, reason: collision with root package name */
    public static final String f14766q2 = "SensorLeftBorder";

    /* renamed from: q3, reason: collision with root package name */
    public static final short f14767q3 = 1;
    public static final short q4 = 1;
    public static final int q5 = 8;
    private static SimpleDateFormat q6 = null;
    static final byte q7 = -1;

    /* renamed from: r0, reason: collision with root package name */
    public static final String f14768r0 = "OffsetTimeOriginal";

    /* renamed from: r1, reason: collision with root package name */
    public static final String f14769r1 = "ImageUniqueID";

    /* renamed from: r2, reason: collision with root package name */
    public static final String f14770r2 = "SensorRightBorder";

    /* renamed from: r3, reason: collision with root package name */
    public static final short f14771r3 = 2;
    public static final short r4 = 2;
    public static final int r5 = 32773;
    static final short r6 = 18761;

    /* renamed from: s0, reason: collision with root package name */
    public static final String f14772s0 = "OffsetTimeDigitized";

    /* renamed from: s1, reason: collision with root package name */
    @Deprecated
    public static final String f14773s1 = "CameraOwnerName";

    /* renamed from: s2, reason: collision with root package name */
    public static final String f14774s2 = "SensorTopBorder";

    /* renamed from: s3, reason: collision with root package name */
    public static final short f14775s3 = 3;

    @Deprecated
    public static final int s4 = 0;
    public static final int s5 = 34892;
    static final short s6 = 19789;
    private static final byte s7 = -64;

    /* renamed from: t0, reason: collision with root package name */
    public static final String f14776t0 = "SubSecTime";

    /* renamed from: t1, reason: collision with root package name */
    public static final String f14777t1 = "CameraOwnerName";

    /* renamed from: t2, reason: collision with root package name */
    public static final String f14778t2 = "ISO";
    public static final short t3 = 4;

    @Deprecated
    public static final int t4 = 1;
    private static final byte t7 = -63;

    /* renamed from: u0, reason: collision with root package name */
    public static final String f14779u0 = "SubSecTimeOriginal";

    /* renamed from: u1, reason: collision with root package name */
    public static final String f14780u1 = "BodySerialNumber";

    /* renamed from: u2, reason: collision with root package name */
    public static final String f14781u2 = "JpgFromRaw";
    public static final short u3 = 5;
    public static final short u4 = 0;
    private static final int u6 = 8;
    private static final byte u7 = -62;

    /* renamed from: v0, reason: collision with root package name */
    public static final String f14782v0 = "SubSecTimeDigitized";

    /* renamed from: v1, reason: collision with root package name */
    public static final String f14783v1 = "LensSpecification";

    /* renamed from: v2, reason: collision with root package name */
    public static final String f14784v2 = "Xmp";
    public static final short v3 = 6;
    public static final short v4 = 1;
    private static final int v6 = 1;
    private static final byte v7 = -61;

    /* renamed from: w0, reason: collision with root package name */
    public static final String f14785w0 = "ExposureTime";

    /* renamed from: w1, reason: collision with root package name */
    public static final String f14786w1 = "LensMake";

    /* renamed from: w2, reason: collision with root package name */
    public static final String f14787w2 = "NewSubfileType";
    public static final short w3 = 255;
    public static final short w4 = 0;
    public static final int w5 = 0;
    private static final int w6 = 2;
    private static final byte w7 = -59;

    /* renamed from: x0, reason: collision with root package name */
    public static final String f14789x0 = "FNumber";

    /* renamed from: x1, reason: collision with root package name */
    public static final String f14790x1 = "LensModel";

    /* renamed from: x2, reason: collision with root package name */
    public static final String f14791x2 = "SubfileType";
    public static final short x3 = 0;
    public static final short x4 = 1;
    public static final int x5 = 1;
    private static final int x6 = 3;
    private static final byte x7 = -58;

    /* renamed from: y0, reason: collision with root package name */
    public static final String f14793y0 = "ExposureProgram";

    /* renamed from: y1, reason: collision with root package name */
    public static final String f14794y1 = "LensSerialNumber";

    /* renamed from: y2, reason: collision with root package name */
    private static final String f14795y2 = "ExifIFDPointer";
    public static final short y3 = 1;
    public static final short y4 = 2;
    public static final int y5 = 2;
    private static final int y6 = 4;
    private static final byte y7 = -57;

    /* renamed from: z, reason: collision with root package name */
    public static final String f14796z = "ImageWidth";

    /* renamed from: z0, reason: collision with root package name */
    public static final String f14797z0 = "SpectralSensitivity";

    /* renamed from: z1, reason: collision with root package name */
    public static final String f14798z1 = "GPSVersionID";

    /* renamed from: z2, reason: collision with root package name */
    private static final String f14799z2 = "GPSInfoIFDPointer";
    public static final short z3 = 2;
    public static final short z4 = 3;
    public static final int z5 = 6;
    private static final int z6 = 5;
    private static final byte z7 = -55;

    /* renamed from: a, reason: collision with root package name */
    private String f14800a;

    /* renamed from: b, reason: collision with root package name */
    private FileDescriptor f14801b;

    /* renamed from: c, reason: collision with root package name */
    private AssetManager.AssetInputStream f14802c;

    /* renamed from: d, reason: collision with root package name */
    private int f14803d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f14804e;

    /* renamed from: f, reason: collision with root package name */
    private final HashMap<String, d>[] f14805f;

    /* renamed from: g, reason: collision with root package name */
    private Set<Integer> f14806g;

    /* renamed from: h, reason: collision with root package name */
    private ByteOrder f14807h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f14808i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f14809j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f14810k;

    /* renamed from: l, reason: collision with root package name */
    private int f14811l;

    /* renamed from: m, reason: collision with root package name */
    private int f14812m;

    /* renamed from: n, reason: collision with root package name */
    private byte[] f14813n;

    /* renamed from: o, reason: collision with root package name */
    private int f14814o;

    /* renamed from: p, reason: collision with root package name */
    private int f14815p;

    /* renamed from: q, reason: collision with root package name */
    private int f14816q;

    /* renamed from: r, reason: collision with root package name */
    private int f14817r;

    /* renamed from: s, reason: collision with root package name */
    private int f14818s;

    /* renamed from: t, reason: collision with root package name */
    private int f14819t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f14820u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f14821v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f14822w;

    /* renamed from: x, reason: collision with root package name */
    private static final String f14788x = "ExifInterface";

    /* renamed from: y, reason: collision with root package name */
    private static final boolean f14792y = Log.isLoggable(f14788x, 3);

    /* renamed from: O2, reason: collision with root package name */
    private static final List<Integer> f14655O2 = Arrays.asList(1, 6, 3, 8);

    /* renamed from: P2, reason: collision with root package name */
    private static final List<Integer> f14659P2 = Arrays.asList(2, 7, 4, 5);
    public static final int[] t5 = {8, 8, 8};
    public static final int[] u5 = {4};
    public static final int[] v5 = {8};
    private static final byte r7 = -40;
    static final byte[] F5 = {-1, r7, -1};
    private static final byte[] J5 = {k.f48590J0, k.f48720u1, 121, k.f48602N0};
    private static final byte[] K5 = {109, k.f48599M0, k.f48590J0, 49};
    private static final byte[] L5 = {k.f48596L0, k.f48587I0, k.f48599M0, 99};
    private static final byte[] O5 = {79, k.f48665g0, k.f48725w0, k.f48677j0, 80, 0};
    private static final byte[] P5 = {79, k.f48665g0, k.f48725w0, k.f48677j0, 80, 85, 83, 0, 73, 73};
    private static final byte[] V5 = {-119, 80, 78, k.f48653d0, 13, 10, 26, 10};
    private static final byte[] W5 = {k.f48587I0, k.f48614R0, 73, k.f48590J0};
    private static final byte[] X5 = {73, 72, k.f48645b0, 82};
    private static final byte[] Y5 = {73, 69, 78, k.f48645b0};
    private static final byte[] b6 = {82, 73, 70, 70};
    private static final byte[] c6 = {87, 69, 66, 80};
    private static final byte[] e6 = {69, k.f48614R0, 73, 70};
    static final byte t6 = 42;
    private static final byte[] f6 = {-99, 1, t6};
    private static final byte[] h6 = "VP8X".getBytes(Charset.defaultCharset());
    private static final byte[] i6 = "VP8L".getBytes(Charset.defaultCharset());
    private static final byte[] j6 = "VP8 ".getBytes(Charset.defaultCharset());
    private static final byte[] k6 = "ANIM".getBytes(Charset.defaultCharset());
    private static final byte[] l6 = "ANMF".getBytes(Charset.defaultCharset());
    private static final byte[] m6 = "XMP ".getBytes(Charset.defaultCharset());
    static final String[] I6 = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
    static final int[] J6 = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    static final byte[] K6 = {65, 83, 67, 73, 73, 0, 0, 0};

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.exifinterface.media.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0130a extends MediaDataSource {

        /* renamed from: E, reason: collision with root package name */
        long f14823E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ b f14824F;

        C0130a(b bVar) {
            this.f14824F = bVar;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        @Override // android.media.MediaDataSource
        public long getSize() throws IOException {
            return -1L;
        }

        @Override // android.media.MediaDataSource
        public int readAt(long j4, byte[] bArr, int i4, int i5) throws IOException {
            if (i5 == 0) {
                return 0;
            }
            if (j4 < 0) {
                return -1;
            }
            try {
                long j5 = this.f14823E;
                if (j5 != j4) {
                    if (j5 >= 0 && j4 >= j5 + this.f14824F.available()) {
                        return -1;
                    }
                    this.f14824F.d(j4);
                    this.f14823E = j4;
                }
                if (i5 > this.f14824F.available()) {
                    i5 = this.f14824F.available();
                }
                int read = this.f14824F.read(bArr, i4, i5);
                if (read >= 0) {
                    this.f14823E += read;
                    return read;
                }
            } catch (IOException unused) {
            }
            this.f14823E = -1L;
            return -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b extends InputStream implements DataInput {

        /* renamed from: I, reason: collision with root package name */
        private static final ByteOrder f14826I = ByteOrder.LITTLE_ENDIAN;

        /* renamed from: J, reason: collision with root package name */
        private static final ByteOrder f14827J = ByteOrder.BIG_ENDIAN;

        /* renamed from: E, reason: collision with root package name */
        private DataInputStream f14828E;

        /* renamed from: F, reason: collision with root package name */
        private ByteOrder f14829F;

        /* renamed from: G, reason: collision with root package name */
        final int f14830G;

        /* renamed from: H, reason: collision with root package name */
        int f14831H;

        public b(InputStream inputStream) throws IOException {
            this(inputStream, ByteOrder.BIG_ENDIAN);
        }

        public int a() {
            return this.f14830G;
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            return this.f14828E.available();
        }

        public int b() {
            return this.f14831H;
        }

        public long c() throws IOException {
            return readInt() & 4294967295L;
        }

        public void d(long j4) throws IOException {
            int i4 = this.f14831H;
            if (i4 > j4) {
                this.f14831H = 0;
                this.f14828E.reset();
                this.f14828E.mark(this.f14830G);
            } else {
                j4 -= i4;
            }
            int i5 = (int) j4;
            if (skipBytes(i5) == i5) {
            } else {
                throw new IOException("Couldn't seek up to the byteCount");
            }
        }

        public void f(ByteOrder byteOrder) {
            this.f14829F = byteOrder;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            this.f14831H++;
            return this.f14828E.read();
        }

        @Override // java.io.DataInput
        public boolean readBoolean() throws IOException {
            this.f14831H++;
            return this.f14828E.readBoolean();
        }

        @Override // java.io.DataInput
        public byte readByte() throws IOException {
            int i4 = this.f14831H + 1;
            this.f14831H = i4;
            if (i4 <= this.f14830G) {
                int read = this.f14828E.read();
                if (read >= 0) {
                    return (byte) read;
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public char readChar() throws IOException {
            this.f14831H += 2;
            return this.f14828E.readChar();
        }

        @Override // java.io.DataInput
        public double readDouble() throws IOException {
            return Double.longBitsToDouble(readLong());
        }

        @Override // java.io.DataInput
        public float readFloat() throws IOException {
            return Float.intBitsToFloat(readInt());
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr, int i4, int i5) throws IOException {
            int i6 = this.f14831H + i5;
            this.f14831H = i6;
            if (i6 <= this.f14830G) {
                if (this.f14828E.read(bArr, i4, i5) != i5) {
                    throw new IOException("Couldn't read up to the length of buffer");
                }
                return;
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public int readInt() throws IOException {
            int i4 = this.f14831H + 4;
            this.f14831H = i4;
            if (i4 <= this.f14830G) {
                int read = this.f14828E.read();
                int read2 = this.f14828E.read();
                int read3 = this.f14828E.read();
                int read4 = this.f14828E.read();
                if ((read | read2 | read3 | read4) >= 0) {
                    ByteOrder byteOrder = this.f14829F;
                    if (byteOrder == f14826I) {
                        return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                    }
                    if (byteOrder == f14827J) {
                        return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
                    }
                    throw new IOException("Invalid byte order: " + this.f14829F);
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public String readLine() throws IOException {
            Log.d(a.f14788x, "Currently unsupported");
            return null;
        }

        @Override // java.io.DataInput
        public long readLong() throws IOException {
            int i4 = this.f14831H + 8;
            this.f14831H = i4;
            if (i4 <= this.f14830G) {
                int read = this.f14828E.read();
                int read2 = this.f14828E.read();
                int read3 = this.f14828E.read();
                int read4 = this.f14828E.read();
                int read5 = this.f14828E.read();
                int read6 = this.f14828E.read();
                int read7 = this.f14828E.read();
                int read8 = this.f14828E.read();
                if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) >= 0) {
                    ByteOrder byteOrder = this.f14829F;
                    if (byteOrder == f14826I) {
                        return (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                    }
                    if (byteOrder == f14827J) {
                        return (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8) + read8;
                    }
                    throw new IOException("Invalid byte order: " + this.f14829F);
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public short readShort() throws IOException {
            int i4 = this.f14831H + 2;
            this.f14831H = i4;
            if (i4 <= this.f14830G) {
                int read = this.f14828E.read();
                int read2 = this.f14828E.read();
                if ((read | read2) >= 0) {
                    ByteOrder byteOrder = this.f14829F;
                    if (byteOrder == f14826I) {
                        return (short) ((read2 << 8) + read);
                    }
                    if (byteOrder == f14827J) {
                        return (short) ((read << 8) + read2);
                    }
                    throw new IOException("Invalid byte order: " + this.f14829F);
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public String readUTF() throws IOException {
            this.f14831H += 2;
            return this.f14828E.readUTF();
        }

        @Override // java.io.DataInput
        public int readUnsignedByte() throws IOException {
            this.f14831H++;
            return this.f14828E.readUnsignedByte();
        }

        @Override // java.io.DataInput
        public int readUnsignedShort() throws IOException {
            int i4 = this.f14831H + 2;
            this.f14831H = i4;
            if (i4 <= this.f14830G) {
                int read = this.f14828E.read();
                int read2 = this.f14828E.read();
                if ((read | read2) >= 0) {
                    ByteOrder byteOrder = this.f14829F;
                    if (byteOrder == f14826I) {
                        return (read2 << 8) + read;
                    }
                    if (byteOrder == f14827J) {
                        return (read << 8) + read2;
                    }
                    throw new IOException("Invalid byte order: " + this.f14829F);
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public int skipBytes(int i4) throws IOException {
            int min = Math.min(i4, this.f14830G - this.f14831H);
            int i5 = 0;
            while (i5 < min) {
                i5 += this.f14828E.skipBytes(min - i5);
            }
            this.f14831H += i5;
            return i5;
        }

        b(InputStream inputStream, ByteOrder byteOrder) throws IOException {
            this.f14829F = ByteOrder.BIG_ENDIAN;
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.f14828E = dataInputStream;
            int available = dataInputStream.available();
            this.f14830G = available;
            this.f14831H = 0;
            this.f14828E.mark(available);
            this.f14829F = byteOrder;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i4, int i5) throws IOException {
            int read = this.f14828E.read(bArr, i4, i5);
            this.f14831H += read;
            return read;
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr) throws IOException {
            int length = this.f14831H + bArr.length;
            this.f14831H = length;
            if (length <= this.f14830G) {
                if (this.f14828E.read(bArr, 0, bArr.length) != bArr.length) {
                    throw new IOException("Couldn't read up to the length of buffer");
                }
                return;
            }
            throw new EOFException();
        }

        public b(byte[] bArr) throws IOException {
            this(new ByteArrayInputStream(bArr));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c extends FilterOutputStream {

        /* renamed from: E, reason: collision with root package name */
        final OutputStream f14832E;

        /* renamed from: F, reason: collision with root package name */
        private ByteOrder f14833F;

        public c(OutputStream outputStream, ByteOrder byteOrder) {
            super(outputStream);
            this.f14832E = outputStream;
            this.f14833F = byteOrder;
        }

        public void a(ByteOrder byteOrder) {
            this.f14833F = byteOrder;
        }

        public void b(int i4) throws IOException {
            this.f14832E.write(i4);
        }

        public void c(int i4) throws IOException {
            ByteOrder byteOrder = this.f14833F;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.f14832E.write(i4 & 255);
                this.f14832E.write((i4 >>> 8) & 255);
                this.f14832E.write((i4 >>> 16) & 255);
                this.f14832E.write((i4 >>> 24) & 255);
                return;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                this.f14832E.write((i4 >>> 24) & 255);
                this.f14832E.write((i4 >>> 16) & 255);
                this.f14832E.write((i4 >>> 8) & 255);
                this.f14832E.write(i4 & 255);
            }
        }

        public void d(short s4) throws IOException {
            ByteOrder byteOrder = this.f14833F;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.f14832E.write(s4 & 255);
                this.f14832E.write((s4 >>> 8) & 255);
            } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
                this.f14832E.write((s4 >>> 8) & 255);
                this.f14832E.write(s4 & 255);
            }
        }

        public void f(long j4) throws IOException {
            c((int) j4);
        }

        public void h(int i4) throws IOException {
            d((short) i4);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr) throws IOException {
            this.f14832E.write(bArr);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr, int i4, int i5) throws IOException {
            this.f14832E.write(bArr, i4, i5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: e, reason: collision with root package name */
        public static final long f14834e = -1;

        /* renamed from: a, reason: collision with root package name */
        public final int f14835a;

        /* renamed from: b, reason: collision with root package name */
        public final int f14836b;

        /* renamed from: c, reason: collision with root package name */
        public final long f14837c;

        /* renamed from: d, reason: collision with root package name */
        public final byte[] f14838d;

        d(int i4, int i5, byte[] bArr) {
            this(i4, i5, -1L, bArr);
        }

        public static d a(String str) {
            if (str.length() == 1 && str.charAt(0) >= '0' && str.charAt(0) <= '1') {
                return new d(1, 1, new byte[]{(byte) (str.charAt(0) - '0')});
            }
            byte[] bytes = str.getBytes(a.n7);
            return new d(1, bytes.length, bytes);
        }

        public static d b(double d4, ByteOrder byteOrder) {
            return c(new double[]{d4}, byteOrder);
        }

        public static d c(double[] dArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[a.J6[12] * dArr.length]);
            wrap.order(byteOrder);
            for (double d4 : dArr) {
                wrap.putDouble(d4);
            }
            return new d(12, dArr.length, wrap.array());
        }

        public static d d(int i4, ByteOrder byteOrder) {
            return e(new int[]{i4}, byteOrder);
        }

        public static d e(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[a.J6[9] * iArr.length]);
            wrap.order(byteOrder);
            for (int i4 : iArr) {
                wrap.putInt(i4);
            }
            return new d(9, iArr.length, wrap.array());
        }

        public static d f(h hVar, ByteOrder byteOrder) {
            return g(new h[]{hVar}, byteOrder);
        }

        public static d g(h[] hVarArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[a.J6[10] * hVarArr.length]);
            wrap.order(byteOrder);
            for (h hVar : hVarArr) {
                wrap.putInt((int) hVar.f14843a);
                wrap.putInt((int) hVar.f14844b);
            }
            return new d(10, hVarArr.length, wrap.array());
        }

        public static d h(String str) {
            byte[] bytes = (str + (char) 0).getBytes(a.n7);
            return new d(2, bytes.length, bytes);
        }

        public static d i(long j4, ByteOrder byteOrder) {
            return j(new long[]{j4}, byteOrder);
        }

        public static d j(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[a.J6[4] * jArr.length]);
            wrap.order(byteOrder);
            for (long j4 : jArr) {
                wrap.putInt((int) j4);
            }
            return new d(4, jArr.length, wrap.array());
        }

        public static d k(h hVar, ByteOrder byteOrder) {
            return l(new h[]{hVar}, byteOrder);
        }

        public static d l(h[] hVarArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[a.J6[5] * hVarArr.length]);
            wrap.order(byteOrder);
            for (h hVar : hVarArr) {
                wrap.putInt((int) hVar.f14843a);
                wrap.putInt((int) hVar.f14844b);
            }
            return new d(5, hVarArr.length, wrap.array());
        }

        public static d m(int i4, ByteOrder byteOrder) {
            return n(new int[]{i4}, byteOrder);
        }

        public static d n(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[a.J6[3] * iArr.length]);
            wrap.order(byteOrder);
            for (int i4 : iArr) {
                wrap.putShort((short) i4);
            }
            return new d(3, iArr.length, wrap.array());
        }

        public double o(ByteOrder byteOrder) {
            Object r4 = r(byteOrder);
            if (r4 != null) {
                if (r4 instanceof String) {
                    return Double.parseDouble((String) r4);
                }
                if (r4 instanceof long[]) {
                    if (((long[]) r4).length == 1) {
                        return r5[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                }
                if (r4 instanceof int[]) {
                    if (((int[]) r4).length == 1) {
                        return r5[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                }
                if (r4 instanceof double[]) {
                    double[] dArr = (double[]) r4;
                    if (dArr.length == 1) {
                        return dArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                }
                if (r4 instanceof h[]) {
                    h[] hVarArr = (h[]) r4;
                    if (hVarArr.length == 1) {
                        return hVarArr[0].a();
                    }
                    throw new NumberFormatException("There are more than one component");
                }
                throw new NumberFormatException("Couldn't find a double value");
            }
            throw new NumberFormatException("NULL can't be converted to a double value");
        }

        public int p(ByteOrder byteOrder) {
            Object r4 = r(byteOrder);
            if (r4 != null) {
                if (r4 instanceof String) {
                    return Integer.parseInt((String) r4);
                }
                if (r4 instanceof long[]) {
                    long[] jArr = (long[]) r4;
                    if (jArr.length == 1) {
                        return (int) jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                }
                if (r4 instanceof int[]) {
                    int[] iArr = (int[]) r4;
                    if (iArr.length == 1) {
                        return iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                }
                throw new NumberFormatException("Couldn't find a integer value");
            }
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }

        public String q(ByteOrder byteOrder) {
            Object r4 = r(byteOrder);
            if (r4 == null) {
                return null;
            }
            if (r4 instanceof String) {
                return (String) r4;
            }
            StringBuilder sb = new StringBuilder();
            int i4 = 0;
            if (r4 instanceof long[]) {
                long[] jArr = (long[]) r4;
                while (i4 < jArr.length) {
                    sb.append(jArr[i4]);
                    i4++;
                    if (i4 != jArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (r4 instanceof int[]) {
                int[] iArr = (int[]) r4;
                while (i4 < iArr.length) {
                    sb.append(iArr[i4]);
                    i4++;
                    if (i4 != iArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (r4 instanceof double[]) {
                double[] dArr = (double[]) r4;
                while (i4 < dArr.length) {
                    sb.append(dArr[i4]);
                    i4++;
                    if (i4 != dArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (!(r4 instanceof h[])) {
                return null;
            }
            h[] hVarArr = (h[]) r4;
            while (i4 < hVarArr.length) {
                sb.append(hVarArr[i4].f14843a);
                sb.append('/');
                sb.append(hVarArr[i4].f14844b);
                i4++;
                if (i4 != hVarArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }

        /* JADX WARN: Not initialized variable reg: 3, insn: 0x0030: MOVE (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]) (LINE:49), block:B:167:0x0030 */
        /* JADX WARN: Removed duplicated region for block: B:170:0x0199 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        java.lang.Object r(java.nio.ByteOrder r11) {
            /*
                Method dump skipped, instructions count: 446
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.a.d.r(java.nio.ByteOrder):java.lang.Object");
        }

        public int s() {
            return a.J6[this.f14835a] * this.f14836b;
        }

        public String toString() {
            return "(" + a.I6[this.f14835a] + ", data length:" + this.f14838d.length + ")";
        }

        d(int i4, int i5, long j4, byte[] bArr) {
            this.f14835a = i4;
            this.f14836b = i5;
            this.f14837c = j4;
            this.f14838d = bArr;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* loaded from: classes.dex */
    public @interface e {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* loaded from: classes.dex */
    public @interface g {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class h {

        /* renamed from: a, reason: collision with root package name */
        public final long f14843a;

        /* renamed from: b, reason: collision with root package name */
        public final long f14844b;

        h(double d4) {
            this((long) (d4 * 10000.0d), 10000L);
        }

        public double a() {
            return this.f14843a / this.f14844b;
        }

        public String toString() {
            return this.f14843a + "/" + this.f14844b;
        }

        h(long j4, long j5) {
            if (j5 == 0) {
                this.f14843a = 0L;
                this.f14844b = 1L;
            } else {
                this.f14843a = j4;
                this.f14844b = j5;
            }
        }
    }

    static {
        f[] fVarArr = {new f(f14787w2, GestureInfo.f48245e0, 4), new f(f14791x2, 255, 4), new f(f14796z, 256, 3, 4), new f(f14596A, 257, 3, 4), new f(f14600B, 258, 3), new f(f14604C, 259, 3), new f(f14608D, 262, 3), new f(f14688X, 270, 2), new f(f14692Y, 271, 2), new f(f14696Z, 272, 2), new f(f14644M, 273, 3, 4), new f(f14612E, 274, 3), new f(f14616F, 277, 3), new f(f14648N, 278, 3, 4), new f(f14652O, 279, 3, 4), new f(f14632J, 282, 5), new f(f14636K, 283, 5), new f(f14620G, 284, 3), new f(f14640L, 296, 3), new f(f14664R, 301, 3), new f(f14700a0, 305, 2), new f(f14684W, 306, 2), new f(f14704b0, 315, 2), new f(f14668S, v.a.f7391s, 5), new f(f14672T, 319, 5), new f(f14603B2, 330, 4), new f(f14656P, D.f13113j, 4), new f(f14660Q, 514, 4), new f(f14676U, 529, 5), new f(f14624H, 530, 3), new f(f14628I, 531, 3), new f(f14680V, 532, 5), new f(f14708c0, 33432, 2), new f(f14795y2, 34665, 4), new f(f14799z2, 34853, 4), new f(f14774s2, 4, 4), new f(f14766q2, 5, 4), new f(f14762p2, 6, 4), new f(f14770r2, 7, 4), new f(f14778t2, 23, 3), new f(f14781u2, 46, 7), new f(f14784v2, v.h.f7546j, 1)};
        L6 = fVarArr;
        f[] fVarArr2 = {new f(f14785w0, 33434, 5), new f(f14789x0, 33437, 5), new f(f14793y0, 34850, 3), new f(f14797z0, 34852, 2), new f(f14601B0, 34855, 3), new f(f14605C0, 34856, 7), new f(f14609D0, 34864, 3), new f(f14613E0, 34865, 4), new f(f14617F0, 34866, 4), new f(f14621G0, 34867, 4), new f(f14625H0, 34868, 4), new f(f14629I0, 34869, 4), new f(f14712d0, 36864, 2), new f(f14756o0, 36867, 2), new f(f14760p0, 36868, 2), new f(f14764q0, 36880, 2), new f(f14768r0, 36881, 2), new f(f14772s0, 36882, 2), new f(f14736j0, 37121, 7), new f(f14740k0, 37122, 5), new f(f14633J0, 37377, 10), new f(f14637K0, 37378, 5), new f(f14641L0, 37379, 10), new f(f14645M0, 37380, 10), new f(f14649N0, 37381, 5), new f(f14653O0, 37382, 5), new f(f14657P0, 37383, 3), new f(f14661Q0, 37384, 3), new f(f14665R0, 37385, 3), new f(f14673T0, 37386, 5), new f(f14669S0, 37396, 3), new f(f14744l0, 37500, 7), new f(f14748m0, 37510, 7), new f(f14776t0, 37520, 2), new f(f14779u0, 37521, 2), new f(f14782v0, 37522, 2), new f(f14716e0, 40960, 7), new f(f14720f0, 40961, 3), new f(f14728h0, 40962, 3, 4), new f(f14732i0, 40963, 3, 4), new f(f14752n0, 40964, 2), new f(f14599A2, 40965, 4), new f(f14677U0, 41483, 5), new f(f14681V0, 41484, 7), new f(f14685W0, 41486, 5), new f(f14689X0, 41487, 5), new f(f14693Y0, 41488, 3), new f(f14697Z0, 41492, 3), new f(f14701a1, 41493, 5), new f(f14705b1, 41495, 3), new f(f14709c1, 41728, 7), new f(f14713d1, 41729, 7), new f(f14717e1, 41730, 7), new f(f14721f1, 41985, 3), new f(f14725g1, 41986, 3), new f(f14729h1, 41987, 3), new f(f14733i1, 41988, 5), new f(f14737j1, 41989, 3), new f(f14741k1, 41990, 3), new f(f14745l1, 41991, 3), new f(f14749m1, 41992, 3), new f(f14753n1, 41993, 3), new f(f14757o1, 41994, 3), new f(f14761p1, 41995, 7), new f(f14765q1, 41996, 3), new f(f14769r1, 42016, 2), new f("CameraOwnerName", 42032, 2), new f(f14780u1, 42033, 2), new f(f14783v1, 42034, 5), new f(f14786w1, 42035, 2), new f(f14790x1, 42036, 2), new f(f14724g0, 42240, 5), new f(f14738j2, 50706, 1), new f(f14742k2, 50720, 3, 4)};
        M6 = fVarArr2;
        f[] fVarArr3 = {new f(f14798z1, 0, 1), new f(f14598A1, 1, 2), new f(f14602B1, 2, 5), new f(f14606C1, 3, 2), new f(f14610D1, 4, 5), new f(f14614E1, 5, 1), new f(f14618F1, 6, 5), new f(f14622G1, 7, 5), new f(f14626H1, 8, 2), new f(f14630I1, 9, 2), new f(f14634J1, 10, 2), new f(f14638K1, 11, 5), new f(f14642L1, 12, 2), new f(f14646M1, 13, 5), new f(f14650N1, 14, 2), new f(f14654O1, 15, 5), new f(f14658P1, 16, 2), new f(f14662Q1, 17, 5), new f(f14666R1, 18, 2), new f(f14670S1, 19, 2), new f(f14674T1, 20, 5), new f(f14678U1, 21, 2), new f(f14682V1, 22, 5), new f(f14686W1, 23, 2), new f(f14690X1, 24, 5), new f(f14694Y1, 25, 2), new f(f14698Z1, 26, 5), new f(f14702a2, 27, 7), new f(f14706b2, 28, 7), new f(f14710c2, 29, 2), new f(f14714d2, 30, 3), new f(f14718e2, 31, 5)};
        N6 = fVarArr3;
        f[] fVarArr4 = {new f(f14722f2, 1, 2)};
        O6 = fVarArr4;
        f[] fVarArr5 = {new f(f14787w2, GestureInfo.f48245e0, 4), new f(f14791x2, 255, 4), new f(f14730h2, 256, 3, 4), new f(f14726g2, 257, 3, 4), new f(f14600B, 258, 3), new f(f14604C, 259, 3), new f(f14608D, 262, 3), new f(f14688X, 270, 2), new f(f14692Y, 271, 2), new f(f14696Z, 272, 2), new f(f14644M, 273, 3, 4), new f(f14734i2, 274, 3), new f(f14616F, 277, 3), new f(f14648N, 278, 3, 4), new f(f14652O, 279, 3, 4), new f(f14632J, 282, 5), new f(f14636K, 283, 5), new f(f14620G, 284, 3), new f(f14640L, 296, 3), new f(f14664R, 301, 3), new f(f14700a0, 305, 2), new f(f14684W, 306, 2), new f(f14704b0, 315, 2), new f(f14668S, v.a.f7391s, 5), new f(f14672T, 319, 5), new f(f14603B2, 330, 4), new f(f14656P, D.f13113j, 4), new f(f14660Q, 514, 4), new f(f14676U, 529, 5), new f(f14624H, 530, 3), new f(f14628I, 531, 3), new f(f14680V, 532, 5), new f(f14708c0, 33432, 2), new f(f14795y2, 34665, 4), new f(f14799z2, 34853, 4), new f(f14738j2, 50706, 1), new f(f14742k2, 50720, 3, 4)};
        P6 = fVarArr5;
        Q6 = new f(f14644M, 273, 3);
        f[] fVarArr6 = {new f(f14746l2, 256, 7), new f(f14607C2, 8224, 4), new f(f14611D2, 8256, 4)};
        R6 = fVarArr6;
        f[] fVarArr7 = {new f(f14750m2, 257, 4), new f(f14754n2, 258, 4)};
        S6 = fVarArr7;
        f[] fVarArr8 = {new f(f14758o2, 4371, 3)};
        T6 = fVarArr8;
        f[] fVarArr9 = {new f(f14720f0, 55, 3)};
        U6 = fVarArr9;
        f[][] fVarArr10 = {fVarArr, fVarArr2, fVarArr3, fVarArr4, fVarArr5, fVarArr, fVarArr6, fVarArr7, fVarArr8, fVarArr9};
        f7 = fVarArr10;
        g7 = new f[]{new f(f14603B2, 330, 4), new f(f14795y2, 34665, 4), new f(f14799z2, 34853, 4), new f(f14599A2, 40965, 4), new f(f14607C2, 8224, 1), new f(f14611D2, 8256, 1)};
        h7 = new f(f14656P, D.f13113j, 4);
        i7 = new f(f14660Q, 514, 4);
        j7 = new HashMap[fVarArr10.length];
        k7 = new HashMap[fVarArr10.length];
        l7 = new HashSet<>(Arrays.asList(f14789x0, f14733i1, f14785w0, f14653O0, f14622G1));
        m7 = new HashMap<>();
        Charset forName = Charset.forName("US-ASCII");
        n7 = forName;
        o7 = "Exif\u0000\u0000".getBytes(forName);
        p7 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
        q6 = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        int i8 = 0;
        while (true) {
            f[][] fVarArr11 = f7;
            if (i8 < fVarArr11.length) {
                j7[i8] = new HashMap<>();
                k7[i8] = new HashMap<>();
                for (f fVar : fVarArr11[i8]) {
                    j7[i8].put(Integer.valueOf(fVar.f14839a), fVar);
                    k7[i8].put(fVar.f14840b, fVar);
                }
                i8++;
            } else {
                HashMap<Integer, Integer> hashMap = m7;
                f[] fVarArr12 = g7;
                hashMap.put(Integer.valueOf(fVarArr12[0].f14839a), 5);
                hashMap.put(Integer.valueOf(fVarArr12[1].f14839a), 1);
                hashMap.put(Integer.valueOf(fVarArr12[2].f14839a), 2);
                hashMap.put(Integer.valueOf(fVarArr12[3].f14839a), 3);
                hashMap.put(Integer.valueOf(fVarArr12[4].f14839a), 7);
                hashMap.put(Integer.valueOf(fVarArr12[5].f14839a), 8);
                Y7 = Pattern.compile(".*[1-9].*");
                Z7 = Pattern.compile("^([0-9][0-9]):([0-9][0-9]):([0-9][0-9])$");
                return;
            }
        }
    }

    public a(@N File file) throws IOException {
        f[][] fVarArr = f7;
        this.f14805f = new HashMap[fVarArr.length];
        this.f14806g = new HashSet(fVarArr.length);
        this.f14807h = ByteOrder.BIG_ENDIAN;
        if (file != null) {
            U(file.getAbsolutePath());
            return;
        }
        throw new NullPointerException("file cannot be null");
    }

    private int C(BufferedInputStream bufferedInputStream) throws IOException {
        bufferedInputStream.mark(E5);
        byte[] bArr = new byte[E5];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        if (Y(bArr)) {
            return 4;
        }
        if (b0(bArr)) {
            return 9;
        }
        if (X(bArr)) {
            return 12;
        }
        if (Z(bArr)) {
            return 7;
        }
        if (c0(bArr)) {
            return 10;
        }
        if (a0(bArr)) {
            return 13;
        }
        if (j0(bArr)) {
            return 14;
        }
        return 0;
    }

    private void D(b bVar) throws IOException {
        int i8;
        int i9;
        G(bVar);
        d dVar = this.f14805f[1].get(f14744l0);
        if (dVar != null) {
            b bVar2 = new b(dVar.f14838d);
            bVar2.f(this.f14807h);
            byte[] bArr = O5;
            byte[] bArr2 = new byte[bArr.length];
            bVar2.readFully(bArr2);
            bVar2.d(0L);
            byte[] bArr3 = P5;
            byte[] bArr4 = new byte[bArr3.length];
            bVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                bVar2.d(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                bVar2.d(12L);
            }
            q0(bVar2, 6);
            d dVar2 = this.f14805f[7].get(f14750m2);
            d dVar3 = this.f14805f[7].get(f14754n2);
            if (dVar2 != null && dVar3 != null) {
                this.f14805f[5].put(f14656P, dVar2);
                this.f14805f[5].put(f14660Q, dVar3);
            }
            d dVar4 = this.f14805f[8].get(f14758o2);
            if (dVar4 != null) {
                int[] iArr = (int[]) dVar4.r(this.f14807h);
                if (iArr != null && iArr.length == 4) {
                    int i10 = iArr[2];
                    int i11 = iArr[0];
                    if (i10 > i11 && (i8 = iArr[3]) > (i9 = iArr[1])) {
                        int i12 = (i10 - i11) + 1;
                        int i13 = (i8 - i9) + 1;
                        if (i12 < i13) {
                            int i14 = i12 + i13;
                            i13 = i14 - i13;
                            i12 = i14 - i13;
                        }
                        d m8 = d.m(i12, this.f14807h);
                        d m9 = d.m(i13, this.f14807h);
                        this.f14805f[0].put(f14796z, m8);
                        this.f14805f[0].put(f14596A, m9);
                        return;
                    }
                    return;
                }
                Log.w(f14788x, "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
            }
        }
    }

    private void E(b bVar) throws IOException {
        if (f14792y) {
            Log.d(f14788x, "getPngAttributes starting with: " + bVar);
        }
        bVar.f(ByteOrder.BIG_ENDIAN);
        byte[] bArr = V5;
        bVar.skipBytes(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int readInt = bVar.readInt();
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) == 4) {
                    int i8 = length + 8;
                    if (i8 == 16 && !Arrays.equals(bArr2, X5)) {
                        throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                    }
                    if (!Arrays.equals(bArr2, Y5)) {
                        if (Arrays.equals(bArr2, W5)) {
                            byte[] bArr3 = new byte[readInt];
                            if (bVar.read(bArr3) == readInt) {
                                int readInt2 = bVar.readInt();
                                CRC32 crc32 = new CRC32();
                                crc32.update(bArr2);
                                crc32.update(bArr3);
                                if (((int) crc32.getValue()) == readInt2) {
                                    this.f14815p = i8;
                                    p0(bArr3, 0);
                                    I0();
                                    return;
                                } else {
                                    throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt2 + ", calculated CRC value: " + crc32.getValue());
                                }
                            }
                            throw new IOException("Failed to read given length for given PNG chunk type: " + b(bArr2));
                        }
                        int i9 = readInt + 4;
                        bVar.skipBytes(i9);
                        length = i8 + i9;
                    } else {
                        return;
                    }
                } else {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    private void E0(b bVar) throws IOException {
        HashMap<String, d> hashMap = this.f14805f[4];
        d dVar = hashMap.get(f14604C);
        if (dVar != null) {
            int p8 = dVar.p(this.f14807h);
            this.f14814o = p8;
            if (p8 != 1) {
                if (p8 != 6) {
                    if (p8 != 7) {
                        return;
                    }
                } else {
                    Q(bVar, hashMap);
                    return;
                }
            }
            if (e0(hashMap)) {
                R(bVar, hashMap);
                return;
            }
            return;
        }
        this.f14814o = 6;
        Q(bVar, hashMap);
    }

    private void F(b bVar) throws IOException {
        bVar.skipBytes(H5);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        bVar.read(bArr);
        bVar.skipBytes(4);
        bVar.read(bArr2);
        int i8 = ByteBuffer.wrap(bArr).getInt();
        int i9 = ByteBuffer.wrap(bArr2).getInt();
        z(bVar, i8, 5);
        bVar.d(i9);
        bVar.f(ByteOrder.BIG_ENDIAN);
        int readInt = bVar.readInt();
        if (f14792y) {
            Log.d(f14788x, "numberOfDirectoryEntry: " + readInt);
        }
        for (int i10 = 0; i10 < readInt; i10++) {
            int readUnsignedShort = bVar.readUnsignedShort();
            int readUnsignedShort2 = bVar.readUnsignedShort();
            if (readUnsignedShort == Q6.f14839a) {
                short readShort = bVar.readShort();
                short readShort2 = bVar.readShort();
                d m8 = d.m(readShort, this.f14807h);
                d m9 = d.m(readShort2, this.f14807h);
                this.f14805f[0].put(f14596A, m8);
                this.f14805f[0].put(f14796z, m9);
                if (f14792y) {
                    Log.d(f14788x, "Updated to length: " + ((int) readShort) + ", width: " + ((int) readShort2));
                    return;
                }
                return;
            }
            bVar.skipBytes(readUnsignedShort2);
        }
    }

    private static boolean F0(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null || bArr.length < bArr2.length) {
            return false;
        }
        for (int i8 = 0; i8 < bArr2.length; i8++) {
            if (bArr[i8] != bArr2[i8]) {
                return false;
            }
        }
        return true;
    }

    private void G(b bVar) throws IOException {
        d dVar;
        m0(bVar, bVar.available());
        q0(bVar, 0);
        H0(bVar, 0);
        H0(bVar, 5);
        H0(bVar, 4);
        I0();
        if (this.f14803d == 8 && (dVar = this.f14805f[1].get(f14744l0)) != null) {
            b bVar2 = new b(dVar.f14838d);
            bVar2.f(this.f14807h);
            bVar2.d(6L);
            q0(bVar2, 9);
            d dVar2 = this.f14805f[9].get(f14720f0);
            if (dVar2 != null) {
                this.f14805f[1].put(f14720f0, dVar2);
            }
        }
    }

    private void G0(int i8, int i9) throws IOException {
        if (!this.f14805f[i8].isEmpty() && !this.f14805f[i9].isEmpty()) {
            d dVar = this.f14805f[i8].get(f14596A);
            d dVar2 = this.f14805f[i8].get(f14796z);
            d dVar3 = this.f14805f[i9].get(f14596A);
            d dVar4 = this.f14805f[i9].get(f14796z);
            if (dVar != null && dVar2 != null) {
                if (dVar3 != null && dVar4 != null) {
                    int p8 = dVar.p(this.f14807h);
                    int p9 = dVar2.p(this.f14807h);
                    int p10 = dVar3.p(this.f14807h);
                    int p11 = dVar4.p(this.f14807h);
                    if (p8 < p10 && p9 < p11) {
                        HashMap<String, d>[] hashMapArr = this.f14805f;
                        HashMap<String, d> hashMap = hashMapArr[i8];
                        hashMapArr[i8] = hashMapArr[i9];
                        hashMapArr[i9] = hashMap;
                        return;
                    }
                    return;
                }
                if (f14792y) {
                    Log.d(f14788x, "Second image does not contain valid size information");
                    return;
                }
                return;
            }
            if (f14792y) {
                Log.d(f14788x, "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (f14792y) {
            Log.d(f14788x, "Cannot perform swap since only one image data exists");
        }
    }

    private void H0(b bVar, int i8) throws IOException {
        d m8;
        d m9;
        d dVar = this.f14805f[i8].get(f14742k2);
        d dVar2 = this.f14805f[i8].get(f14774s2);
        d dVar3 = this.f14805f[i8].get(f14766q2);
        d dVar4 = this.f14805f[i8].get(f14762p2);
        d dVar5 = this.f14805f[i8].get(f14770r2);
        if (dVar != null) {
            if (dVar.f14835a == 5) {
                h[] hVarArr = (h[]) dVar.r(this.f14807h);
                if (hVarArr != null && hVarArr.length == 2) {
                    m8 = d.k(hVarArr[0], this.f14807h);
                    m9 = d.k(hVarArr[1], this.f14807h);
                } else {
                    Log.w(f14788x, "Invalid crop size values. cropSize=" + Arrays.toString(hVarArr));
                    return;
                }
            } else {
                int[] iArr = (int[]) dVar.r(this.f14807h);
                if (iArr != null && iArr.length == 2) {
                    m8 = d.m(iArr[0], this.f14807h);
                    m9 = d.m(iArr[1], this.f14807h);
                } else {
                    Log.w(f14788x, "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
            }
            this.f14805f[i8].put(f14796z, m8);
            this.f14805f[i8].put(f14596A, m9);
            return;
        }
        if (dVar2 != null && dVar3 != null && dVar4 != null && dVar5 != null) {
            int p8 = dVar2.p(this.f14807h);
            int p9 = dVar4.p(this.f14807h);
            int p10 = dVar5.p(this.f14807h);
            int p11 = dVar3.p(this.f14807h);
            if (p9 > p8 && p10 > p11) {
                d m10 = d.m(p9 - p8, this.f14807h);
                d m11 = d.m(p10 - p11, this.f14807h);
                this.f14805f[i8].put(f14596A, m10);
                this.f14805f[i8].put(f14796z, m11);
                return;
            }
            return;
        }
        t0(bVar, i8);
    }

    private void I(b bVar) throws IOException {
        G(bVar);
        if (this.f14805f[0].get(f14781u2) != null) {
            z(bVar, this.f14819t, 5);
        }
        d dVar = this.f14805f[0].get(f14778t2);
        d dVar2 = this.f14805f[1].get(f14601B0);
        if (dVar != null && dVar2 == null) {
            this.f14805f[1].put(f14601B0, dVar);
        }
    }

    private void I0() throws IOException {
        G0(0, 5);
        G0(0, 4);
        G0(5, 4);
        d dVar = this.f14805f[1].get(f14728h0);
        d dVar2 = this.f14805f[1].get(f14732i0);
        if (dVar != null && dVar2 != null) {
            this.f14805f[0].put(f14796z, dVar);
            this.f14805f[0].put(f14596A, dVar2);
        }
        if (this.f14805f[4].isEmpty() && h0(this.f14805f[5])) {
            HashMap<String, d>[] hashMapArr = this.f14805f;
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap<>();
        }
        if (!h0(this.f14805f[4])) {
            Log.d(f14788x, "No image meets the size requirements of a thumbnail image.");
        }
    }

    private void J(b bVar) throws IOException {
        byte[] bArr = o7;
        bVar.skipBytes(bArr.length);
        byte[] bArr2 = new byte[bVar.available()];
        bVar.readFully(bArr2);
        this.f14815p = bArr.length;
        p0(bArr2, 0);
    }

    private int J0(c cVar) throws IOException {
        short s8;
        f[][] fVarArr = f7;
        int[] iArr = new int[fVarArr.length];
        int[] iArr2 = new int[fVarArr.length];
        for (f fVar : g7) {
            r0(fVar.f14840b);
        }
        r0(h7.f14840b);
        r0(i7.f14840b);
        for (int i8 = 0; i8 < f7.length; i8++) {
            for (Object obj : this.f14805f[i8].entrySet().toArray()) {
                Map.Entry entry = (Map.Entry) obj;
                if (entry.getValue() == null) {
                    this.f14805f[i8].remove(entry.getKey());
                }
            }
        }
        if (!this.f14805f[1].isEmpty()) {
            this.f14805f[0].put(g7[1].f14840b, d.i(0L, this.f14807h));
        }
        if (!this.f14805f[2].isEmpty()) {
            this.f14805f[0].put(g7[2].f14840b, d.i(0L, this.f14807h));
        }
        if (!this.f14805f[3].isEmpty()) {
            this.f14805f[1].put(g7[3].f14840b, d.i(0L, this.f14807h));
        }
        if (this.f14808i) {
            this.f14805f[4].put(h7.f14840b, d.i(0L, this.f14807h));
            this.f14805f[4].put(i7.f14840b, d.i(this.f14812m, this.f14807h));
        }
        for (int i9 = 0; i9 < f7.length; i9++) {
            Iterator<Map.Entry<String, d>> it = this.f14805f[i9].entrySet().iterator();
            int i10 = 0;
            while (it.hasNext()) {
                int s9 = it.next().getValue().s();
                if (s9 > 4) {
                    i10 += s9;
                }
            }
            iArr2[i9] = iArr2[i9] + i10;
        }
        int i11 = 8;
        for (int i12 = 0; i12 < f7.length; i12++) {
            if (!this.f14805f[i12].isEmpty()) {
                iArr[i12] = i11;
                i11 += (this.f14805f[i12].size() * 12) + 6 + iArr2[i12];
            }
        }
        if (this.f14808i) {
            this.f14805f[4].put(h7.f14840b, d.i(i11, this.f14807h));
            this.f14811l = this.f14815p + i11;
            i11 += this.f14812m;
        }
        if (this.f14803d == 4) {
            i11 += 8;
        }
        if (f14792y) {
            for (int i13 = 0; i13 < f7.length; i13++) {
                Log.d(f14788x, String.format("index: %d, offsets: %d, tag count: %d, data sizes: %d, total size: %d", Integer.valueOf(i13), Integer.valueOf(iArr[i13]), Integer.valueOf(this.f14805f[i13].size()), Integer.valueOf(iArr2[i13]), Integer.valueOf(i11)));
            }
        }
        if (!this.f14805f[1].isEmpty()) {
            this.f14805f[0].put(g7[1].f14840b, d.i(iArr[1], this.f14807h));
        }
        if (!this.f14805f[2].isEmpty()) {
            this.f14805f[0].put(g7[2].f14840b, d.i(iArr[2], this.f14807h));
        }
        if (!this.f14805f[3].isEmpty()) {
            this.f14805f[1].put(g7[3].f14840b, d.i(iArr[3], this.f14807h));
        }
        int i14 = this.f14803d;
        if (i14 != 4) {
            if (i14 != 13) {
                if (i14 == 14) {
                    cVar.write(e6);
                    cVar.c(i11);
                }
            } else {
                cVar.c(i11);
                cVar.write(W5);
            }
        } else {
            cVar.h(i11);
            cVar.write(o7);
        }
        if (this.f14807h == ByteOrder.BIG_ENDIAN) {
            s8 = s6;
        } else {
            s8 = r6;
        }
        cVar.d(s8);
        cVar.a(this.f14807h);
        cVar.h(42);
        cVar.f(8L);
        for (int i15 = 0; i15 < f7.length; i15++) {
            if (!this.f14805f[i15].isEmpty()) {
                cVar.h(this.f14805f[i15].size());
                int size = iArr[i15] + 2 + (this.f14805f[i15].size() * 12) + 4;
                for (Map.Entry<String, d> entry2 : this.f14805f[i15].entrySet()) {
                    int i16 = k7[i15].get(entry2.getKey()).f14839a;
                    d value = entry2.getValue();
                    int s10 = value.s();
                    cVar.h(i16);
                    cVar.h(value.f14835a);
                    cVar.c(value.f14836b);
                    if (s10 > 4) {
                        cVar.f(size);
                        size += s10;
                    } else {
                        cVar.write(value.f14838d);
                        if (s10 < 4) {
                            while (s10 < 4) {
                                cVar.b(0);
                                s10++;
                            }
                        }
                    }
                }
                if (i15 == 0 && !this.f14805f[4].isEmpty()) {
                    cVar.f(iArr[4]);
                } else {
                    cVar.f(0L);
                }
                Iterator<Map.Entry<String, d>> it2 = this.f14805f[i15].entrySet().iterator();
                while (it2.hasNext()) {
                    byte[] bArr = it2.next().getValue().f14838d;
                    if (bArr.length > 4) {
                        cVar.write(bArr, 0, bArr.length);
                    }
                }
            }
        }
        if (this.f14808i) {
            cVar.write(M());
        }
        if (this.f14803d == 14 && i11 % 2 == 1) {
            cVar.b(0);
        }
        cVar.a(ByteOrder.BIG_ENDIAN);
        return i11;
    }

    private void O(b bVar) throws IOException {
        if (f14792y) {
            Log.d(f14788x, "getWebpAttributes starting with: " + bVar);
        }
        bVar.f(ByteOrder.LITTLE_ENDIAN);
        bVar.skipBytes(b6.length);
        int readInt = bVar.readInt() + 8;
        int skipBytes = bVar.skipBytes(c6.length) + 8;
        while (true) {
            try {
                byte[] bArr = new byte[4];
                if (bVar.read(bArr) == 4) {
                    int readInt2 = bVar.readInt();
                    int i8 = skipBytes + 8;
                    if (Arrays.equals(e6, bArr)) {
                        byte[] bArr2 = new byte[readInt2];
                        if (bVar.read(bArr2) == readInt2) {
                            this.f14815p = i8;
                            p0(bArr2, 0);
                            this.f14815p = i8;
                            return;
                        } else {
                            throw new IOException("Failed to read given length for given PNG chunk type: " + b(bArr));
                        }
                    }
                    if (readInt2 % 2 == 1) {
                        readInt2++;
                    }
                    int i9 = i8 + readInt2;
                    if (i9 == readInt) {
                        return;
                    }
                    if (i9 <= readInt) {
                        int skipBytes2 = bVar.skipBytes(readInt2);
                        if (skipBytes2 == readInt2) {
                            skipBytes = i8 + skipBytes2;
                        } else {
                            throw new IOException("Encountered WebP file with invalid chunk size");
                        }
                    } else {
                        throw new IOException("Encountered WebP file with invalid chunk size");
                    }
                } else {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    private static Pair<Integer, Integer> P(String str) {
        int intValue;
        int i8;
        if (str.contains(",")) {
            String[] split = str.split(",", -1);
            Pair<Integer, Integer> P8 = P(split[0]);
            if (((Integer) P8.first).intValue() == 2) {
                return P8;
            }
            for (int i9 = 1; i9 < split.length; i9++) {
                Pair<Integer, Integer> P9 = P(split[i9]);
                if (!((Integer) P9.first).equals(P8.first) && !((Integer) P9.second).equals(P8.first)) {
                    intValue = -1;
                } else {
                    intValue = ((Integer) P8.first).intValue();
                }
                if (((Integer) P8.second).intValue() != -1 && (((Integer) P9.first).equals(P8.second) || ((Integer) P9.second).equals(P8.second))) {
                    i8 = ((Integer) P8.second).intValue();
                } else {
                    i8 = -1;
                }
                if (intValue == -1 && i8 == -1) {
                    return new Pair<>(2, -1);
                }
                if (intValue == -1) {
                    P8 = new Pair<>(Integer.valueOf(i8), -1);
                } else if (i8 == -1) {
                    P8 = new Pair<>(Integer.valueOf(intValue), -1);
                }
            }
            return P8;
        }
        if (str.contains("/")) {
            String[] split2 = str.split("/", -1);
            if (split2.length == 2) {
                try {
                    long parseDouble = (long) Double.parseDouble(split2[0]);
                    long parseDouble2 = (long) Double.parseDouble(split2[1]);
                    if (parseDouble >= 0 && parseDouble2 >= 0) {
                        if (parseDouble <= 2147483647L && parseDouble2 <= 2147483647L) {
                            return new Pair<>(10, 5);
                        }
                        return new Pair<>(5, -1);
                    }
                    return new Pair<>(10, -1);
                } catch (NumberFormatException unused) {
                }
            }
            return new Pair<>(2, -1);
        }
        try {
            try {
                Long valueOf = Long.valueOf(Long.parseLong(str));
                if (valueOf.longValue() >= 0 && valueOf.longValue() <= 65535) {
                    return new Pair<>(3, 4);
                }
                if (valueOf.longValue() < 0) {
                    return new Pair<>(9, -1);
                }
                return new Pair<>(4, -1);
            } catch (NumberFormatException unused2) {
                return new Pair<>(2, -1);
            }
        } catch (NumberFormatException unused3) {
            Double.parseDouble(str);
            return new Pair<>(12, -1);
        }
    }

    private void Q(b bVar, HashMap hashMap) throws IOException {
        d dVar = (d) hashMap.get(f14656P);
        d dVar2 = (d) hashMap.get(f14660Q);
        if (dVar != null && dVar2 != null) {
            int p8 = dVar.p(this.f14807h);
            int p9 = dVar2.p(this.f14807h);
            if (this.f14803d == 7) {
                p8 += this.f14816q;
            }
            int min = Math.min(p9, bVar.a() - p8);
            if (p8 > 0 && min > 0) {
                this.f14808i = true;
                int i8 = this.f14815p + p8;
                this.f14811l = i8;
                this.f14812m = min;
                if (this.f14800a == null && this.f14802c == null && this.f14801b == null) {
                    byte[] bArr = new byte[min];
                    bVar.d(i8);
                    bVar.readFully(bArr);
                    this.f14813n = bArr;
                }
            }
            if (f14792y) {
                Log.d(f14788x, "Setting thumbnail attributes with offset: " + p8 + ", length: " + min);
            }
        }
    }

    private void R(b bVar, HashMap hashMap) throws IOException {
        d dVar = (d) hashMap.get(f14644M);
        d dVar2 = (d) hashMap.get(f14652O);
        if (dVar != null && dVar2 != null) {
            long[] g8 = g(dVar.r(this.f14807h));
            long[] g9 = g(dVar2.r(this.f14807h));
            if (g8 != null && g8.length != 0) {
                if (g9 != null && g9.length != 0) {
                    if (g8.length != g9.length) {
                        Log.w(f14788x, "stripOffsets and stripByteCounts should have same length.");
                        return;
                    }
                    long j8 = 0;
                    for (long j9 : g9) {
                        j8 += j9;
                    }
                    int i8 = (int) j8;
                    byte[] bArr = new byte[i8];
                    this.f14810k = true;
                    this.f14809j = true;
                    this.f14808i = true;
                    int i9 = 0;
                    int i10 = 0;
                    for (int i11 = 0; i11 < g8.length; i11++) {
                        int i12 = (int) g8[i11];
                        int i13 = (int) g9[i11];
                        if (i11 < g8.length - 1 && i12 + i13 != g8[i11 + 1]) {
                            this.f14810k = false;
                        }
                        int i14 = i12 - i9;
                        if (i14 < 0) {
                            Log.d(f14788x, "Invalid strip offset value");
                        }
                        bVar.d(i14);
                        int i15 = i9 + i14;
                        byte[] bArr2 = new byte[i13];
                        bVar.read(bArr2);
                        i9 = i15 + i13;
                        System.arraycopy(bArr2, 0, bArr, i10, i13);
                        i10 += i13;
                    }
                    this.f14813n = bArr;
                    if (this.f14810k) {
                        this.f14811l = ((int) g8[0]) + this.f14815p;
                        this.f14812m = i8;
                        return;
                    }
                    return;
                }
                Log.w(f14788x, "stripByteCounts should not be null or have zero length.");
                return;
            }
            Log.w(f14788x, "stripOffsets should not be null or have zero length.");
        }
    }

    private void U(String str) throws IOException {
        FileInputStream fileInputStream;
        if (str != null) {
            FileInputStream fileInputStream2 = null;
            this.f14802c = null;
            this.f14800a = str;
            try {
                fileInputStream = new FileInputStream(str);
            } catch (Throwable th) {
                th = th;
            }
            try {
                if (d0(fileInputStream.getFD())) {
                    this.f14801b = fileInputStream.getFD();
                } else {
                    this.f14801b = null;
                }
                k0(fileInputStream);
                d(fileInputStream);
                return;
            } catch (Throwable th2) {
                th = th2;
                fileInputStream2 = fileInputStream;
                d(fileInputStream2);
                throw th;
            }
        }
        throw new NullPointerException("filename cannot be null");
    }

    private static boolean V(BufferedInputStream bufferedInputStream) throws IOException {
        byte[] bArr = o7;
        bufferedInputStream.mark(bArr.length);
        byte[] bArr2 = new byte[bArr.length];
        bufferedInputStream.read(bArr2);
        bufferedInputStream.reset();
        int i8 = 0;
        while (true) {
            byte[] bArr3 = o7;
            if (i8 < bArr3.length) {
                if (bArr2[i8] != bArr3[i8]) {
                    return false;
                }
                i8++;
            } else {
                return true;
            }
        }
    }

    private boolean X(byte[] bArr) throws IOException {
        b bVar;
        long readInt;
        byte[] bArr2;
        long j8;
        b bVar2 = null;
        try {
            try {
                bVar = new b(bArr);
            } catch (Exception e8) {
                e = e8;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            readInt = bVar.readInt();
            bArr2 = new byte[4];
            bVar.read(bArr2);
        } catch (Exception e9) {
            e = e9;
            bVar2 = bVar;
            if (f14792y) {
                Log.d(f14788x, "Exception parsing HEIF file type box.", e);
            }
            if (bVar2 != null) {
                bVar2.close();
            }
            return false;
        } catch (Throwable th2) {
            th = th2;
            bVar2 = bVar;
            if (bVar2 != null) {
                bVar2.close();
            }
            throw th;
        }
        if (!Arrays.equals(bArr2, J5)) {
            bVar.close();
            return false;
        }
        if (readInt == 1) {
            readInt = bVar.readLong();
            j8 = 16;
            if (readInt < 16) {
                bVar.close();
                return false;
            }
        } else {
            j8 = 8;
        }
        if (readInt > bArr.length) {
            readInt = bArr.length;
        }
        long j9 = readInt - j8;
        if (j9 < 8) {
            bVar.close();
            return false;
        }
        byte[] bArr3 = new byte[4];
        boolean z8 = false;
        boolean z9 = false;
        for (long j10 = 0; j10 < j9 / 4; j10++) {
            if (bVar.read(bArr3) != 4) {
                bVar.close();
                return false;
            }
            if (j10 != 1) {
                if (Arrays.equals(bArr3, K5)) {
                    z8 = true;
                } else if (Arrays.equals(bArr3, L5)) {
                    z9 = true;
                }
                if (z8 && z9) {
                    bVar.close();
                    return true;
                }
            }
        }
        bVar.close();
        return false;
    }

    private static boolean Y(byte[] bArr) throws IOException {
        int i8 = 0;
        while (true) {
            byte[] bArr2 = F5;
            if (i8 < bArr2.length) {
                if (bArr[i8] != bArr2[i8]) {
                    return false;
                }
                i8++;
            } else {
                return true;
            }
        }
    }

    private boolean Z(byte[] bArr) throws IOException {
        boolean z8 = false;
        b bVar = null;
        try {
            b bVar2 = new b(bArr);
            try {
                ByteOrder o02 = o0(bVar2);
                this.f14807h = o02;
                bVar2.f(o02);
                short readShort = bVar2.readShort();
                if (readShort == 20306 || readShort == 21330) {
                    z8 = true;
                }
                bVar2.close();
                return z8;
            } catch (Exception unused) {
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                return false;
            } catch (Throwable th) {
                th = th;
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private void a() {
        String o8 = o(f14756o0);
        if (o8 != null && o(f14684W) == null) {
            this.f14805f[0].put(f14684W, d.h(o8));
        }
        if (o(f14796z) == null) {
            this.f14805f[0].put(f14796z, d.i(0L, this.f14807h));
        }
        if (o(f14596A) == null) {
            this.f14805f[0].put(f14596A, d.i(0L, this.f14807h));
        }
        if (o(f14612E) == null) {
            this.f14805f[0].put(f14612E, d.i(0L, this.f14807h));
        }
        if (o(f14661Q0) == null) {
            this.f14805f[1].put(f14661Q0, d.i(0L, this.f14807h));
        }
    }

    private boolean a0(byte[] bArr) throws IOException {
        int i8 = 0;
        while (true) {
            byte[] bArr2 = V5;
            if (i8 < bArr2.length) {
                if (bArr[i8] != bArr2[i8]) {
                    return false;
                }
                i8++;
            } else {
                return true;
            }
        }
    }

    private static String b(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b8 : bArr) {
            sb.append(String.format("%02x", Byte.valueOf(b8)));
        }
        return sb.toString();
    }

    private boolean b0(byte[] bArr) throws IOException {
        byte[] bytes = G5.getBytes(Charset.defaultCharset());
        for (int i8 = 0; i8 < bytes.length; i8++) {
            if (bArr[i8] != bytes[i8]) {
                return false;
            }
        }
        return true;
    }

    private static void c(FileDescriptor fileDescriptor) {
        try {
            Os.close(fileDescriptor);
        } catch (Exception unused) {
            Log.e(f14788x, "Error closing fd.");
        }
    }

    private boolean c0(byte[] bArr) throws IOException {
        boolean z8 = false;
        b bVar = null;
        try {
            b bVar2 = new b(bArr);
            try {
                ByteOrder o02 = o0(bVar2);
                this.f14807h = o02;
                bVar2.f(o02);
                if (bVar2.readShort() == 85) {
                    z8 = true;
                }
                bVar2.close();
                return z8;
            } catch (Exception unused) {
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                return false;
            } catch (Throwable th) {
                th = th;
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static void d(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e8) {
                throw e8;
            } catch (Exception unused) {
            }
        }
    }

    private static boolean d0(FileDescriptor fileDescriptor) {
        try {
            Os.lseek(fileDescriptor, 0L, OsConstants.SEEK_CUR);
            return true;
        } catch (Exception unused) {
            if (f14792y) {
                Log.d(f14788x, "The file descriptor for the given input is not seekable");
                return false;
            }
            return false;
        }
    }

    private String e(double d8) {
        long j8 = (long) d8;
        double d9 = d8 - j8;
        long j9 = (long) (d9 * 60.0d);
        return j8 + "/1," + j9 + "/1," + Math.round((d9 - (j9 / 60.0d)) * 3600.0d * 1.0E7d) + "/10000000";
    }

    private boolean e0(HashMap hashMap) throws IOException {
        d dVar;
        int p8;
        d dVar2 = (d) hashMap.get(f14600B);
        if (dVar2 != null) {
            int[] iArr = (int[]) dVar2.r(this.f14807h);
            int[] iArr2 = t5;
            if (Arrays.equals(iArr2, iArr)) {
                return true;
            }
            if (this.f14803d == 3 && (dVar = (d) hashMap.get(f14608D)) != null && (((p8 = dVar.p(this.f14807h)) == 1 && Arrays.equals(iArr, v5)) || (p8 == 6 && Arrays.equals(iArr, iArr2)))) {
                return true;
            }
        }
        if (f14792y) {
            Log.d(f14788x, "Unsupported data type value");
            return false;
        }
        return false;
    }

    private static double f(String str, String str2) {
        try {
            String[] split = str.split(",", -1);
            String[] split2 = split[0].split("/", -1);
            double parseDouble = Double.parseDouble(split2[0].trim()) / Double.parseDouble(split2[1].trim());
            String[] split3 = split[1].split("/", -1);
            double parseDouble2 = Double.parseDouble(split3[0].trim()) / Double.parseDouble(split3[1].trim());
            String[] split4 = split[2].split("/", -1);
            double parseDouble3 = parseDouble + (parseDouble2 / 60.0d) + ((Double.parseDouble(split4[0].trim()) / Double.parseDouble(split4[1].trim())) / 3600.0d);
            if (!str2.equals(T4) && !str2.equals(V4)) {
                if (!str2.equals("N") && !str2.equals(U4)) {
                    throw new IllegalArgumentException();
                }
                return parseDouble3;
            }
            return -parseDouble3;
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException unused) {
            throw new IllegalArgumentException();
        }
    }

    private boolean f0() {
        if (this.f14820u) {
            int i8 = this.f14803d;
            if (i8 == 4 || i8 == 13 || i8 == 14) {
                return true;
            }
            return false;
        }
        return false;
    }

    private static long[] g(Object obj) {
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            long[] jArr = new long[iArr.length];
            for (int i8 = 0; i8 < iArr.length; i8++) {
                jArr[i8] = iArr[i8];
            }
            return jArr;
        }
        if (obj instanceof long[]) {
            return (long[]) obj;
        }
        return null;
    }

    public static boolean g0(@N String str) {
        if (str != null) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.hashCode();
            char c8 = 65535;
            switch (lowerCase.hashCode()) {
                case -1875291391:
                    if (lowerCase.equals("image/x-fuji-raf")) {
                        c8 = 0;
                        break;
                    }
                    break;
                case -1635437028:
                    if (lowerCase.equals("image/x-samsung-srw")) {
                        c8 = 1;
                        break;
                    }
                    break;
                case -1594371159:
                    if (lowerCase.equals("image/x-sony-arw")) {
                        c8 = 2;
                        break;
                    }
                    break;
                case -1487464693:
                    if (lowerCase.equals("image/heic")) {
                        c8 = 3;
                        break;
                    }
                    break;
                case -1487464690:
                    if (lowerCase.equals("image/heif")) {
                        c8 = 4;
                        break;
                    }
                    break;
                case -1487394660:
                    if (lowerCase.equals("image/jpeg")) {
                        c8 = 5;
                        break;
                    }
                    break;
                case -1487018032:
                    if (lowerCase.equals("image/webp")) {
                        c8 = 6;
                        break;
                    }
                    break;
                case -1423313290:
                    if (lowerCase.equals("image/x-adobe-dng")) {
                        c8 = 7;
                        break;
                    }
                    break;
                case -985160897:
                    if (lowerCase.equals("image/x-panasonic-rw2")) {
                        c8 = '\b';
                        break;
                    }
                    break;
                case -879258763:
                    if (lowerCase.equals("image/png")) {
                        c8 = '\t';
                        break;
                    }
                    break;
                case -332763809:
                    if (lowerCase.equals("image/x-pentax-pef")) {
                        c8 = '\n';
                        break;
                    }
                    break;
                case 1378106698:
                    if (lowerCase.equals("image/x-olympus-orf")) {
                        c8 = 11;
                        break;
                    }
                    break;
                case 2099152104:
                    if (lowerCase.equals("image/x-nikon-nef")) {
                        c8 = '\f';
                        break;
                    }
                    break;
                case 2099152524:
                    if (lowerCase.equals("image/x-nikon-nrw")) {
                        c8 = '\r';
                        break;
                    }
                    break;
                case 2111234748:
                    if (lowerCase.equals("image/x-canon-cr2")) {
                        c8 = 14;
                        break;
                    }
                    break;
            }
            switch (c8) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case '\b':
                case '\t':
                case '\n':
                case 11:
                case '\f':
                case '\r':
                case 14:
                    return true;
                default:
                    return false;
            }
        }
        throw new NullPointerException("mimeType shouldn't be null");
    }

    private static int h(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[8192];
        int i8 = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                i8 += read;
                outputStream.write(bArr, 0, read);
            } else {
                return i8;
            }
        }
    }

    private boolean h0(HashMap hashMap) throws IOException {
        d dVar = (d) hashMap.get(f14596A);
        d dVar2 = (d) hashMap.get(f14796z);
        if (dVar != null && dVar2 != null) {
            int p8 = dVar.p(this.f14807h);
            int p9 = dVar2.p(this.f14807h);
            if (p8 <= 512 && p9 <= 512) {
                return true;
            }
            return false;
        }
        return false;
    }

    private static void i(InputStream inputStream, OutputStream outputStream, int i8) throws IOException {
        byte[] bArr = new byte[8192];
        while (i8 > 0) {
            int min = Math.min(i8, 8192);
            int read = inputStream.read(bArr, 0, min);
            if (read == min) {
                i8 -= read;
                outputStream.write(bArr, 0, read);
            } else {
                throw new IOException("Failed to copy the given amount of bytes from the inputstream to the output stream.");
            }
        }
    }

    private void j(b bVar, c cVar, byte[] bArr, byte[] bArr2) throws IOException {
        String str;
        while (true) {
            byte[] bArr3 = new byte[4];
            if (bVar.read(bArr3) != 4) {
                StringBuilder sb = new StringBuilder();
                sb.append("Encountered invalid length while copying WebP chunks up tochunk type ");
                Charset charset = n7;
                sb.append(new String(bArr, charset));
                if (bArr2 == null) {
                    str = "";
                } else {
                    str = " or " + new String(bArr2, charset);
                }
                sb.append(str);
                throw new IOException(sb.toString());
            }
            k(bVar, cVar, bArr3);
            if (!Arrays.equals(bArr3, bArr)) {
                if (bArr2 != null && Arrays.equals(bArr3, bArr2)) {
                    return;
                }
            } else {
                return;
            }
        }
    }

    private boolean j0(byte[] bArr) throws IOException {
        int i8 = 0;
        while (true) {
            byte[] bArr2 = b6;
            if (i8 < bArr2.length) {
                if (bArr[i8] != bArr2[i8]) {
                    return false;
                }
                i8++;
            } else {
                int i9 = 0;
                while (true) {
                    byte[] bArr3 = c6;
                    if (i9 < bArr3.length) {
                        if (bArr[b6.length + i9 + 4] != bArr3[i9]) {
                            return false;
                        }
                        i9++;
                    } else {
                        return true;
                    }
                }
            }
        }
    }

    private void k(b bVar, c cVar, byte[] bArr) throws IOException {
        int readInt = bVar.readInt();
        cVar.write(bArr);
        cVar.c(readInt);
        if (readInt % 2 == 1) {
            readInt++;
        }
        i(bVar, cVar, readInt);
    }

    private void k0(@N InputStream inputStream) {
        if (inputStream != null) {
            for (int i8 = 0; i8 < f7.length; i8++) {
                try {
                    try {
                        this.f14805f[i8] = new HashMap<>();
                    } catch (IOException e8) {
                        this.f14820u = false;
                        boolean z8 = f14792y;
                        if (z8) {
                            Log.w(f14788x, "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e8);
                        }
                        a();
                        if (!z8) {
                            return;
                        }
                    }
                } catch (Throwable th) {
                    a();
                    if (f14792y) {
                        n0();
                    }
                    throw th;
                }
            }
            if (!this.f14804e) {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, E5);
                this.f14803d = C(bufferedInputStream);
                inputStream = bufferedInputStream;
            }
            b bVar = new b(inputStream);
            if (!this.f14804e) {
                switch (this.f14803d) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 5:
                    case 6:
                    case 8:
                    case 11:
                        G(bVar);
                        break;
                    case 4:
                        z(bVar, 0, 0);
                        break;
                    case 7:
                        D(bVar);
                        break;
                    case 9:
                        F(bVar);
                        break;
                    case 10:
                        I(bVar);
                        break;
                    case 12:
                        y(bVar);
                        break;
                    case 13:
                        E(bVar);
                        break;
                    case 14:
                        O(bVar);
                        break;
                }
            } else {
                J(bVar);
            }
            E0(bVar);
            this.f14820u = true;
            a();
            if (!f14792y) {
                return;
            }
            n0();
            return;
        }
        throw new NullPointerException("inputstream shouldn't be null");
    }

    private static long l0(@P String str, @P String str2) {
        if (str != null && Y7.matcher(str).matches()) {
            try {
                Date parse = q6.parse(str, new ParsePosition(0));
                if (parse == null) {
                    return -1L;
                }
                long time = parse.getTime();
                if (str2 != null) {
                    try {
                        long parseLong = Long.parseLong(str2);
                        while (parseLong > 1000) {
                            parseLong /= 10;
                        }
                        return time + parseLong;
                    } catch (NumberFormatException unused) {
                        return time;
                    }
                }
                return time;
            } catch (IllegalArgumentException unused2) {
            }
        }
        return -1L;
    }

    private void m0(b bVar, int i8) throws IOException {
        ByteOrder o02 = o0(bVar);
        this.f14807h = o02;
        bVar.f(o02);
        int readUnsignedShort = bVar.readUnsignedShort();
        int i9 = this.f14803d;
        if (i9 != 7 && i9 != 10 && readUnsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(readUnsignedShort));
        }
        int readInt = bVar.readInt();
        if (readInt >= 8 && readInt < i8) {
            int i10 = readInt - 8;
            if (i10 > 0 && bVar.skipBytes(i10) != i10) {
                throw new IOException("Couldn't jump to first Ifd: " + i10);
            }
            return;
        }
        throw new IOException("Invalid first Ifd offset: " + readInt);
    }

    private void n0() {
        for (int i8 = 0; i8 < this.f14805f.length; i8++) {
            Log.d(f14788x, "The size of tag group[" + i8 + "]: " + this.f14805f[i8].size());
            for (Map.Entry<String, d> entry : this.f14805f[i8].entrySet()) {
                d value = entry.getValue();
                Log.d(f14788x, "tagName: " + entry.getKey() + ", tagType: " + value.toString() + ", tagValue: '" + value.q(this.f14807h) + "'");
            }
        }
    }

    private ByteOrder o0(b bVar) throws IOException {
        short readShort = bVar.readShort();
        if (readShort != 18761) {
            if (readShort == 19789) {
                if (f14792y) {
                    Log.d(f14788x, "readExifSegment: Byte Align MM");
                }
                return ByteOrder.BIG_ENDIAN;
            }
            throw new IOException("Invalid byte order: " + Integer.toHexString(readShort));
        }
        if (f14792y) {
            Log.d(f14788x, "readExifSegment: Byte Align II");
        }
        return ByteOrder.LITTLE_ENDIAN;
    }

    private void p0(byte[] bArr, int i8) throws IOException {
        b bVar = new b(bArr);
        m0(bVar, bArr.length);
        q0(bVar, i8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:91:0x0379, code lost:
    
        if (r5.p(r29.f14807h) == 65535) goto L130;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0389 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void q0(androidx.exifinterface.media.a.b r30, int r31) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1053
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.a.q0(androidx.exifinterface.media.a$b, int):void");
    }

    private void r0(String str) {
        for (int i8 = 0; i8 < f7.length; i8++) {
            this.f14805f[i8].remove(str);
        }
    }

    private void t0(b bVar, int i8) throws IOException {
        d dVar;
        d dVar2 = this.f14805f[i8].get(f14596A);
        d dVar3 = this.f14805f[i8].get(f14796z);
        if ((dVar2 == null || dVar3 == null) && (dVar = this.f14805f[i8].get(f14656P)) != null) {
            z(bVar, dVar.p(this.f14807h), i8);
        }
    }

    @P
    private d w(@N String str) {
        if (str != null) {
            if (f14597A0.equals(str)) {
                if (f14792y) {
                    Log.d(f14788x, "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
                }
                str = f14601B0;
            }
            for (int i8 = 0; i8 < f7.length; i8++) {
                d dVar = this.f14805f[i8].get(str);
                if (dVar != null) {
                    return dVar;
                }
            }
            return null;
        }
        throw new NullPointerException("tag shouldn't be null");
    }

    private void w0(InputStream inputStream, OutputStream outputStream) throws IOException {
        d dVar;
        if (f14792y) {
            Log.d(f14788x, "saveJpegAttributes starting with (inputStream: " + inputStream + ", outputStream: " + outputStream + ")");
        }
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        c cVar = new c(outputStream, ByteOrder.BIG_ENDIAN);
        if (dataInputStream.readByte() == -1) {
            cVar.b(-1);
            if (dataInputStream.readByte() == -40) {
                cVar.b(-40);
                if (o(f14784v2) != null && this.f14822w) {
                    dVar = this.f14805f[0].remove(f14784v2);
                } else {
                    dVar = null;
                }
                cVar.b(-1);
                cVar.b(-31);
                J0(cVar);
                if (dVar != null) {
                    this.f14805f[0].put(f14784v2, dVar);
                }
                byte[] bArr = new byte[4096];
                while (dataInputStream.readByte() == -1) {
                    byte readByte = dataInputStream.readByte();
                    if (readByte != -39 && readByte != -38) {
                        if (readByte != -31) {
                            cVar.b(-1);
                            cVar.b(readByte);
                            int readUnsignedShort = dataInputStream.readUnsignedShort();
                            cVar.h(readUnsignedShort);
                            int i8 = readUnsignedShort - 2;
                            if (i8 >= 0) {
                                while (i8 > 0) {
                                    int read = dataInputStream.read(bArr, 0, Math.min(i8, 4096));
                                    if (read >= 0) {
                                        cVar.write(bArr, 0, read);
                                        i8 -= read;
                                    }
                                }
                            } else {
                                throw new IOException("Invalid length");
                            }
                        } else {
                            int readUnsignedShort2 = dataInputStream.readUnsignedShort();
                            int i9 = readUnsignedShort2 - 2;
                            if (i9 >= 0) {
                                byte[] bArr2 = new byte[6];
                                if (i9 >= 6) {
                                    if (dataInputStream.read(bArr2) == 6) {
                                        if (Arrays.equals(bArr2, o7)) {
                                            int i10 = readUnsignedShort2 - 8;
                                            if (dataInputStream.skipBytes(i10) != i10) {
                                                throw new IOException("Invalid length");
                                            }
                                        }
                                    } else {
                                        throw new IOException("Invalid exif");
                                    }
                                }
                                cVar.b(-1);
                                cVar.b(readByte);
                                cVar.h(readUnsignedShort2);
                                if (i9 >= 6) {
                                    i9 = readUnsignedShort2 - 8;
                                    cVar.write(bArr2);
                                }
                                while (i9 > 0) {
                                    int read2 = dataInputStream.read(bArr, 0, Math.min(i9, 4096));
                                    if (read2 >= 0) {
                                        cVar.write(bArr, 0, read2);
                                        i9 -= read2;
                                    }
                                }
                            } else {
                                throw new IOException("Invalid length");
                            }
                        }
                    } else {
                        cVar.b(-1);
                        cVar.b(readByte);
                        h(dataInputStream, cVar);
                        return;
                    }
                }
                throw new IOException("Invalid marker");
            }
            throw new IOException("Invalid marker");
        }
        throw new IOException("Invalid marker");
    }

    private void x0(InputStream inputStream, OutputStream outputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream;
        if (f14792y) {
            Log.d(f14788x, "savePngAttributes starting with (inputStream: " + inputStream + ", outputStream: " + outputStream + ")");
        }
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        c cVar = new c(outputStream, byteOrder);
        i(dataInputStream, cVar, V5.length);
        if (this.f14815p == 0) {
            int readInt = dataInputStream.readInt();
            cVar.c(readInt);
            i(dataInputStream, cVar, readInt + 8);
        } else {
            i(dataInputStream, cVar, (r2 - r7.length) - 8);
            dataInputStream.skipBytes(dataInputStream.readInt() + 8);
        }
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
        } catch (Throwable th) {
            th = th;
        }
        try {
            c cVar2 = new c(byteArrayOutputStream, byteOrder);
            J0(cVar2);
            byte[] byteArray = ((ByteArrayOutputStream) cVar2.f14832E).toByteArray();
            cVar.write(byteArray);
            CRC32 crc32 = new CRC32();
            crc32.update(byteArray, 4, byteArray.length - 4);
            cVar.c((int) crc32.getValue());
            d(byteArrayOutputStream);
            h(dataInputStream, cVar);
        } catch (Throwable th2) {
            th = th2;
            byteArrayOutputStream2 = byteArrayOutputStream;
            d(byteArrayOutputStream2);
            throw th;
        }
    }

    private void y(b bVar) throws IOException {
        String str;
        String str2;
        String str3;
        int i8;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            mediaMetadataRetriever.setDataSource(new C0130a(bVar));
            String extractMetadata = mediaMetadataRetriever.extractMetadata(33);
            String extractMetadata2 = mediaMetadataRetriever.extractMetadata(34);
            String extractMetadata3 = mediaMetadataRetriever.extractMetadata(26);
            String extractMetadata4 = mediaMetadataRetriever.extractMetadata(17);
            if ("yes".equals(extractMetadata3)) {
                str = mediaMetadataRetriever.extractMetadata(29);
                str2 = mediaMetadataRetriever.extractMetadata(30);
                str3 = mediaMetadataRetriever.extractMetadata(31);
            } else if ("yes".equals(extractMetadata4)) {
                str = mediaMetadataRetriever.extractMetadata(18);
                str2 = mediaMetadataRetriever.extractMetadata(19);
                str3 = mediaMetadataRetriever.extractMetadata(24);
            } else {
                str = null;
                str2 = null;
                str3 = null;
            }
            if (str != null) {
                this.f14805f[0].put(f14796z, d.m(Integer.parseInt(str), this.f14807h));
            }
            if (str2 != null) {
                this.f14805f[0].put(f14596A, d.m(Integer.parseInt(str2), this.f14807h));
            }
            if (str3 != null) {
                int parseInt = Integer.parseInt(str3);
                if (parseInt != 90) {
                    if (parseInt != 180) {
                        if (parseInt != 270) {
                            i8 = 1;
                        } else {
                            i8 = 8;
                        }
                    } else {
                        i8 = 3;
                    }
                } else {
                    i8 = 6;
                }
                this.f14805f[0].put(f14612E, d.m(i8, this.f14807h));
            }
            if (extractMetadata != null && extractMetadata2 != null) {
                int parseInt2 = Integer.parseInt(extractMetadata);
                int parseInt3 = Integer.parseInt(extractMetadata2);
                if (parseInt3 > 6) {
                    bVar.d(parseInt2);
                    byte[] bArr = new byte[6];
                    if (bVar.read(bArr) == 6) {
                        int i9 = parseInt2 + 6;
                        int i10 = parseInt3 - 6;
                        if (Arrays.equals(bArr, o7)) {
                            byte[] bArr2 = new byte[i10];
                            if (bVar.read(bArr2) == i10) {
                                this.f14815p = i9;
                                p0(bArr2, 0);
                            } else {
                                throw new IOException("Can't read exif");
                            }
                        } else {
                            throw new IOException("Invalid identifier");
                        }
                    } else {
                        throw new IOException("Can't read identifier");
                    }
                } else {
                    throw new IOException("Invalid exif length");
                }
            }
            if (f14792y) {
                Log.d(f14788x, "Heif meta: " + str + "x" + str2 + ", rotation " + str3);
            }
            mediaMetadataRetriever.release();
        } catch (Throwable th) {
            mediaMetadataRetriever.release();
            throw th;
        }
    }

    private void y0(InputStream inputStream, OutputStream outputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream;
        int i8;
        if (f14792y) {
            Log.d(f14788x, "saveWebpAttributes starting with (inputStream: " + inputStream + ", outputStream: " + outputStream + ")");
        }
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        b bVar = new b(inputStream, byteOrder);
        c cVar = new c(outputStream, byteOrder);
        i(bVar, cVar, b6.length);
        bVar.skipBytes(c6.length + 4);
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
            } catch (Exception e8) {
                e = e8;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            c cVar2 = new c(byteArrayOutputStream, byteOrder);
            if (this.f14815p != 0) {
                i(bVar, cVar2, (r1 - ((r13.length + 4) + r3.length)) - 8);
                bVar.skipBytes(4);
                bVar.skipBytes(bVar.readInt());
                J0(cVar2);
            } else {
                byte[] bArr = new byte[4];
                if (bVar.read(bArr) == 4) {
                    byte[] bArr2 = h6;
                    if (Arrays.equals(bArr, bArr2)) {
                        int readInt = bVar.readInt();
                        boolean z8 = true;
                        if (readInt % 2 == 1) {
                            i8 = readInt + 1;
                        } else {
                            i8 = readInt;
                        }
                        byte[] bArr3 = new byte[i8];
                        bVar.read(bArr3);
                        byte b8 = (byte) (bArr3[0] | 8);
                        bArr3[0] = b8;
                        if (((b8 >> 1) & 1) != 1) {
                            z8 = false;
                        }
                        cVar2.write(bArr2);
                        cVar2.c(readInt);
                        cVar2.write(bArr3);
                        if (z8) {
                            j(bVar, cVar2, k6, null);
                            while (true) {
                                byte[] bArr4 = new byte[4];
                                inputStream.read(bArr4);
                                if (!Arrays.equals(bArr4, l6)) {
                                    break;
                                } else {
                                    k(bVar, cVar2, bArr4);
                                }
                            }
                            J0(cVar2);
                        } else {
                            j(bVar, cVar2, j6, i6);
                            J0(cVar2);
                        }
                    } else if (Arrays.equals(bArr, j6) || Arrays.equals(bArr, i6)) {
                        throw new IOException("WebP files with only VP8 or VP8L chunks are currently not supported");
                    }
                } else {
                    throw new IOException("Encountered invalid length while parsing WebP chunk type");
                }
            }
            h(bVar, cVar2);
            int size = byteArrayOutputStream.size();
            byte[] bArr5 = c6;
            cVar.c(size + bArr5.length);
            cVar.write(bArr5);
            byteArrayOutputStream.writeTo(cVar);
            d(byteArrayOutputStream);
        } catch (Exception e9) {
            e = e9;
            byteArrayOutputStream2 = byteArrayOutputStream;
            throw new IOException("Failed to save WebP file", e);
        } catch (Throwable th2) {
            th = th2;
            byteArrayOutputStream2 = byteArrayOutputStream;
            d(byteArrayOutputStream2);
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x0195, code lost:
    
        r20.f(r19.f14807h);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x019a, code lost:
    
        return;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:30:0x00b7. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bc A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void z(androidx.exifinterface.media.a.b r20, int r21, int r22) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 536
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.a.z(androidx.exifinterface.media.a$b, int, int):void");
    }

    @Deprecated
    public boolean A(float[] fArr) {
        double[] B8 = B();
        if (B8 == null) {
            return false;
        }
        fArr[0] = (float) B8[0];
        fArr[1] = (float) B8[1];
        return true;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:52:0x01b9. Please report as an issue. */
    public void A0(@N String str, @P String str2) {
        f fVar;
        int i8;
        String str3;
        int i9;
        String str4;
        String str5 = str;
        String str6 = str2;
        if (str5 != null) {
            boolean equals = f14597A0.equals(str5);
            String str7 = f14788x;
            if (equals) {
                if (f14792y) {
                    Log.d(f14788x, "setAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
                }
                str5 = f14601B0;
            }
            int i10 = 2;
            int i11 = 1;
            if (str6 != null && l7.contains(str5)) {
                if (str5.equals(f14622G1)) {
                    Matcher matcher = Z7.matcher(str6);
                    if (!matcher.find()) {
                        Log.w(f14788x, "Invalid value for " + str5 + " : " + str6);
                        return;
                    }
                    str6 = Integer.parseInt(matcher.group(1)) + "/1," + Integer.parseInt(matcher.group(2)) + "/1," + Integer.parseInt(matcher.group(3)) + "/1";
                } else {
                    try {
                        str6 = new h(Double.parseDouble(str2)).toString();
                    } catch (NumberFormatException unused) {
                        Log.w(f14788x, "Invalid value for " + str5 + " : " + str6);
                        return;
                    }
                }
            }
            int i12 = 0;
            int i13 = 0;
            while (i13 < f7.length) {
                if ((i13 != 4 || this.f14808i) && (fVar = k7[i13].get(str5)) != null) {
                    if (str6 == null) {
                        this.f14805f[i13].remove(str5);
                    } else {
                        Pair<Integer, Integer> P8 = P(str6);
                        int i14 = -1;
                        if (fVar.f14841c != ((Integer) P8.first).intValue() && fVar.f14841c != ((Integer) P8.second).intValue()) {
                            int i15 = fVar.f14842d;
                            if (i15 != -1 && (i15 == ((Integer) P8.first).intValue() || fVar.f14842d == ((Integer) P8.second).intValue())) {
                                i8 = fVar.f14842d;
                            } else {
                                int i16 = fVar.f14841c;
                                if (i16 != i11 && i16 != 7 && i16 != i10) {
                                    if (f14792y) {
                                        StringBuilder sb = new StringBuilder();
                                        sb.append("Given tag (");
                                        sb.append(str5);
                                        sb.append(") value didn't match with one of expected formats: ");
                                        String[] strArr = I6;
                                        sb.append(strArr[fVar.f14841c]);
                                        String str8 = "";
                                        if (fVar.f14842d == -1) {
                                            str4 = "";
                                        } else {
                                            str4 = ", " + strArr[fVar.f14842d];
                                        }
                                        sb.append(str4);
                                        sb.append(" (guess: ");
                                        sb.append(strArr[((Integer) P8.first).intValue()]);
                                        if (((Integer) P8.second).intValue() != -1) {
                                            str8 = ", " + strArr[((Integer) P8.second).intValue()];
                                        }
                                        sb.append(str8);
                                        sb.append(")");
                                        Log.d(str7, sb.toString());
                                    }
                                } else {
                                    i8 = i16;
                                }
                            }
                        } else {
                            i8 = fVar.f14841c;
                        }
                        switch (i8) {
                            case 1:
                                str3 = str7;
                                i9 = i11;
                                this.f14805f[i13].put(str5, d.a(str6));
                                break;
                            case 2:
                            case 7:
                                str3 = str7;
                                i9 = i11;
                                this.f14805f[i13].put(str5, d.h(str6));
                                break;
                            case 3:
                                str3 = str7;
                                i9 = i11;
                                String[] split = str6.split(",", -1);
                                int[] iArr = new int[split.length];
                                for (int i17 = 0; i17 < split.length; i17++) {
                                    iArr[i17] = Integer.parseInt(split[i17]);
                                }
                                this.f14805f[i13].put(str5, d.n(iArr, this.f14807h));
                                break;
                            case 4:
                                str3 = str7;
                                i9 = i11;
                                String[] split2 = str6.split(",", -1);
                                long[] jArr = new long[split2.length];
                                for (int i18 = 0; i18 < split2.length; i18++) {
                                    jArr[i18] = Long.parseLong(split2[i18]);
                                }
                                this.f14805f[i13].put(str5, d.j(jArr, this.f14807h));
                                break;
                            case 5:
                                str3 = str7;
                                String[] split3 = str6.split(",", -1);
                                h[] hVarArr = new h[split3.length];
                                int i19 = 0;
                                while (i19 < split3.length) {
                                    String[] split4 = split3[i19].split("/", i14);
                                    hVarArr[i19] = new h((long) Double.parseDouble(split4[0]), (long) Double.parseDouble(split4[1]));
                                    i19++;
                                    i14 = -1;
                                }
                                i9 = 1;
                                this.f14805f[i13].put(str5, d.l(hVarArr, this.f14807h));
                                break;
                            case 6:
                            case 8:
                            case 11:
                            default:
                                if (f14792y) {
                                    Log.d(str7, "Data format isn't one of expected formats: " + i8);
                                    break;
                                }
                                break;
                            case 9:
                                str3 = str7;
                                String[] split5 = str6.split(",", -1);
                                int[] iArr2 = new int[split5.length];
                                for (int i20 = 0; i20 < split5.length; i20++) {
                                    iArr2[i20] = Integer.parseInt(split5[i20]);
                                }
                                this.f14805f[i13].put(str5, d.e(iArr2, this.f14807h));
                                i9 = 1;
                                break;
                            case 10:
                                String[] split6 = str6.split(",", -1);
                                h[] hVarArr2 = new h[split6.length];
                                int i21 = i12;
                                while (i21 < split6.length) {
                                    String[] split7 = split6[i21].split("/", -1);
                                    hVarArr2[i21] = new h((long) Double.parseDouble(split7[i12]), (long) Double.parseDouble(split7[i11]));
                                    i21++;
                                    str7 = str7;
                                    i11 = 1;
                                    i12 = 0;
                                }
                                str3 = str7;
                                this.f14805f[i13].put(str5, d.g(hVarArr2, this.f14807h));
                                i9 = 1;
                                break;
                            case 12:
                                String[] split8 = str6.split(",", -1);
                                double[] dArr = new double[split8.length];
                                for (int i22 = i12; i22 < split8.length; i22++) {
                                    dArr[i22] = Double.parseDouble(split8[i22]);
                                }
                                this.f14805f[i13].put(str5, d.c(dArr, this.f14807h));
                                break;
                        }
                        i13++;
                        i11 = i9;
                        str7 = str3;
                        i10 = 2;
                        i12 = 0;
                    }
                }
                str3 = str7;
                i9 = i11;
                i13++;
                i11 = i9;
                str7 = str3;
                i10 = 2;
                i12 = 0;
            }
            return;
        }
        throw new NullPointerException("tag shouldn't be null");
    }

    @P
    public double[] B() {
        String o8 = o(f14602B1);
        String o9 = o(f14598A1);
        String o10 = o(f14610D1);
        String o11 = o(f14606C1);
        if (o8 != null && o9 != null && o10 != null && o11 != null) {
            try {
                return new double[]{f(o8, o9), f(o10, o11)};
            } catch (IllegalArgumentException unused) {
                Log.w(f14788x, "Latitude/longitude values are not parsable. " + String.format("latValue=%s, latRef=%s, lngValue=%s, lngRef=%s", o8, o9, o10, o11));
                return null;
            }
        }
        return null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void B0(long j8) {
        A0(f14684W, q6.format(new Date(j8)));
        A0(f14776t0, Long.toString(j8 % 1000));
    }

    public void C0(Location location) {
        if (location == null) {
            return;
        }
        A0(f14702a2, location.getProvider());
        D0(location.getLatitude(), location.getLongitude());
        z0(location.getAltitude());
        A0(f14642L1, "K");
        A0(f14646M1, new h((location.getSpeed() * ((float) TimeUnit.HOURS.toSeconds(1L))) / 1000.0f).toString());
        String[] split = q6.format(new Date(location.getTime())).split("\\s+", -1);
        A0(f14710c2, split[0]);
        A0(f14622G1, split[1]);
    }

    public void D0(double d8, double d9) {
        String str;
        String str2;
        if (d8 >= -90.0d && d8 <= 90.0d && !Double.isNaN(d8)) {
            if (d9 >= -180.0d && d9 <= 180.0d && !Double.isNaN(d9)) {
                if (d8 >= l.f37524n) {
                    str = "N";
                } else {
                    str = T4;
                }
                A0(f14598A1, str);
                A0(f14602B1, e(Math.abs(d8)));
                if (d9 >= l.f37524n) {
                    str2 = U4;
                } else {
                    str2 = V4;
                }
                A0(f14606C1, str2);
                A0(f14610D1, e(Math.abs(d9)));
                return;
            }
            throw new IllegalArgumentException("Longitude value " + d9 + " is not valid.");
        }
        throw new IllegalArgumentException("Latitude value " + d8 + " is not valid.");
    }

    public int H() {
        switch (r(f14612E, 1)) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 8:
                return 270;
            case 6:
            case 7:
                return 90;
            default:
                return 0;
        }
    }

    @P
    public byte[] K() {
        int i8 = this.f14814o;
        if (i8 != 6 && i8 != 7) {
            return null;
        }
        return M();
    }

    @P
    public Bitmap L() {
        if (!this.f14808i) {
            return null;
        }
        if (this.f14813n == null) {
            this.f14813n = M();
        }
        int i8 = this.f14814o;
        if (i8 != 6 && i8 != 7) {
            if (i8 == 1) {
                int length = this.f14813n.length / 3;
                int[] iArr = new int[length];
                for (int i9 = 0; i9 < length; i9++) {
                    byte[] bArr = this.f14813n;
                    int i10 = i9 * 3;
                    iArr[i9] = (bArr[i10] << 16) + (bArr[i10 + 1] << 8) + bArr[i10 + 2];
                }
                d dVar = this.f14805f[4].get(f14596A);
                d dVar2 = this.f14805f[4].get(f14796z);
                if (dVar != null && dVar2 != null) {
                    return Bitmap.createBitmap(iArr, dVar2.p(this.f14807h), dVar.p(this.f14807h), Bitmap.Config.ARGB_8888);
                }
            }
            return null;
        }
        return BitmapFactory.decodeByteArray(this.f14813n, 0, this.f14812m);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0069 A[Catch: all -> 0x0090, Exception -> 0x0092, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0090, blocks: (B:18:0x0069, B:21:0x0079, B:23:0x0085, B:28:0x0094, B:29:0x0099, B:30:0x009a, B:31:0x009f, B:32:0x00a0, B:33:0x00a5, B:35:0x00a6), top: B:6:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a0 A[Catch: all -> 0x0090, Exception -> 0x0092, TryCatch #1 {all -> 0x0090, blocks: (B:18:0x0069, B:21:0x0079, B:23:0x0085, B:28:0x0094, B:29:0x0099, B:30:0x009a, B:31:0x009f, B:32:0x00a0, B:33:0x00a5, B:35:0x00a6), top: B:6:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b9  */
    /* JADX WARN: Type inference failed for: r1v1, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v5, types: [android.content.res.AssetManager$AssetInputStream, java.io.Closeable, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.io.Closeable, java.io.InputStream] */
    @androidx.annotation.P
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public byte[] M() {
        /*
            Method dump skipped, instructions count: 189
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.a.M():byte[]");
    }

    @P
    public long[] N() {
        if (!this.f14821v) {
            if (!this.f14808i) {
                return null;
            }
            if (this.f14809j && !this.f14810k) {
                return null;
            }
            return new long[]{this.f14811l, this.f14812m};
        }
        throw new IllegalStateException("The underlying file has been modified since being parsed");
    }

    public boolean S(@N String str) {
        if (w(str) != null) {
            return true;
        }
        return false;
    }

    public boolean T() {
        return this.f14808i;
    }

    public boolean W() {
        int r8 = r(f14612E, 1);
        if (r8 == 2 || r8 == 7 || r8 == 4 || r8 == 5) {
            return true;
        }
        return false;
    }

    public boolean i0() {
        if (!this.f14808i) {
            return false;
        }
        int i8 = this.f14814o;
        if (i8 != 6 && i8 != 7) {
            return false;
        }
        return true;
    }

    public void l() {
        int i8 = 1;
        switch (r(f14612E, 1)) {
            case 1:
                i8 = 2;
                break;
            case 2:
                break;
            case 3:
                i8 = 4;
                break;
            case 4:
                i8 = 3;
                break;
            case 5:
                i8 = 6;
                break;
            case 6:
                i8 = 5;
                break;
            case 7:
                i8 = 8;
                break;
            case 8:
                i8 = 7;
                break;
            default:
                i8 = 0;
                break;
        }
        A0(f14612E, Integer.toString(i8));
    }

    public void m() {
        int i8 = 1;
        switch (r(f14612E, 1)) {
            case 1:
                i8 = 4;
                break;
            case 2:
                i8 = 3;
                break;
            case 3:
                i8 = 2;
                break;
            case 4:
                break;
            case 5:
                i8 = 8;
                break;
            case 6:
                i8 = 7;
                break;
            case 7:
                i8 = 6;
                break;
            case 8:
                i8 = 5;
                break;
            default:
                i8 = 0;
                break;
        }
        A0(f14612E, Integer.toString(i8));
    }

    public double n(double d8) {
        double q8 = q(f14618F1, -1.0d);
        int i8 = -1;
        int r8 = r(f14614E1, -1);
        if (q8 >= l.f37524n && r8 >= 0) {
            if (r8 != 1) {
                i8 = 1;
            }
            return q8 * i8;
        }
        return d8;
    }

    @P
    public String o(@N String str) {
        if (str != null) {
            d w8 = w(str);
            if (w8 != null) {
                if (!l7.contains(str)) {
                    return w8.q(this.f14807h);
                }
                if (str.equals(f14622G1)) {
                    int i8 = w8.f14835a;
                    if (i8 != 5 && i8 != 10) {
                        Log.w(f14788x, "GPS Timestamp format is not rational. format=" + w8.f14835a);
                        return null;
                    }
                    h[] hVarArr = (h[]) w8.r(this.f14807h);
                    if (hVarArr != null && hVarArr.length == 3) {
                        h hVar = hVarArr[0];
                        Integer valueOf = Integer.valueOf((int) (((float) hVar.f14843a) / ((float) hVar.f14844b)));
                        h hVar2 = hVarArr[1];
                        Integer valueOf2 = Integer.valueOf((int) (((float) hVar2.f14843a) / ((float) hVar2.f14844b)));
                        h hVar3 = hVarArr[2];
                        return String.format("%02d:%02d:%02d", valueOf, valueOf2, Integer.valueOf((int) (((float) hVar3.f14843a) / ((float) hVar3.f14844b))));
                    }
                    Log.w(f14788x, "Invalid GPS Timestamp array. array=" + Arrays.toString(hVarArr));
                    return null;
                }
                try {
                    return Double.toString(w8.o(this.f14807h));
                } catch (NumberFormatException unused) {
                }
            }
            return null;
        }
        throw new NullPointerException("tag shouldn't be null");
    }

    @P
    public byte[] p(@N String str) {
        if (str != null) {
            d w8 = w(str);
            if (w8 != null) {
                return w8.f14838d;
            }
            return null;
        }
        throw new NullPointerException("tag shouldn't be null");
    }

    public double q(@N String str, double d8) {
        if (str != null) {
            d w8 = w(str);
            if (w8 == null) {
                return d8;
            }
            try {
                return w8.o(this.f14807h);
            } catch (NumberFormatException unused) {
                return d8;
            }
        }
        throw new NullPointerException("tag shouldn't be null");
    }

    public int r(@N String str, int i8) {
        if (str != null) {
            d w8 = w(str);
            if (w8 == null) {
                return i8;
            }
            try {
                return w8.p(this.f14807h);
            } catch (NumberFormatException unused) {
                return i8;
            }
        }
        throw new NullPointerException("tag shouldn't be null");
    }

    @P
    public long[] s(@N String str) {
        if (str != null) {
            if (!this.f14821v) {
                d w8 = w(str);
                if (w8 != null) {
                    return new long[]{w8.f14837c, w8.f14838d.length};
                }
                return null;
            }
            throw new IllegalStateException("The underlying file has been modified since being parsed");
        }
        throw new NullPointerException("tag shouldn't be null");
    }

    public void s0() {
        A0(f14612E, Integer.toString(1));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public long t() {
        return l0(o(f14684W), o(f14776t0));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public long u() {
        return l0(o(f14760p0), o(f14782v0));
    }

    public void u0(int i8) {
        if (i8 % 90 == 0) {
            int r8 = r(f14612E, 1);
            List<Integer> list = f14655O2;
            int i9 = 0;
            if (list.contains(Integer.valueOf(r8))) {
                int indexOf = (list.indexOf(Integer.valueOf(r8)) + (i8 / 90)) % 4;
                if (indexOf < 0) {
                    i9 = 4;
                }
                i9 = list.get(indexOf + i9).intValue();
            } else {
                List<Integer> list2 = f14659P2;
                if (list2.contains(Integer.valueOf(r8))) {
                    int indexOf2 = (list2.indexOf(Integer.valueOf(r8)) + (i8 / 90)) % 4;
                    if (indexOf2 < 0) {
                        i9 = 4;
                    }
                    i9 = list2.get(indexOf2 + i9).intValue();
                }
            }
            A0(f14612E, Integer.toString(i9));
            return;
        }
        throw new IllegalArgumentException("degree should be a multiple of 90");
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public long v() {
        return l0(o(f14756o0), o(f14779u0));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:13|14|(6:(2:16|(1:18)(2:71|72))(2:73|(17:75|76|77|79|80|20|21|22|(1:24)(2:63|(1:65)(1:66))|25|27|28|30|31|(1:33)(2:36|(1:38)(2:39|(1:41)))|34|35)(1:97))|30|31|(0)(0)|34|35)|19|20|21|22|(0)(0)|25|27|28) */
    /* JADX WARN: Can't wrap try/catch for region: R(13:10|(1:12)(1:102)|13|14|(6:(2:16|(1:18)(2:71|72))(2:73|(17:75|76|77|79|80|20|21|22|(1:24)(2:63|(1:65)(1:66))|25|27|28|30|31|(1:33)(2:36|(1:38)(2:39|(1:41)))|34|35)(1:97))|30|31|(0)(0)|34|35)|19|20|21|22|(0)(0)|25|27|28) */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0113, code lost:
    
        r3 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0114, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0110, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0111, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00c7, code lost:
    
        r3 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00c8, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00c3, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00c4, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bb A[Catch: all -> 0x00c3, Exception -> 0x00c7, TryCatch #13 {Exception -> 0x00c7, all -> 0x00c3, blocks: (B:22:0x00b2, B:24:0x00bb, B:25:0x00dc, B:63:0x00ca, B:65:0x00ce), top: B:21:0x00b2 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00eb A[Catch: all -> 0x00ef, Exception -> 0x00f2, TryCatch #10 {Exception -> 0x00f2, all -> 0x00ef, blocks: (B:31:0x00e6, B:33:0x00eb, B:38:0x00f9, B:41:0x0101), top: B:30:0x00e6 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ca A[Catch: all -> 0x00c3, Exception -> 0x00c7, TryCatch #13 {Exception -> 0x00c7, all -> 0x00c3, blocks: (B:22:0x00b2, B:24:0x00bb, B:25:0x00dc, B:63:0x00ca, B:65:0x00ce), top: B:21:0x00b2 }] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.io.OutputStream, java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void v0() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.a.v0():void");
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public long x() {
        String o8 = o(f14710c2);
        String o9 = o(f14622G1);
        if (o8 != null && o9 != null) {
            Pattern pattern = Y7;
            if (pattern.matcher(o8).matches() || pattern.matcher(o9).matches()) {
                try {
                    Date parse = q6.parse(o8 + ' ' + o9, new ParsePosition(0));
                    if (parse == null) {
                        return -1L;
                    }
                    return parse.getTime();
                } catch (IllegalArgumentException unused) {
                }
            }
        }
        return -1L;
    }

    public void z0(double d8) {
        String str;
        if (d8 >= l.f37524n) {
            str = com.harman.jbl.partybox.ui.effectlab.a.f43472q;
        } else {
            str = "1";
        }
        A0(f14618F1, new h(Math.abs(d8)).toString());
        A0(f14614E1, str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class f {

        /* renamed from: a, reason: collision with root package name */
        public final int f14839a;

        /* renamed from: b, reason: collision with root package name */
        public final String f14840b;

        /* renamed from: c, reason: collision with root package name */
        public final int f14841c;

        /* renamed from: d, reason: collision with root package name */
        public final int f14842d;

        f(String str, int i4, int i5) {
            this.f14840b = str;
            this.f14839a = i4;
            this.f14841c = i5;
            this.f14842d = -1;
        }

        boolean a(int i4) {
            int i5;
            int i6 = this.f14841c;
            if (i6 == 7 || i4 == 7 || i6 == i4 || (i5 = this.f14842d) == i4) {
                return true;
            }
            if ((i6 == 4 || i5 == 4) && i4 == 3) {
                return true;
            }
            if ((i6 == 9 || i5 == 9) && i4 == 8) {
                return true;
            }
            if ((i6 == 12 || i5 == 12) && i4 == 11) {
                return true;
            }
            return false;
        }

        f(String str, int i4, int i5, int i6) {
            this.f14840b = str;
            this.f14839a = i4;
            this.f14841c = i5;
            this.f14842d = i6;
        }
    }

    public a(@N String str) throws IOException {
        f[][] fVarArr = f7;
        this.f14805f = new HashMap[fVarArr.length];
        this.f14806g = new HashSet(fVarArr.length);
        this.f14807h = ByteOrder.BIG_ENDIAN;
        if (str != null) {
            U(str);
            return;
        }
        throw new NullPointerException("filename cannot be null");
    }

    public a(@N FileDescriptor fileDescriptor) throws IOException {
        boolean z8;
        FileInputStream fileInputStream;
        Throwable th;
        f[][] fVarArr = f7;
        this.f14805f = new HashMap[fVarArr.length];
        this.f14806g = new HashSet(fVarArr.length);
        this.f14807h = ByteOrder.BIG_ENDIAN;
        if (fileDescriptor != null) {
            this.f14802c = null;
            this.f14800a = null;
            if (d0(fileDescriptor)) {
                this.f14801b = fileDescriptor;
                try {
                    fileDescriptor = Os.dup(fileDescriptor);
                    z8 = true;
                } catch (Exception e8) {
                    throw new IOException("Failed to duplicate file descriptor", e8);
                }
            } else {
                this.f14801b = null;
                z8 = false;
            }
            try {
                fileInputStream = new FileInputStream(fileDescriptor);
                try {
                    k0(fileInputStream);
                    d(fileInputStream);
                    if (z8) {
                        c(fileDescriptor);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    d(fileInputStream);
                    if (z8) {
                        c(fileDescriptor);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                fileInputStream = null;
                th = th3;
            }
        } else {
            throw new NullPointerException("fileDescriptor cannot be null");
        }
    }

    public a(@N InputStream inputStream) throws IOException {
        this(inputStream, false);
    }

    public a(@N InputStream inputStream, int i8) throws IOException {
        this(inputStream, i8 == 1);
    }

    private a(@N InputStream inputStream, boolean z8) throws IOException {
        f[][] fVarArr = f7;
        this.f14805f = new HashMap[fVarArr.length];
        this.f14806g = new HashSet(fVarArr.length);
        this.f14807h = ByteOrder.BIG_ENDIAN;
        if (inputStream != null) {
            this.f14800a = null;
            if (z8) {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, E5);
                if (!V(bufferedInputStream)) {
                    Log.w(f14788x, "Given data does not follow the structure of an Exif-only data.");
                    return;
                }
                this.f14804e = true;
                this.f14802c = null;
                this.f14801b = null;
                inputStream = bufferedInputStream;
            } else if (inputStream instanceof AssetManager.AssetInputStream) {
                this.f14802c = (AssetManager.AssetInputStream) inputStream;
                this.f14801b = null;
            } else {
                if (inputStream instanceof FileInputStream) {
                    FileInputStream fileInputStream = (FileInputStream) inputStream;
                    if (d0(fileInputStream.getFD())) {
                        this.f14802c = null;
                        this.f14801b = fileInputStream.getFD();
                    }
                }
                this.f14802c = null;
                this.f14801b = null;
            }
            k0(inputStream);
            return;
        }
        throw new NullPointerException("inputStream cannot be null");
    }
}
