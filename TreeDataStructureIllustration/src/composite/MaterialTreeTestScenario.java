package composite;

import data.MaterialDb;
import data.MaterialDb.MaterialRecord;

import java.util.Iterator;
import java.util.TreeSet;

public class MaterialTreeTestScenario {

	/*
	 * driver scenario to be used for week 5 on the Composite Pattern
	 * Just un-comment the code in main to make your test scenario.
	 * It requires that you create some things not yet given to you.
	 */
	public static void main(String [] args) {
		
		MaterialTreeCampus<String> tree = new MaterialTreeCampus<>();
		tree.parent=null;
		Iterator<MaterialRecord> it = MaterialDb.getMaterialsList();

		// create the tree from the database records
		while (it.hasNext()){
			MaterialRecord mr = it.next();
			tree.insertMaterialRecord(mr);
                }
		
		// echo the tree structure
		System.out.println("Here is the tree structure");
                System.out.println(tree);
		
		// this code should print out all the materials
		// in alphabetic order and each listed 1 time
		System.out.println("\nList of materials:");
                
                // CHANGED for ITERATOR AND COMPOSITE IMPLEMENTATION
                // MaterialTree provides a static accumulation of materials added
                // in TreeSet form.  It is used here for simplicity
                TreeSet<String> materials = MaterialTree.materials; 
                
                // Iterator class deployed by using the iterator() method
		Iterator<String> sit = materials.iterator();
		while (sit.hasNext()){
			System.out.println(sit.next());
		}
		
	}	
}