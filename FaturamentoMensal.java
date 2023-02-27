import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class FaturamentoMensal {

    public static void main(String[] args) {
        try {
            File file = new File("dados.xml");

            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(file);

            doc.getDocumentElement().normalize();

            NodeList nodeList = doc.getElementsByTagName("dia");

            double[] faturamento = new double[nodeList.getLength()];

            for (int i = 0; i < nodeList.getLength(); i++) {
                Element element = (Element) nodeList.item(i);
                faturamento[i] = Double.parseDouble(element.getTextContent());
            }

            double menorValor = faturamento[0];
            double maiorValor = faturamento[0];
            double somaFaturamento = 0;
            int numDiasSuperioresMedia = 0;

            for (int i = 0; i < faturamento.length; i++) {
                if (faturamento[i] < menorValor) {
                    menorValor = faturamento[i];
                }
                if (faturamento[i] > maiorValor) {
                    maiorValor = faturamento[i];
                }
                somaFaturamento += faturamento[i];
            }

            double media = somaFaturamento / faturamento.length;

            for (int i = 0; i < faturamento.length; i++) {
                if (faturamento[i] > media) {
                    numDiasSuperioresMedia++;
                }
            }

            System.out.println("Menor valor de faturamento: " + menorValor);
            System.out.println("Maior valor de faturamento: " + maiorValor);
            System.out.println("Número de dias com faturamento superior à média mensal: " + numDiasSuperioresMedia);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
