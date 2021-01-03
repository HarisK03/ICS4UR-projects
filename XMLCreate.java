/**
 * ICS4UR Computer Science, 12 
 * Brampton, Canada
 *
 * https://github.com/HarisK03/
 * https://repl.it/@HarisKamal
 *
 * modified     20201029
 * date         20201028
 * @filename	XMLCreate.java
 * @author      hkamal
 * @version     1.0
 * @see         XMLCreate program Assignment 3.5.2 - create and modify XML file in Java
 */

import java.io.*;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.*;
import org.xml.sax.*;

public class XMLCreate {
    
    public static void main(String[] args) {
        // create xml
        try {
            OutputStream fout= new FileOutputStream("information.xml");
            OutputStream bout= new BufferedOutputStream(fout);
            OutputStreamWriter out = new OutputStreamWriter(bout, "8859_1");

            out.write("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?>\r\n");
            out.write("<schedule>\r\n");
            out.write("<course>\r\n");
            out.write("<code>ICS4U</code>\r\n");
            out.write("<description>Computer Programming, Grade 12, University</description>\r\n");
            out.write("<teacher>Teacher A</teacher>\r\n");
            out.write("<fileType>Unmodified</fileType>\r\n");
            out.write("</course>\r\n");
            out.write("<course>\r\n");
            out.write("<code>FSF4U</code>\r\n");
            out.write("<description>Core French, Grade 12, University</description>\r\n");
            out.write("<teacher>Teacher B</teacher>\r\n");
            out.write("<fileType>Unmodified</fileType>\r\n");
            out.write("</course>\r\n");
            out.write("<course>\r\n");
            out.write("<code>ENG4U</code>\r\n");
            out.write("<description>English, Grade 12, University</description>\r\n");
            out.write("<teacher>Teacher C</teacher>\r\n");
            out.write("<fileType>Unmodified</fileType>\r\n");
            out.write("</course>\r\n");
            out.write("</schedule>\r\n");
            out.flush(); 
            out.close();
          }
        catch (UnsupportedEncodingException e) {
            System.out.println("This VM does not support the Latin-1 character set.");
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
        
        // modify xml
        try {
            String filepath = "information.xml";
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            Document doc = docBuilder.parse(filepath);

            Node course1 = doc.getElementsByTagName("course").item(0);
            Node course2 = doc.getElementsByTagName("course").item(1);
            Node course3 = doc.getElementsByTagName("course").item(2);
            
            Element schoolBoard1 = doc.createElement("schoolBoard");
            schoolBoard1.appendChild(doc.createTextNode("Peel District School Board"));
            course1.appendChild(schoolBoard1);
            course1.appendChild(doc.createTextNode("\n"));
            Element schoolBoard2 = doc.createElement("schoolBoard");
            schoolBoard2.appendChild(doc.createTextNode("Peel District School Board"));
            course2.appendChild(schoolBoard2);
            course2.appendChild(doc.createTextNode("\n"));
            Element schoolBoard3 = doc.createElement("schoolBoard");
            schoolBoard3.appendChild(doc.createTextNode("Peel District School Board"));
            course3.appendChild(schoolBoard3);
            course3.appendChild(doc.createTextNode("\n"));
            
            Node a = doc.getElementsByTagName("teacher").item(0);
            Node b = doc.getElementsByTagName("teacher").item(1);
            Node c = doc.getElementsByTagName("teacher").item(2);
            a.setTextContent("Mr. So");
            b.setTextContent("Mr. Alves");
            c.setTextContent("Mme. Pepper");
            
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result =  new StreamResult(new File(filepath));
            transformer.transform(source, result);

            // src: https://stackoverflow.com/questions/139076/how-to-pretty-print-xml-from-java
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
            StreamResult resultOut = new StreamResult(new StringWriter());
            transformer.transform(source, resultOut);
            String xmlString = resultOut.getWriter().toString();
            System.out.println(xmlString);
            
        } catch(ParserConfigurationException pce) {
            pce.printStackTrace();
        } catch(TransformerException tfe) {
            tfe.printStackTrace();
        } catch(IOException ioe) {
            ioe.printStackTrace();
        } catch(SAXException sae) {
            sae.printStackTrace();
        }
    }
}


