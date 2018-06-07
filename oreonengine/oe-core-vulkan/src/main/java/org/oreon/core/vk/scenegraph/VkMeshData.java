package org.oreon.core.vk.scenegraph;

import java.nio.ByteBuffer;

import org.oreon.core.scenegraph.NodeComponent;
import org.oreon.core.vk.memory.VkBuffer;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class VkMeshData extends NodeComponent{

	private VkBuffer vertexBufferObject;
	private ByteBuffer vertexBuffer;
	
	private VkBuffer indexBufferObject;
	private ByteBuffer indexBuffer;
	
	public VkMeshData(VkBuffer vertexBufferObject, ByteBuffer vertexBuffer){
		
		this.vertexBufferObject = vertexBufferObject;
		this.vertexBuffer = vertexBuffer;
	}
	
}
