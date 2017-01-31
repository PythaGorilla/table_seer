package com.company;
import edu.psu.seersuite.extractors.tableextractor.extraction.TableExtractor;
import edu.psu.seersuite.extractors.tableextractor.extraction.PdfBoxParser;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {

        TableExtractor extractor = new TableExtractor(); // create a TableExtractor object
        PdfBoxParser new_paser = new PdfBoxParser();
        extractor.setParser(new_paser); //set the PDF parser, here parser has two options now: PDFBox or TET. Other new parsers can be added easily.
        File pdfpathfile = new File("H:/WareHouse/WikiNet/tabula-python-project/pdf/case1_p13.pdf");
        ArrayList extractedTableSet = extractor.extract(pdfpathfile, "H:/WareHouse/WikiNet/table_extraction/table_seer/test.xml");
    }
}
