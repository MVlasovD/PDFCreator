package net.vlasov.pdfcreator;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Chunk {

    public static void main(String[] args) throws DocumentException, IOException, URISyntaxException {

        Path path = Paths.get(ClassLoader.getSystemResource("timelogo.png").toURI());
        Document document = new Document();
        PdfWriter.getInstance(document, new FileOutputStream("c:/temp/iTextHelloWorld.pdf"));

        document.open();
        Font font = FontFactory.getFont(FontFactory.COURIER, 16, BaseColor.BLACK);
        Paragraph chunk = new Paragraph("Hello World", font);

        Image img = Image.getInstance(path.toAbsolutePath().toString());
        document.add(img);

        document.add(chunk);
        document.close();
    }
}
