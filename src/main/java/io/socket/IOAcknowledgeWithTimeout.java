package io.socket;

/**
 * The interface acknowledge that supports timeout
 * @author pjf
 *
 */
public interface IOAcknowledgeWithTimeout extends IOAcknowledge {
	
	/**
	 * Returns the desired timeout for the message
	 * @return timeout in ms
	 */
	long getTimeout();
	
	/**
	 * Called when the acknowledgement does not arrive in time 
	 */
	void timeout();

}
