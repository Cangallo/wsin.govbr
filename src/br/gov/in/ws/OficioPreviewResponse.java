
package br.gov.in.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="out" type="{http://data.xfire.ws.incom}ValidacaoPreview"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "out"
})
@XmlRootElement(name = "OficioPreviewResponse", namespace = "http://xfire.ws.incom")
public class OficioPreviewResponse {

    @XmlElement(namespace = "http://xfire.ws.incom", required = true)
    protected ValidacaoPreview out;

    /**
     * Obtém o valor da propriedade out.
     * 
     * @return
     *     possible object is
     *     {@link ValidacaoPreview }
     *     
     */
    public ValidacaoPreview getOut() {
        return out;
    }

    /**
     * Define o valor da propriedade out.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidacaoPreview }
     *     
     */
    public void setOut(ValidacaoPreview value) {
        this.out = value;
    }

}
