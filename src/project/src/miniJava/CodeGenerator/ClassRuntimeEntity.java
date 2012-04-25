package miniJava.CodeGenerator;

public class ClassRuntimeEntity {

	public ClassRuntimeEntity(int size) {
		this.size = size;
		this.classObjectDisplacement = -1;
		this.isClassObjectEmitted = false;
	}

	public int size;
	public int classObjectDisplacement;
	boolean isClassObjectEmitted;
}
