/*
 *                    BioJava development code
 *
 * This code may be freely distributed and modified under the
 * terms of the GNU Lesser General Public Licence.  This should
 * be distributed with the code.  If you do not have a copy,
 * see:
 *
 *      http://www.gnu.org/copyleft/lesser.html
 *
 * Copyright for this code is held jointly by the individual
 * authors.  These should be listed in @author doc comments.
 *
 * For more information on the BioJava project and its aims,
 * or to join the biojava-l mailing list, visit the home page
 * at:
 *
 *      http://www.biojava.org/
 *
 */
package org.biojava.nbio.core.sequence.reference;

/**
 * For Genbank format file only.
 *
 * @since 5.0.0
 * @Author Jim Tang
 */
public class GenbankReference extends AbstractReference {
	
	// The number of the reference in the listing of references
    private String number;
    
    // The bases in the sequence the reference refers to
    private String bases;
    
    // String with all of the authors
    private String authors;
    
    // Consortium the authors belong to
    private String consortium;
    
    // The title of the reference
    private String title;
    
    // Information about the journal where the reference appeared
    private String journal;
    
    // The medline id for the reference
    private String medlineId;
    
    // The pubmed_id for the reference
    private String pubmedId; 
    
    // Free-form remarks about the reference
    private String remark;
    
    public String getNumber() {
		return number;
	}

	public void setNumber(String string) {
		this.number = string;
	}

	public String getBases() {
		return bases;
	}

	public void setBases(String bases) {
		this.bases = bases;
	}

	public String getConsortium() {
		return consortium;
	}

	public void setConsortium(String consortium) {
		this.consortium = consortium;
	}

	public String getMedlineId() {
		return medlineId;
	}

	public void setMedlineId(String medlineId) {
		this.medlineId = medlineId;
	}

	public String getPubmedId() {
		return pubmedId;
	}

	public void setPubmedId(String pubmedId) {
		this.pubmedId = pubmedId;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Override
	public String getAuthors() {
		return authors;
	}

	@Override
	public void setAuthors(String authors) {
		this.authors = authors;
	}

	@Override
	public String getTitle() {
		return title;
	}

	@Override
	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String getJournal() {
		return journal;
	}

	@Override
	public void setJournal(String journal) {
		this.journal = journal;
	}
}
