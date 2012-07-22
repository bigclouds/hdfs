package com.hdfs.file.dao;

import java.util.List;
import com.hdfs.file.bean.HdfsFile;
import com.hdfs.file.bean.HdfsMemory;
import com.hdfs.user.bean.Users;



public interface fileDao {


	
	public List<HdfsFile> listFile (long currentId, long userId);
	
	/**
	 * 根据目录id，返回目录的url
	 * @param fileId 目录id
	 * @return
	 */
	public String getFileUrl(long fileId );
	
	/**
	 * 新增文件
	 * @param file
	 * @return
	 */
	
	public List<HdfsFile> listAllFile();
	
	public boolean setSafeLevel(short level,String filePath);
	
	public boolean deleteMemory(int memoryId);
	
	public boolean insertMemory(HdfsMemory memory);
		
	public void updateMemory(HdfsMemory memory);
	
	public HdfsMemory saveMemory(HdfsMemory memory);
	
	public boolean insertFile(HdfsFile file);
	
	public HdfsMemory findMemory(int memoryId);
	
	/**
	 * 根据文件Id删除文件
	 * @param fileId
	 * @return
	 */
    public boolean deleteFile(long fileId);
    
    /**
     * 删除所有路径以startpath开头的文件
     * @param startpath
     * @return
     */
    public boolean deleteFiles(String startpath);
    
    /**
     * 根据fileid查得对应的file记录
     * @param fileId
     * @return
     */
    public HdfsFile findFile(long fileId);
    
    public HdfsMemory getMemory(int memoryId);

	public HdfsMemory find (long memoryId);
	
	public int deleteFilesmem(String startpath);
	
	
}